package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.course;

public interface courseRepository extends JpaRepository<course, Integer> {

}
