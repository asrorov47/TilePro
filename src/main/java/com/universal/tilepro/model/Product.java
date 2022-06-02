package com.universal.tilepro.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("products"))
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Integer rate;

    private Boolean visible;

    private String productType;//TODO:type deb quyilganakan men String qildim surash kerak

    private String status;

    private Double height;

    private Double wodth;

    private Integer imageId;




}
