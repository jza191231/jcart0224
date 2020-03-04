package io.jza.jcartstoreback.controller;


import io.jza.jcartstoreback.dto.in.AddressCreateInDTO;
import io.jza.jcartstoreback.dto.in.AddressUpdateInDTO;
import io.jza.jcartstoreback.dto.out.AddressListOutDTO;
import io.jza.jcartstoreback.po.Address;
import io.jza.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getCustomerAddress")
    public List<AddressListOutDTO> getCustomerAddress(@RequestAttribute Integer customerId){
        List<Address> addresses = addressService.getByCustomerId(customerId);
        List<AddressListOutDTO> addressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setTag(address.getTag());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setContent(address.getContent());
            return addressListOutDTO;
        }).collect(Collectors.toList());
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){

        Address address = new Address();
        address.setCustomerId(customerId);
        address.setTag(addressCreateInDTO.getTag());
        address.setReceiverName(addressCreateInDTO.getReceiverName());
        address.setReceiverMobile(addressCreateInDTO.getReceiverMobile());
        address.setContent(addressCreateInDTO.getContent());

        addressService.create(address);
        Integer addressId = address.getAddressId();
        return addressId;
    }

    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer addressId){
        addressService.delete(addressId);
    }

}
