package com.universal.tilepro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("users"))
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    private String email;

    private String password;

    private String contact;

    private Integer imageId;

    private String status;

    private String userRole;//TODO:type deb quyilaganak String qildim Surash kerak

    private Integer addressId;







}
