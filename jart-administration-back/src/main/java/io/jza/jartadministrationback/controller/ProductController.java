package io.jza.jartadministrationback.controller;


import io.jza.jartadministrationback.dto.in.ProductCreateInDTO;
import io.jza.jartadministrationback.dto.in.ProductSearchInDTO;
import io.jza.jartadministrationback.dto.in.ProductUpdateInDTO;
import io.jza.jartadministrationback.dto.out.PageOutDTO;
import io.jza.jartadministrationback.dto.out.ProductListOutDTO;
import io.jza.jartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

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
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
