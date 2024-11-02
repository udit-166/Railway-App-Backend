package com.railway.model;

import java.util.List;

public class RunningStatus {
	 private boolean status;
	 private String message;
	 private long timestamp;
	 private RunningStatusInfo data;
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
	public RunningStatusInfo getData() {
		return data;
	}
	public void setData(RunningStatusInfo data) {
		this.data = data;
	}
	public RunningStatus(boolean status, String message, long timestamp, RunningStatusInfo data) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.data = data;
	}
	public RunningStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RunningStatus [status=" + status + ", message=" + message + ", timestamp=" + timestamp + ", data="
				+ data + "]";
	}
	
	      
}

