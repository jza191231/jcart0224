package io.jza.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.jza.jcartadministrationback.dao.OrderDetailMapper;
import io.jza.jcartadministrationback.dao.OrderMapper;
import io.jza.jcartadministrationback.dto.out.OrderListOutDTO;
import io.jza.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page = orderMapper.search();
        return page;
    }
}
