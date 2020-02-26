package io.jza.jcartadministrationback.controller;


import io.jza.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.jza.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.jza.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.jza.jcartadministrationback.dto.out.PageOutDTO;
import io.jza.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jza.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.jza.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return productService.create(productCreateInDTO);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
