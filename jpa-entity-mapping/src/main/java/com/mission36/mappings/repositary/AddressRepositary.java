package com.mission36.mappings.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.mappings.entity.Address;

@Repository
public interface AddressRepositary extends JpaRepository<Address, Long> {

}
