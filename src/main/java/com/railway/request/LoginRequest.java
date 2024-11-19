package com.railway.request;

public class LoginRequest {
	private String email;
	private String phone_number;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [email=" + email + ", phone_number=" + phone_number + ", password=" + password + "]";
	}
	public LoginRequest(String email, String phone_number, String password) {
		super();
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}
	public LoginRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
