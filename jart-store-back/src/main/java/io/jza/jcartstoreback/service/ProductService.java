package io.jza.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.jza.jcartstoreback.dto.out.ProductListOutDTO;
import io.jza.jcartstoreback.dto.out.ProductShowOutDTO;


public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
