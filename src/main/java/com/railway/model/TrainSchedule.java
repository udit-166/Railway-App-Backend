package com.railway.model;

import java.util.List;

public class TrainSchedule {
	private String trainType;
	private String trainNumber;
	private String trainName;
	private RunDays rundays;
	private List<seatClass> seatClass;
	private List<seatClass> quota;
	private List<Route> route;
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public RunDays getRundays() {
		return rundays;
	}
	public void setRundays(RunDays rundays) {
		this.rundays = rundays;
	}
	public List<seatClass> getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(List<seatClass> seatClass) {
		this.seatClass = seatClass;
	}
	public List<seatClass> getQuota() {
		return quota;
	}
	public void setQuota(List<seatClass> quota) {
		this.quota = quota;
	}
	public List<Route> getRoute() {
		return route;
	}
	public void setRoute(List<Route> route) {
		this.route = route;
	}
	
}
