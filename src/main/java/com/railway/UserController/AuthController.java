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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Service.UserService;
import com.railway.Service.UserServiceImplement;
import com.railway.config.JwtProvider;
import com.railway.modal.User;
import com.railway.repository.UserRepository;
import com.railway.request.LoginRequest;
import com.railway.request.OTPVerificationRequest;
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
	public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user) throws Exception {
	    String email = user.getEmail();
	    String password = user.getPassword();
	    String phone_number = user.getPhone_number();
	    
	    // Check if the email already exists
	    User isEmailExist = userRepository.findByEmail(email);
	    if (isEmailExist != null) {
	        throw new Exception("Email is already used with this account");
	    }

	    // Generate OTP for email verification
	    int otp = new Random().nextInt(10000); // Random OTP generation (4-digit)
	    System.out.println("Generated OTP: " + otp);

	    // Prepare the email message
	    String subject = "OTP from Railbook";
	    String message = "" +
	        "<div>" +
	        "<p>This is an email from Railbook application to verify your email for registration.</p>" +
	        "<br><br>" +
	        "<h1 style='border:1px solid #e2e2e2; padding:20px; border-radius:25px;'>" +
	        "<b>" + otp + "</b>" +
	        "</h1>" +
	        "</div>";
	    
	    // Send OTP email
	    userService.sendEmail(subject, message, email);

	    // Store the OTP in a temporary place (e.g., Redis, in-memory cache, or database)
	    // For simplicity, storing OTP directly in user entity (You can implement a better strategy for OTP storage)
	    user.setOtp(String.valueOf(otp));
	    userRepository.save(user);

	    // Return success response with message asking to verify OTP
	    AuthResponse authResponse = new AuthResponse();
	    authResponse.setMessage("Signup successful. Please verify your email with the OTP sent.");
	    authResponse.setStatus(true);

	    return new ResponseEntity<>(authResponse, HttpStatus.OK);
	}

	@PostMapping("/verify-email")
	public ResponseEntity<AuthResponse> verifyEmail(@RequestBody OTPVerificationRequest otpRequest) throws Exception {
	    String email = otpRequest.getEmail();
	    String otpEntered = otpRequest.getOtp(); // OTP entered by the user
	    
	    // Retrieve the user by email
	    User user = userRepository.findByEmail(email);
	    if (user == null) {
	        throw new Exception("User not found.");
	    }
	    
	    // Check if the OTP entered by the user matches the stored OTP
	    if (user.getOtp() == null || !user.getOtp().equals(otpEntered)) {
	        throw new Exception("Invalid OTP.");
	    }

	    // OTP is valid, now create the user
	    user.setOtp(null); // Clear the OTP after verification
	    userRepository.save(user); // Save the user in the database (you can mark the user as verified)

	    // Generate JWT token
	    Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    String token = jwtProvider.generateToken(authentication);

	    // Create the response with the JWT token
	    AuthResponse authResponse = new AuthResponse();
	    authResponse.setJwt(token);
	    authResponse.setMessage("Email verified successfully.");
	    authResponse.setStatus(true);

	    return new ResponseEntity<>(authResponse, HttpStatus.OK);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<AuthResponse> signin(@RequestBody LoginRequest loginRequest){
		  String username = loginRequest.getEmail();
		  
		  String phone_number = loginRequest.getPhone_number();
		  
		  if(phone_number==null) {
		  
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
		  else {
			  Authentication authentication = authenticationPhoneNumber(phone_number);
			  SecurityContextHolder.getContext().setAuthentication(authentication);
			  String token  = jwtProvider.generateToken(authentication);
			  AuthResponse auth = new AuthResponse();
			  auth.setMessage("Login Successfull");
			  auth.setJwt(token);
			  auth.setStatus(true);
			  return new ResponseEntity<>(auth, HttpStatus.OK);
		  }
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
	
	private Authentication authenticationPhoneNumber(String phonr_number) {
		UserDetails userDetails  = serviceImplement.findUserByPhoneNumber(phonr_number);
		
		if(userDetails==null) {
			System.out.println("sign in userDetetails - null "+ userDetails);
			throw new BadCredentialsException("Invalid phone number");
		}
		
		return new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());
		}
}
