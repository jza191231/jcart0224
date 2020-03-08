package io.jza.jcartstoreback.service.impl;

import io.jza.jcartstoreback.dao.OrderHistoryMapper;
import io.jza.jcartstoreback.dao.ReturnHistoryMapper;
import io.jza.jcartstoreback.po.OrderHistory;
import io.jza.jcartstoreback.po.ReturnHistory;
import io.jza.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> selectByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);
        return returnHistories;
    }
}
