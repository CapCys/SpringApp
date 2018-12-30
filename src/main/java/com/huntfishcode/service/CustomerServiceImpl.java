package com.huntfishcode.service;

import java.util.List;

import com.huntfishcode.model.Customer;
import com.huntfishcode.repository.CustomerRepository;
import com.huntfishcode.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}