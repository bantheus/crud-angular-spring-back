package com.bantheus.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bantheus.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
  
}
