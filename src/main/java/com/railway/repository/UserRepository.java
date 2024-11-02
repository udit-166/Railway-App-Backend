package com.railway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.modal.User;

public interface UserRepository extends JpaRepository<User,Long>{
	public User findByEmail(String email);
}
