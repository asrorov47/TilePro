package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

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
