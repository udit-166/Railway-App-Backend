package com.registering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registering.entity.BookingTrain;

public interface BookingRepository extends JpaRepository<BookingTrain, Long>{

}
