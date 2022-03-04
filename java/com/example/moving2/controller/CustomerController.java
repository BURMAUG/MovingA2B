package com.example.moving2.controller;

import com.example.moving2.entities.Customer;
import com.example.moving2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(name = "/customer")
    private java.util.List<Customer> getAllNames(){
        return (List<Customer>) customerRepository.findAll();
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id)
    {
        return customerRepository.findCustomerByCustomer_id(UUID.fromString(id));
    }
}
