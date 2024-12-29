package com.registering.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class Paymentinformation {
	
	@Column(name="cardholder_name")
	private String cardholderName;
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private LocalDate expirationDate;
	
	@Column(name="cvv")
	private String cvv;

	
	

}
