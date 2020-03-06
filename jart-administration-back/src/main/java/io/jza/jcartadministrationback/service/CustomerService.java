package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.jza.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
