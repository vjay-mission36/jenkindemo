package com.mission36.mappings.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.mappings.entity.User;

@Repository
public interface UserRepositary extends JpaRepository<User, Long> {

}
