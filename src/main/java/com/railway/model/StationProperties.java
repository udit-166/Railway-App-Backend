package com.railway.model;

public class StationProperties {
	
	private String State;
	private String code;
	private String name;
	private String zone;
	private String address;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
