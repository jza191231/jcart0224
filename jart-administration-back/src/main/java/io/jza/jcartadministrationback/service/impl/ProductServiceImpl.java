package io.jza.jcartadministrationback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dao.ProductDetailMapper;
import io.jza.jcartadministrationback.dao.ProductMapper;
import io.jza.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.jza.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.jza.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jza.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.jza.jcartadministrationback.po.Product;
import io.jza.jcartadministrationback.po.ProductDetail;
import io.jza.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    @Transactional
    public Integer create(ProductCreateInDTO productCreateInDTO) {
        Product product = new Product();
        product.setProductCode(productCreateInDTO.getProductCode());
        product.setProductName(productCreateInDTO.getProductName());
        product.setPrice(productCreateInDTO.getPrice());
        product.setDiscount(productCreateInDTO.getDiscount());
        product.setStockQuantity(productCreateInDTO.getStockQuantity());
        product.setStatus(productCreateInDTO.getStatus());
        product.setMainPicUrl(productCreateInDTO.getMainPicUrl());
        product.setRewordPoints(productCreateInDTO.getRewordPoints());
        product.setSortOrder(productCreateInDTO.getSortOrder());
        String description = productCreateInDTO.getDescription();
        String productAbstrat = description.substring(0, Math.min(100, description.length()));
        product.setProductAbstract(productAbstrat);
        productMapper.insertSelective(product);

        Integer productId = product.getProductId();
        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productId);
        productDetail.setDescription(productCreateInDTO.getDescription());
        List<String> otherPicUrls = productCreateInDTO.getOtherPicUrls();
        productDetail.setOtherPicUrls(JSON.toJSONString(otherPicUrls));
        productDetailMapper.insertSelective(productDetail);
        return productId;
    }

    @Override
    public void update(ProductUpdateInDTO productUpdateInDTO) {

    }

    @Override
    public void delete(Integer productId) {

    }

    @Override
    public void batchDelete(List<Integer> productIds) {

    }

    @Override
    public Page<ProductListOutDTO> search(Integer pageNum) {
        return null;
    }

    @Override
    public ProductShowOutDTO getById(Integer productId) {
        return null;
    }
}
