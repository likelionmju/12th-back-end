package com.example.crudhw2.Repository;

import com.example.crudhw2.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
