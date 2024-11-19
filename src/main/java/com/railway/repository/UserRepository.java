package com.railway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.railway.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    
    // Correct method name
    @Query("SELECT u FROM User u WHERE u.phone_number = :phone_number")
    User findByPhone_number(String phone_number);  // Corrected to camelCase
}

