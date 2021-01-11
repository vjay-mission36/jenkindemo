package com.mission36.mappings.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.mappings.entity.Item;

@Repository
public interface ItemsRepositary extends JpaRepository<Item, Long> {

}
