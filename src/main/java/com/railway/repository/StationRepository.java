package com.railway.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.railway.model.Station;

public interface StationRepository extends JpaRepository<Station, Long>{
	
	
	@Query("SELECT s FROM Station s WHERE s.properties.code LIKE %:searchTerm% OR s.properties.name LIKE %:searchTerm%")
    List<Station> findByCodeOrNameContaining(String searchTerm);
	
	Optional<Station> findByPropertiesCode(String code);
}
