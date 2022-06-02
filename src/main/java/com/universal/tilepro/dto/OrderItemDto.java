package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDto {

    private Integer id;

    private String order;//TODO:type deb qo`yilgan men String qildim So`rash kerak

    private String product;//TODO:type deb qo`yilgan so`rash kerak men String qildim

    private String status;

    private Integer quantity;
}
