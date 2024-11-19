package com.railway.request;

public class OTPVerificationRequest {
	
	    private String email;
	    private String otp; // OTP entered by the user

	    // Getters and setters
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getOtp() {
	        return otp;
	    }

	    public void setOtp(String otp) {
	        this.otp = otp;
	    }
	}


