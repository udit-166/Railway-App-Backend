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
	
	private Long user_id;
	
	private String cancellation_fees;
	
	@Embedded
	private PaymentDetails paymentDetails;
	
	private String seat_class;
	
	private int seat_number;
	
	private String coach_number;
	private Long train_id;
	
	private String name;
	
	private String train_number;
	
	private String arrival;
	
	private String from_station_code;
	
	private String from_station_name;
	
	private String departure;
	
	private String to_station_code;
	
	private String to_station_name;
	
	private long total_price;
	
	private int duration_h;
	
	private int duration_m;

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

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
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

	public Long getTrain_id() {
		return train_id;
	}

	public void setTrain_id(Long train_id) {
		this.train_id = train_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrain_number() {
		return train_number;
	}

	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getFrom_station_code() {
		return from_station_code;
	}

	public void setFrom_station_code(String from_station_code) {
		this.from_station_code = from_station_code;
	}

	public String getFrom_station_name() {
		return from_station_name;
	}

	public void setFrom_station_name(String from_station_name) {
		this.from_station_name = from_station_name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getTo_station_code() {
		return to_station_code;
	}

	public void setTo_station_code(String to_station_code) {
		this.to_station_code = to_station_code;
	}

	public String getTo_station_name() {
		return to_station_name;
	}

	public void setTo_station_name(String to_station_name) {
		this.to_station_name = to_station_name;
	}

	public long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}

	public int getDuration_h() {
		return duration_h;
	}

	public void setDuration_h(int duration_h) {
		this.duration_h = duration_h;
	}

	public int getDuration_m() {
		return duration_m;
	}

	public void setDuration_m(int duration_m) {
		this.duration_m = duration_m;
	}

	public BookingTrain(Long bookingId, ArrayList<Traveller> travellers, String email, String irctc, String password,
			Long user_id, String cancellation_fees, PaymentDetails paymentDetails, String seat_class, int seat_number,
			String coach_number, Long train_id, String name, String train_number, String arrival,
			String from_station_code, String from_station_name, String departure, String to_station_code,
			String to_station_name, long total_price, int duration_h, int duration_m) {
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
		this.train_id = train_id;
		this.name = name;
		this.train_number = train_number;
		this.arrival = arrival;
		this.from_station_code = from_station_code;
		this.from_station_name = from_station_name;
		this.departure = departure;
		this.to_station_code = to_station_code;
		this.to_station_name = to_station_name;
		this.total_price = total_price;
		this.duration_h = duration_h;
		this.duration_m = duration_m;
	}

	public BookingTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookingTrain [BookingId=" + BookingId + ", travellers=" + travellers + ", email=" + email + ", irctc="
				+ irctc + ", password=" + password + ", user_id=" + user_id + ", cancellation_fees=" + cancellation_fees
				+ ", paymentDetails=" + paymentDetails + ", seat_class=" + seat_class + ", seat_number=" + seat_number
				+ ", coach_number=" + coach_number + ", train_id=" + train_id + ", name=" + name + ", train_number="
				+ train_number + ", arrival=" + arrival + ", from_station_code=" + from_station_code
				+ ", from_station_name=" + from_station_name + ", departure=" + departure + ", to_station_code="
				+ to_station_code + ", to_station_name=" + to_station_name + ", total_price=" + total_price
				+ ", duration_h=" + duration_h + ", duration_m=" + duration_m + "]";
	}

	
	
	
	
	
	
}
