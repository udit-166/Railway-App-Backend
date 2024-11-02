package com.railway.model;

public class ParticularDateSeatAval {
	 private long ticket_fare;
	
     private int catering_charge;

     private int alt_cnf_seat;
     
     private long total_fare;
     private String date;
     
     private String confirm_probability_percent;
     
     private String confirm_probability;
    
     private String current_status;

	public long getTicket_fare() {
		return ticket_fare;
	}

	public void setTicket_fare(long ticket_fare) {
		this.ticket_fare = ticket_fare;
	}

	public int getCatering_charge() {
		return catering_charge;
	}

	public void setCatering_charge(int catering_charge) {
		this.catering_charge = catering_charge;
	}

	public int getAlt_cnf_seat() {
		return alt_cnf_seat;
	}

	public void setAlt_cnf_seat(int alt_cnf_seat) {
		this.alt_cnf_seat = alt_cnf_seat;
	}

	public long getTotal_fare() {
		return total_fare;
	}

	public void setTotal_fare(long total_fare) {
		this.total_fare = total_fare;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getConfirm_probability_percent() {
		return confirm_probability_percent;
	}

	public void setConfirm_probability_percent(String confirm_probability_percent) {
		this.confirm_probability_percent = confirm_probability_percent;
	}

	public String getConfirm_probability() {
		return confirm_probability;
	}

	public void setConfirm_probability(String confirm_probability) {
		this.confirm_probability = confirm_probability;
	}

	public String getCurrent_status() {
		return current_status;
	}

	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}

	public ParticularDateSeatAval(long ticket_fare, int catering_charge, int alt_cnf_seat, long total_fare, String date,
			String confirm_probability_percent, String confirm_probability, String current_status) {
		super();
		this.ticket_fare = ticket_fare;
		this.catering_charge = catering_charge;
		this.alt_cnf_seat = alt_cnf_seat;
		this.total_fare = total_fare;
		this.date = date;
		this.confirm_probability_percent = confirm_probability_percent;
		this.confirm_probability = confirm_probability;
		this.current_status = current_status;
	}

	public ParticularDateSeatAval() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ParticularDateSeatAval [ticket_fare=" + ticket_fare + ", catering_charge=" + catering_charge
				+ ", alt_cnf_seat=" + alt_cnf_seat + ", total_fare=" + total_fare + ", date=" + date
				+ ", confirm_probability_percent=" + confirm_probability_percent + ", confirm_probability="
				+ confirm_probability + ", current_status=" + current_status + "]";
	}
     
     
}
