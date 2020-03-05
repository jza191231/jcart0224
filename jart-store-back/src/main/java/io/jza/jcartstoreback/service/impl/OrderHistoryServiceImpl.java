package io.jza.jcartstoreback.service.impl;


import io.jza.jcartstoreback.dao.OrderHistoryMapper;
import io.jza.jcartstoreback.po.OrderHistory;
import io.jza.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }
}
