package com.example.moving2;

import com.example.moving2.entities.Address;
import com.example.moving2.entities.Customer;
import com.example.moving2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Moving2Application {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Moving2Application.class, args);
    }

    @Bean
    CommandLineRunner runner()
    {
        return args -> customerRepository.save(
                new Customer("Burmau", "Garba","burmaud1@gmail.com",
                new Address(), new Address()));
    }
}
