package io.jza.jcartadministrationback.service.impl;

import io.jza.jcartadministrationback.dao.AddressMapper;
import io.jza.jcartadministrationback.po.Address;
import io.jza.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}
