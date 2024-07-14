package com.example.demo2.repository;

import com.example.demo2.entity.PostDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public interface PostRepository extends JpaRepository<PostDTO, Long> {
}

