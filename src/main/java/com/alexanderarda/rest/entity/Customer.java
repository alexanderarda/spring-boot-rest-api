package com.alexanderarda.rest.entity;


import lombok.Data;

import javax.persistence.*;

@Entity //Untuk Memberikan Identitas Data yang mengakses ke Database
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // AutoIncrement
    private Long id;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_address")
    private String custAddress;

}
