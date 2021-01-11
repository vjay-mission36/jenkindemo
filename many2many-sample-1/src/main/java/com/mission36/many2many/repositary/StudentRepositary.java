package com.mission36.many2many.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mission36.many2many.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Long> {

}
