package io.jza.jcartstoreback.service;

import io.jza.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
