package com.railway.Service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.railway.modal.User;


public interface UserService {
	
	
	public User getUserProfile(String jwt);
	
	public List<User> getAllUsers();
	
	public void sendEmail(String subject,String message,String to);
	
	public void sendSMS(Integer message,String number);
	

}
