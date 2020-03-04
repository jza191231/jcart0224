package io.jza.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.jza.jcartstoreback.dto.out.ProductListOutDTO;
import io.jza.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jza.jcartstoreback.po.Product;


public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
