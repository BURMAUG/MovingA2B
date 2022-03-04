package com.example.moving2.repository;

import com.example.moving2.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID>{
    /**
     * This is how the user will access there item on the website.
     */
    Customer findCustomerByCustomer_id(UUID customer_id);
    @Override
    Iterable<Customer> findAll();
}
