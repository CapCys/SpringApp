package com.huntfishcode.service;

import java.util.List;

import com.huntfishcode.model.Customer;

public interface CustomerService {

    List<Customer> findAll();
}