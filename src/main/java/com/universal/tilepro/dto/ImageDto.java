package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageDto {


    private Integer id;

    private String path;

    private String type;

    private Long size;

    private String token;
}
