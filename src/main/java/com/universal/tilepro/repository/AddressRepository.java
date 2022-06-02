package com.universal.tilepro.repository;

import com.universal.tilepro.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
