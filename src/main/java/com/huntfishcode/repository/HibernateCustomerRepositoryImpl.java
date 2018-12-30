package com.huntfishcode.repository;

import java.util.ArrayList;
import java.util.List;

import com.huntfishcode.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Art");
        customer.setLastname("VandeLay");

        customers.add(customer);

        return customers;
    }
}