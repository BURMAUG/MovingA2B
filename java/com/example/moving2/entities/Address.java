package com.example.moving2.entities;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address{
    private String address;
    private String city;
    private String state;
    private int zip_code;
}
