package com.carrotmarket.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrotmarket.clone.community.bean.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
