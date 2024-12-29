package com.registering.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Traveller {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id; // Change to a proper unique ID

	    private String name;

	    private int age;

	    private String gender;

	    private String nationality;

	    private String seat;

	    @ManyToOne
	    @JoinColumn(name = "booking_id") // Ensure proper foreign key mapping
	    private BookingTrain bookingTrain;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getSeat() {
			return seat;
		}

		public void setSeat(String seat) {
			this.seat = seat;
		}

		public BookingTrain getBookingTrain() {
			return bookingTrain;
		}

		public void setBookingTrain(BookingTrain bookingTrain) {
			this.bookingTrain = bookingTrain;
		}

		public Traveller(Long id, String name, int age, String gender, String nationality, String seat,
				BookingTrain bookingTrain) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.nationality = nationality;
			this.seat = seat;
			this.bookingTrain = bookingTrain;
		}

		public Traveller() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Traveller [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", nationality="
					+ nationality + ", seat=" + seat + ", bookingTrain=" + bookingTrain + "]";
		}

	    
	
	
	

}
