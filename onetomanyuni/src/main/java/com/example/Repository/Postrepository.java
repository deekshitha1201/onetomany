package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Post;

public interface Postrepository extends JpaRepository<Post, Integer> {

}
