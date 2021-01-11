package com.mission36.many2many.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.many2many.model.Parent;

@Repository
public interface ParentRepositary extends JpaRepository<Parent, Long> {

}
