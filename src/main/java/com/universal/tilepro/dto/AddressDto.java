package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {
    private Integer id;

    private String region;

    private String city;

    private String district;

    private String Street;

    private Integer Home;
}
