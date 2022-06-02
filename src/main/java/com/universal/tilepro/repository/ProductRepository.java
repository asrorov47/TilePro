package com.universal.tilepro.repository;

import com.universal.tilepro.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
