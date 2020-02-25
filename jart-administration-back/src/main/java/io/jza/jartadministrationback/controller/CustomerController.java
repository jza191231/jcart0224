package io.jza.jartadministrationback.controller;

import io.jza.jartadministrationback.dto.in.CustomerSearchInDTO;
import io.jza.jartadministrationback.dto.out.CustomerListOutDTO;
import io.jza.jartadministrationback.dto.out.CustomerShowOutDTO;
import io.jza.jartadministrationback.dto.out.PageOutDTO;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
