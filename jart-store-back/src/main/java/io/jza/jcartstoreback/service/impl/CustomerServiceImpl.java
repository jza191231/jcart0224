package io.jza.jcartstoreback.service.impl;

import io.jza.jcartstoreback.dao.CustomerMapper;
import io.jza.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.jza.jcartstoreback.po.Customer;
import io.jza.jcartstoreback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Integer register(CustomerRegisterInDTO customerRegisterInDTO) {

        return null;
    }

    @Override
    public Customer getByUsername(String username) {

        return null;
    }

    @Override
    public Customer getById(Integer customerId) {

        return null;
    }

    @Override
    public void update(Customer customer) {

    }
}
