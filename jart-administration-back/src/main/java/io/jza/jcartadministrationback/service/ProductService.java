package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.jza.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.jza.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.jza.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jza.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
