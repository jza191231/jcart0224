package io.jza.jcartstoreback.service;

import io.jza.jcartstoreback.po.Address;

import java.util.List;

public interface AddressService {

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}
