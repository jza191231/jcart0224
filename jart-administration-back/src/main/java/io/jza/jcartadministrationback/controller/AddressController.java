package io.jza.jcartadministrationback.controller;

import io.jza.jcartadministrationback.dto.out.AddressListOutDTO;
import io.jza.jcartadministrationback.dto.out.AddressShowOutDTO;
import io.jza.jcartadministrationback.po.Address;
import io.jza.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        List<Address> addresses = addressService.getByCustomerId(customerId);
        List<AddressListOutDTO> AddressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setTag(address.getTag());
            addressListOutDTO.setContent(address.getContent());
            return addressListOutDTO;
        }).collect(Collectors.toList());
        return AddressListOutDTOS;
    }

    @GetMapping("/getById")
    public AddressShowOutDTO getById(Integer addressId){
        Address address = addressService.getById(addressId);
        AddressShowOutDTO addressShowOutDTO = new AddressShowOutDTO();
        addressShowOutDTO.setAddressId(address.getAddressId());
        addressShowOutDTO.setReceiverName(address.getReceiverName());
        addressShowOutDTO.setReceiverMobile(address.getReceiverMobile());
        addressShowOutDTO.setContent(address.getContent());
        addressShowOutDTO.setTag(address.getTag());
        return addressShowOutDTO;
    }
}
