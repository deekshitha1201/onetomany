package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Comment;

public interface Commentrepository extends JpaRepository<Comment, Integer> {

}
