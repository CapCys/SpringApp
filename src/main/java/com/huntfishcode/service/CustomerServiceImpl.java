package com.huntfishcode.service;

import java.util.List;

import com.huntfishcode.model.Customer;
import com.huntfishcode.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //
    // @param customerRepository the customerRepository to set
    //
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}