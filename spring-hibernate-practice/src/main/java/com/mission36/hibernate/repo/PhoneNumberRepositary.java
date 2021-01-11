package com.mission36.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.hibernate.entity.PhoneNumber;

@Repository
public interface PhoneNumberRepositary extends JpaRepository<PhoneNumber,Long> {

}
