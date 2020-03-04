package io.jza.jcartstoreback.controller;

import com.github.pagehelper.Page;
import io.jza.jcartstoreback.dto.in.ProductSearchInDTO;
import io.jza.jcartstoreback.dto.out.PageOutDTO;
import io.jza.jcartstoreback.dto.out.ProductListOutDTO;
import io.jza.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jza.jcartstoreback.po.Product;
import io.jza.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        Page<ProductListOutDTO> page = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public Product getById(@RequestParam Integer productId){
        Product product = productService.getById(productId);
        return product;
    }

}
