package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.jza.jcartadministrationback.dto.out.OrderListOutDTO;
import io.jza.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page <OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
