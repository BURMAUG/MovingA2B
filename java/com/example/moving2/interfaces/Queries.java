package com.example.moving2.interfaces;

import com.example.moving2.entities.Customer;

public interface Queries {
    Customer getCustomers();
    java.util.List<Customer> findAllCustomers();
}