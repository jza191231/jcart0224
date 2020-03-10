package io.jza.jcartstoreback.service;

import io.jza.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.jza.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

    Customer getByEmail(String email);
}
