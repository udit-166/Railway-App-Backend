package com.railway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.model.Trains;

public interface TrainRepository extends JpaRepository<Trains, Long>{
	
	Trains findByPropertiesNumber(String number); // Find by train number
    List<Trains> findByPropertiesNameContainingIgnoreCase(String name); // Find list by train name (partial match, case-insensitive)
	
}
