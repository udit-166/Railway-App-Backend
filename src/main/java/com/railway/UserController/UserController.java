package com.railway.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Service.UserService;
import com.railway.Service.UserServiceImplement;
import com.railway.modal.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfile(@RequestHeader("Authorization")String jwt){
		User user = userService.getUserProfile(jwt);
		System.out.println(user);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	}
	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers(@RequestHeader("Authorization")String jwt){
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.ACCEPTED);
	}
}
