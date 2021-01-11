package com.mission36.many2many.repositary;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.many2many.entity.Tag;

@Repository
public interface TagRepositary extends JpaRepository<Tag, Long>{

}
