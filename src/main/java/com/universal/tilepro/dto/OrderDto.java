package com.universal.tilepro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {
    private Integer id;

    private Integer user;//TODO:userni type ini anig`ini bilish kerak(type) deb qo`yilganakan screenda

    private LocalDateTime deliveryDate;

    private String requirment;

    private String contact;

    private String address;

    private LocalDateTime deleveredDate;

    private String status;

    private Double totalPayment;
}
