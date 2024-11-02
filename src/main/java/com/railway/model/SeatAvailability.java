package com.railway.model;

import java.util.List;

public class SeatAvailability {
	private boolean status;
	private String message;
	private long timestamp;
	
	private List<ParticularDateSeatAval> data;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public List<ParticularDateSeatAval> getData() {
		return data;
	}

	public void setData(List<ParticularDateSeatAval> data) {
		this.data = data;
	}

	public SeatAvailability(boolean status, String message, long timestamp, List<ParticularDateSeatAval> data) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.data = data;
	}

	public SeatAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SeatAvailability [status=" + status + ", message=" + message + ", timestamp=" + timestamp + ", data="
				+ data + "]";
	}
	
}
