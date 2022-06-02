package com.universal.tilepro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("addresses"))
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String region;

    private String city;

    private String district;

    private String Street;

    private Integer Home;




}
