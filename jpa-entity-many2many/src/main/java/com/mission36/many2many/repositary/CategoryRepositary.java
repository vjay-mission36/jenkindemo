package com.mission36.many2many.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.many2many.model.Category;

@Repository
public interface CategoryRepositary extends JpaRepository<Category, Long>{

}
