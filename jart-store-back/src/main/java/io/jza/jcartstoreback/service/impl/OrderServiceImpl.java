package io.jza.jcartstoreback.service.impl;

import com.alibaba.fastjson.JSON;
import io.jza.jcartstoreback.dao.OrderDetailMapper;
import io.jza.jcartstoreback.dao.OrderMapper;
import io.jza.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jza.jcartstoreback.dto.in.OrderProductInDTO;
import io.jza.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jza.jcartstoreback.enumeration.OrderStatus;
import io.jza.jcartstoreback.po.Address;
import io.jza.jcartstoreback.po.Order;
import io.jza.jcartstoreback.po.OrderDetail;
import io.jza.jcartstoreback.po.Product;
import io.jza.jcartstoreback.service.AddressService;
import io.jza.jcartstoreback.service.OrderService;
import io.jza.jcartstoreback.service.ProductService;
import io.jza.jcartstoreback.vo.OrderProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private ProductService productService;
    @Autowired
    private AddressService addressService;

    @Override
    @Transactional
    public Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId) {
        List<OrderProductInDTO> orderProductInDTOS = orderCheckoutInDTO.getOrderProducts();
        List<OrderProductVo> orderProductVos = orderProductInDTOS.stream().map(orderProductInDTO -> {
            Product orderProduct = productService.getById(orderProductInDTO.getProductId());
            OrderProductVo orderProductVo = new OrderProductVo();
            orderProductVo.setProductId(orderProduct.getProductId());
            orderProductVo.setProductCode(orderProduct.getProductCode());
            orderProductVo.setProductName(orderProduct.getProductName());
            Integer quantity = orderProductInDTO.getQuantity();
            orderProductVo.setQuantity(quantity);
            Double unitPrice = orderProduct.getPrice() * orderProduct.getDiscount();
            orderProductVo.setUnitPrice(unitPrice);
            Double totalPrice = unitPrice * quantity;
            orderProductVo.setTotalPrice(totalPrice);
            Integer unitRewordPoints = orderProduct.getRewordPoints();
            orderProductVo.setUnitRewordPoints(unitRewordPoints);
            Integer totalRewordPoints =unitRewordPoints * quantity;
            orderProductVo.setTotalRewordPoints(totalRewordPoints);
            return orderProductVo;
        }).collect(Collectors.toList());
        double AllTotalPrice = orderProductVos.stream().mapToDouble(p -> p.getTotalPrice()).sum();
        int AllTotalRewordPoints = orderProductVos.stream().mapToInt(p -> p.getTotalRewordPoints()).sum();
        Order order = new Order();
        order.setCustomerId(customerId);
        order.setStatus((byte) OrderStatus.ToProcess.ordinal());
        order.setTotalPrice(AllTotalPrice);
        order.setRewordPoints(AllTotalRewordPoints);
        Date now = new Date();
        order.setCreateTime(now);
        order.setUpdateTime(now);
        orderMapper.insertSelective(order);
        Long orderId = order.getOrderId();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(orderId);
        orderDetail.setShipMethod(orderCheckoutInDTO.getShipMethod());
        //todo calculate ship price with ship method
        orderDetail.setShipPrice(5.0);
        Address shipAddress = addressService.getById(orderCheckoutInDTO.getShipAddressId());

        orderDetail.setShipAddress(shipAddress.getContent());
        orderDetail.setPayMethod(orderCheckoutInDTO.getPayMethod());
        orderDetail.setInvoicePrice(AllTotalPrice);
        Address invoiceAddress = addressService.getById(orderCheckoutInDTO.getInvoiceAddressId());
        orderDetail.setInvoiceAddress(invoiceAddress.getContent());
        orderDetail.setComment(orderCheckoutInDTO.getComment());
        orderDetail.setOrderProducts(JSON.toJSONString(orderProductVos));
        orderDetailMapper.insertSelective(orderDetail);
        return orderId;
    }
}