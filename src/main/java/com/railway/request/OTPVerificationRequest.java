package com.railway.request;

public class OTPVerificationRequest {
	
	    private String email;
	    private String phone_number;
	    private String otp; // OTP entered by the user
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
		public String getOtp() {
			return otp;
		}
		public void setOtp(String otp) {
			this.otp = otp;
		}
		@Override
		public String toString() {
			return "OTPVerificationRequest [email=" + email + ", phone_number=" + phone_number + ", otp=" + otp + "]";
		}
		public OTPVerificationRequest(String email, String phone_number, String otp) {
			super();
			this.email = email;
			this.phone_number = phone_number;
			this.otp = otp;
		}
		public OTPVerificationRequest() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
	}


