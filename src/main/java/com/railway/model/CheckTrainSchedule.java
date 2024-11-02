package com.railway.model;

public class CheckTrainSchedule {
	private boolean status;
	private String message;
	private long timestamp;
	private TrainSchedule data;
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
	public TrainSchedule getData() {
		return data;
	}
	public void setData(TrainSchedule data) {
		this.data = data;
	}
	
	
}
