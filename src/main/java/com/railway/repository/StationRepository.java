package com.railway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.Station;

public interface StationRepository extends JpaRepository<Station, Long>{
	
//	List<Station> findByNameContainingIgnoreCase(String name);
}
