package com.universal.tilepro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("orderItems"))
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String order;//TODO:type deb qo`yilgan men String qildim So`rash kerak

    private String product;//TODO:type deb qo`yilgan so`rash kerak men String qildim

    private String status;

    private Integer quantity;
}
