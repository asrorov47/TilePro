package com.universal.tilepro.repository;

import com.universal.tilepro.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
