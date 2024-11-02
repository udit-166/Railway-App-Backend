package com.railway.model;

import java.util.List;

public class TrainBetweenStations {
	
	private String status;
	private String message;
	
	private long timpstamp;
	
	private List<Train> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimpstamp() {
		return timpstamp;
	}

	public void setTimpstamp(long timpstamp) {
		this.timpstamp = timpstamp;
	}

	public List<Train> getData() {
		return data;
	}

	public void setData(List<Train> data) {
		this.data = data;
	}

	public TrainBetweenStations(String status, String message, long timpstamp, List<Train> data) {
		super();
		this.status = status;
		this.message = message;
		this.timpstamp = timpstamp;
		this.data = data;
	}

	public TrainBetweenStations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TrainBetweenStations [status=" + status + ", message=" + message + ", timpstamp=" + timpstamp
				+ ", data=" + data + "]";
	}
	
	
}

