package com.railway.model;

import java.util.List;

public class CheckPnrstatus {
	
	private boolean status;
	private String message;
	private long timestamp;
	
	private List<CheckPnr> data;
	
	

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

	public List<CheckPnr> getData() {
		return data;
	}

	public void setData(List<CheckPnr> data) {
		this.data = data;
	}

	public CheckPnrstatus(boolean status, String message, long timestamp, List<CheckPnr> data) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.data = data;
	}

	public CheckPnrstatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
