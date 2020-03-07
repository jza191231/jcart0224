package io.jza.jcartadministrationback.controller;

import io.jza.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.jza.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import io.jza.jcartadministrationback.po.OrderHistory;
import io.jza.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        List<OrderHistory> orderHistoies = orderHistoryService.getByOrderId(orderId);
        List<OrderHistoryListOutDTO> orderHistoryListOutDTOS = orderHistoies.stream().map(orderHistory -> {
            OrderHistoryListOutDTO orderHistoryListOutDTO = new OrderHistoryListOutDTO();
            orderHistoryListOutDTO.setOrderHistoryId(orderHistory.getOrderHistoryId());
            orderHistoryListOutDTO.setTimestamp(orderHistory.getTime().getTime());
            orderHistoryListOutDTO.setOrderStatus(orderHistory.getOrderStatus());
            orderHistoryListOutDTO.setComment(orderHistory.getComment());
            orderHistoryListOutDTO.setCustomerNotified(orderHistory.getCustomerNotified());
            return orderHistoryListOutDTO;
        }).collect(Collectors.toList());
        return orderHistoryListOutDTOS;
    }

    @PostMapping("/create")
    public Long create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setOrderId(orderHistoryCreateInDTO.getOrderId());
        orderHistory.setTime(new Date());
        orderHistory.setOrderStatus(orderHistoryCreateInDTO.getOrderStatus());
        orderHistory.setComment(orderHistoryCreateInDTO.getComment());
        orderHistory.setCustomerNotified(orderHistoryCreateInDTO.getCustomerNotified());

        Long orderHistoryId = orderHistoryService.create(orderHistory);
        return orderHistoryId;
    }

}
