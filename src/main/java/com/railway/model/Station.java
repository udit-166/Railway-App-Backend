package com.railway.model;

public class Station {
	private String name;
	private String eng_name;
	private String code;
	private String state_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEng_name() {
		return eng_name;
	}
	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public Station(String name, String eng_name, String code, String state_name) {
		super();
		this.name = name;
		this.eng_name = eng_name;
		this.code = code;
		this.state_name = state_name;
	}
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
