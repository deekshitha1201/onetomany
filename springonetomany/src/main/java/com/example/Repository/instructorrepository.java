package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.instructor;

public interface instructorrepository extends JpaRepository<instructor, Integer> {

}
