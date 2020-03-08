package io.jza.jcartstoreback.service.impl;

import io.jza.jcartstoreback.dao.ReturnMapper;
import io.jza.jcartstoreback.po.Return;
import io.jza.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return aReturn) {
        returnMapper.insertSelective(aReturn);
        Integer returnId = aReturn.getReturnId();
        return returnId;
    }
}
