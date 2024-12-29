package com.registering.entity;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_details")
public class BookingTrain {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long BookingId; // This will map to BIGINT in the database

	    @OneToMany(mappedBy = "bookingTrain", cascade = CascadeType.ALL, orphanRemoval = true)
	    private ArrayList<Traveller> travellers;
	
	private String email;
	
	private String irctc;
	
	private String password;
	
	private String user_id;
	
	private String cancellation_fees;
	
	@Embedded
	private PaymentDetails paymentDetails;
	
	private String seat_class;
	
	private int seat_number;
	
	private String coach_number;
	
	private long total_price;

	public Long getBookingId() {
		return BookingId;
	}

	public void setBookingId(Long bookingId) {
		BookingId = bookingId;
	}

	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}

	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIrctc() {
		return irctc;
	}

	public void setIrctc(String irctc) {
		this.irctc = irctc;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCancellation_fees() {
		return cancellation_fees;
	}

	public void setCancellation_fees(String cancellation_fees) {
		this.cancellation_fees = cancellation_fees;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getSeat_class() {
		return seat_class;
	}

	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}

	public int getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}

	public String getCoach_number() {
		return coach_number;
	}

	public void setCoach_number(String coach_number) {
		this.coach_number = coach_number;
	}

	public long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}

	public BookingTrain(Long bookingId, ArrayList<Traveller> travellers, String email, String irctc, String password,
			String user_id, String cancellation_fees, PaymentDetails paymentDetails, String seat_class, int seat_number,
			String coach_number, long total_price) {
		super();
		BookingId = bookingId;
		this.travellers = travellers;
		this.email = email;
		this.irctc = irctc;
		this.password = password;
		this.user_id = user_id;
		this.cancellation_fees = cancellation_fees;
		this.paymentDetails = paymentDetails;
		this.seat_class = seat_class;
		this.seat_number = seat_number;
		this.coach_number = coach_number;
		this.total_price = total_price;
	}

	public BookingTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
