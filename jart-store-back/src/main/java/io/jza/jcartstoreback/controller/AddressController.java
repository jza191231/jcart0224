package io.jza.jcartstoreback.controller;


import io.jza.jcartstoreback.dto.in.AddressCreateInDTO;
import io.jza.jcartstoreback.dto.in.AddressUpdateInDTO;
import io.jza.jcartstoreback.dto.out.AddressListOutDTO;
import io.jza.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getCustomerAddress")
    public List<AddressListOutDTO> getCustomerAddress(@RequestAttribute Integer customerId){
       return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){

        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer addressId){
        addressService.delete(addressId);
    }

}
