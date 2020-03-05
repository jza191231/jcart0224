package io.jza.jcartadministrationback.service.impl;

import io.jza.jcartadministrationback.dao.AddressMapper;
import io.jza.jcartadministrationback.po.Address;
import io.jza.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addresses = addressMapper.selectByCustomerId(customerId);

        return addresses;
    }
}
