package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {

    Page <OrderListOutDTO> search(Integer pageNum);
}
