package io.jza.jcartstoreback.service.impl;


import io.jza.jcartstoreback.dao.AddressMapper;
import io.jza.jcartstoreback.po.Address;
import io.jza.jcartstoreback.service.AddressService;
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

    @Override
    public Integer create(Address address) {
        addressMapper.insertSelective(address);
        Integer addressId = address.getAddressId();
        return addressId;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Integer addressId) {

    }
}
