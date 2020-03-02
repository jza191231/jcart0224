package io.jza.jcartstoreback.service.impl;

import com.github.pagehelper.Page;

import io.jza.jcartstoreback.dao.ProductDetailMapper;
import io.jza.jcartstoreback.dao.ProductMapper;
import io.jza.jcartstoreback.dto.out.ProductListOutDTO;
import io.jza.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jza.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public ProductShowOutDTO getById(Integer productId) {

        return null;
    }

    @Override
    public Page<ProductListOutDTO> search(Integer pageNum) {
        return null;
    }
}
