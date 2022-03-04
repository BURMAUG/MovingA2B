package com.example.moving2.admin;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor @ToString
public class Workers {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long worker_id;
    private String worker_name;

    public static void main(String[] args) {
        Date na = new Date();
        System.out.println(na);
    }
}
