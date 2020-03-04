package io.jza.jcartstoreback.service;

import io.jza.jcartstoreback.dto.in.OrderCheckoutInDTO;

public interface OrderService {

    Long checkout (OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId);

}
