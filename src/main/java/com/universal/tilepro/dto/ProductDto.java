package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {

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
