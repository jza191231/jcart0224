package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dto.out.OrderListOutDTO;
import io.jza.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page <OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
