package com.carrotmarket.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrotmarket.clone.community.bean.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Long>{
    
}
