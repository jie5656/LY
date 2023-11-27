package com.example.demo.repository;


import com.example.demo.domain.ScenicSpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenicSpotDao extends JpaRepository<ScenicSpot, Long> {
}
