package com.clone.carrotmarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clone.carrotmarket.domain.MemberData;


public interface MemberRepository extends JpaRepository<MemberData, Long>{
    List<MemberData> findByUserId(String userId);
}
