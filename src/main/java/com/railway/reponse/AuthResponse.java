package com.railway.reponse;

public class AuthResponse {

	
	private String message;
	
	private boolean status;

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public AuthResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}

	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
