package com.carrotmarket.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrotmarket.clone.community.bean.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{
    
}
