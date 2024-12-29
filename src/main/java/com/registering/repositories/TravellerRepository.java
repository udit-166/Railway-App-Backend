package com.registering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registering.entity.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller, Long>{

}
