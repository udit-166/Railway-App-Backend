package com.railway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railway.model.Trains;

public interface TrainRepository extends JpaRepository<Trains, Long>{
	
	Trains findByPropertiesNumber(String number); // Find by train number
    List<Trains> findByPropertiesNameContainingIgnoreCase(String name); // Find list by train name (partial match, case-insensitive)
    @Query("SELECT t FROM Trains t " +
            "WHERE :startCoordinate MEMBER OF t.geometry.coordinates " +
            "AND :endCoordinate MEMBER OF t.geometry.coordinates")
     List<Trains> findTrainsBetweenStations(
         @Param("startCoordinate") List<Double> startCoordinate,
         @Param("endCoordinate") List<Double> endCoordinate);
	
}
