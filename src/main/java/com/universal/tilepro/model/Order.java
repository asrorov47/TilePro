package com.universal.tilepro.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("orders"))
public class Order  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

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
