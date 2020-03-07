package io.jza.jcartadministrationback.service;

import io.jza.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);
}
