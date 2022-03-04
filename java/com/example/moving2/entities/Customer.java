package com.example.moving2.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private transient Address pick_up;
    private transient Address drop_off;

    public Customer(String first_name,
                    String last_name,
                    String email,
                    Address pick_up,
                    Address drop_off)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.pick_up = pick_up;
        this.drop_off = drop_off;
    }


}
