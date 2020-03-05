package io.jza.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.jza.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jza.jcartstoreback.dto.out.OrderShowOutDTO;
import io.jza.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout (OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
