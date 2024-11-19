package com.railway.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.railway.config.JwtProvider;
import com.railway.modal.User;
import com.railway.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtProvider jwtProvider;

	public UserDetails findUserByEmail(String email) throws UsernameNotFoundException{
		User user =  userRepository.findByEmail(email);
		if(user==null) {
			throw new UsernameNotFoundException("user not found with email"+ email);
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		return  new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
	}
	
	public UserDetails findUserByPhoneNumber(String phone_number) throws UsernameNotFoundException{
		User user =  userRepository.findByPhone_number(phone_number);
		if(user==null) {
			throw new UsernameNotFoundException("user not found with email"+ phone_number);
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		return  new org.springframework.security.core.userdetails.User(user.getPhone_number(),user.getPassword(),authorities);
	}

	@Override
	public User getUserProfile(String jwt){
		
		String email = jwtProvider.getEmailFromToken(jwt);
		User user = userRepository.findByEmail(email);
		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void sendEmail(String subject, String message, String to) {
		String from  = "uditshahi96@gmail.com";
		// Variable for sending the message in the app
		
		String host = "smtp.gmail.com";
		//get the system properties
		
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		// setting importing information to properties object
		
		//host set
		
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		// to get the session object
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("uditshahi96@gmail.com","ddrpyglpsxptbbto");
			}
		});
		session.setDebug(true);
		
		//Step 2:- compose the message[text,multimedia]
		
		MimeMessage m = new MimeMessage(session);
		//from email
		try {
		m.setFrom(from);
		
		// adding recipient to message
		
		m.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
		
		// adding subject to message
		
		m.setSubject(subject);
		// add text to message
		
		//m.setText(message);
		
		m.setContent(message,"text/html");
		
		
		
		//send
		// Step 3: send the message using Transport class
		
		Transport.send(m);
		
		System.out.println("send success................");
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		
	}

	@Override
	public void sendSMS(Integer message, String number) {
		
		try {
			String apiKey = "EmVTwn5bucyZ7rQkp2aNC3IYLxeGSBXRhi6qzlDP8d1HjUf4AtxpQAvlgukrX1FBUSwqfaWiPmLs5heD";
			String sendId = "FSTSMS";
			//important step
		String otp = message.toString();
		String language = "english";
		
		String route = "otp";
		
		String myURL = "https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&variables_values="+otp+"&route="+route+"&numbers="+number;
		//sending get request using java
		
		System.out.println(myURL);
		
		URL url = new URL(myURL);
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		con.setRequestMethod("GET");
		
		con.setRequestProperty("User-Agent","Mozilla/5.0");
		con.setRequestProperty("cache-control", "no-cache");
		
		System.out.println("waiting..................");
		
		int code = con.getResponseCode();
		
		System.out.println("Response Code "+code);
		
		StringBuffer response = new StringBuffer();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			response.append(line);
		}
		System.out.println(response);
		
		
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	
}
