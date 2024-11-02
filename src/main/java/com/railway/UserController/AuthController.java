package com.railway.UserController;

import java.util.Collection;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Service.UserService;
import com.railway.Service.UserServiceImplement;
import com.railway.config.JwtProvider;
import com.railway.modal.User;
import com.railway.repository.UserRepository;
import com.railway.request.LoginRequest;
import com.railway.response.AuthResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	Random random = new Random(1000);
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserServiceImplement serviceImplement;
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtProvider jwtProvider;
	
	@PostMapping("/signup")
	public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user)throws Exception{
		String email = user.getEmail();
		String password = user.getPassword();
		String first_name = user.getFirst_name();
		String last_name = user.getLast_name();
		String phone_number = user.getPhone_number();
		
		// Check is the email already exits
		
		User isEmailExist = userRepository.findByEmail(email);
		if(isEmailExist!=null) {
			throw new Exception("Email is already used with this account");
		}
		//sending mail to user who is registering
		
		int otp = random.nextInt(10000);
		System.out.println(otp);
		String subject = "OTP from Railbook";
		String message = ""+
				"<div>"
				+"<p>"
				+"This is email from Railbook application to verify your email to maintain the user trust as well as to make you access all the services."
				+"</p><br><br>"
				+"<h1 style='border:1px solid #e2e2e2; padding:20px; border-radius:25px;'>"
				+"<b>"+otp
				+"</n>"
				+"</h1>"
				+"</div>";
		
		userService.sendEmail(subject, message, email);
		
		//create new user
		User createUser = new User();
		createUser.setEmail(email);
		createUser.setFirst_name(first_name);
		createUser.setLast_name(last_name);
		createUser.setPhone_number(phone_number);
		createUser.setPassword(passwordEncoder.encode(password));
		
		userRepository.save(createUser);
		
		Authentication authentication = new UsernamePasswordAuthenticationToken(email,password);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		String token = jwtProvider.generateToken(authentication);
		
		AuthResponse authResponse = new AuthResponse();
		
		authResponse.setJwt(token);
		authResponse.setMessage("Registration Success");
		
		authResponse.setStatus(true);
		
		
		return new ResponseEntity<>(authResponse,HttpStatus.OK);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<AuthResponse> signin(@RequestBody LoginRequest loginRequest){
		  String username = loginRequest.getEmail();
		  
		  String password = loginRequest.getPassword();
		  
		  System.out.println(username + "...... "+ password);
		 Authentication authentication = authenticate(username,password);
		 
		 SecurityContextHolder.getContext().setAuthentication(authentication);
		 
		 String token = jwtProvider.generateToken(authentication);
		 
		 AuthResponse auth = new AuthResponse();
		 
		 auth.setMessage("Login successfull");
		 auth.setJwt(token);
		 auth.setStatus(true);
		 
		 return new ResponseEntity<>(auth,HttpStatus.OK);
	}
	
	
	private Authentication authenticate(String username, String password) {
		UserDetails userDetails = serviceImplement.findUserByEmail(username);
		
		if(userDetails==null) {
			System.out.println("sign in userDetetails - null "+ userDetails);
			throw new BadCredentialsException("Invalid username or password");
		}
		if(!passwordEncoder.matches(password, userDetails.getPassword())) {
			System.out.println("sign in user - password not found");
			throw new BadCredentialsException("Incorrect password you have mentioned");
		}
		
		return new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
				
				
	}
}
