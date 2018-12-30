package com.huntfishcode.repository;

import java.util.List;

import com.huntfishcode.model.Customer;

public interface CustomerRepository {
    List<Customer> findAll();
}