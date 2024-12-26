package com.railway.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Embeddable
public class Properties {
	
	
	private int third_ac;
	
	private String arrival;
	
	private String from_station_code;
	
	private String name;
	
	private String zone;
	private int chair_car;
	
	private int first_class;
	
	private int duration_m;
	
	private int sleeper;
	
	private String from_station_name;
	
	private String number;
	
	private String departure;
	
	private String return_train;
	
	private String to_station_code;
	
	private int second_ac;
	
	private String classes;
	
	private String to_station_name;
	
	private int duration_h;
	
	@Column(name = "property_type")
	private String type;
	
	private int first_ac;
	
	private long distance;

	
	public int getThird_ac() {
		return third_ac;
	}

	public void setThird_ac(int third_ac) {
		this.third_ac = third_ac;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getFrom_station_code() {
		return from_station_code;
	}

	public void setFrom_station_code(String from_station_code) {
		this.from_station_code = from_station_code;
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

	public int getChair_car() {
		return chair_car;
	}

	public void setChair_car(int chair_car) {
		this.chair_car = chair_car;
	}

	public int getFirst_class() {
		return first_class;
	}

	public void setFirst_class(int first_class) {
		this.first_class = first_class;
	}

	public int getDuration_m() {
		return duration_m;
	}

	public void setDuration_m(int duration_m) {
		this.duration_m = duration_m;
	}

	public int getSleeper() {
		return sleeper;
	}

	public void setSleeper(int sleeper) {
		this.sleeper = sleeper;
	}

	public String getFrom_station_name() {
		return from_station_name;
	}

	public void setFrom_station_name(String from_station_name) {
		this.from_station_name = from_station_name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getReturn_train() {
		return return_train;
	}

	public void setReturn_train(String return_train) {
		this.return_train = return_train;
	}

	public String getTo_station_code() {
		return to_station_code;
	}

	public void setTo_station_code(String to_station_code) {
		this.to_station_code = to_station_code;
	}

	public int getSecond_ac() {
		return second_ac;
	}

	public void setSecond_ac(int second_ac) {
		this.second_ac = second_ac;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getTo_station_name() {
		return to_station_name;
	}

	public void setTo_station_name(String to_station_name) {
		this.to_station_name = to_station_name;
	}

	public int getDuration_h() {
		return duration_h;
	}

	public void setDuration_h(int duration_h) {
		this.duration_h = duration_h;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFirst_ac() {
		return first_ac;
	}

	public void setFirst_ac(int first_ac) {
		this.first_ac = first_ac;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public Properties(int third_ac, String arrival, String from_station_code, String name, String zone,
			int chair_car, int first_class, int duration_m, int sleeper, String from_station_name, String number,
			String departure, String return_train, String to_station_code, int second_ac, String classes,
			String to_station_name, int duration_h, String type, int first_ac, long distance) {
		super();
		this.third_ac = third_ac;
		this.arrival = arrival;
		this.from_station_code = from_station_code;
		this.name = name;
		this.zone = zone;
		this.chair_car = chair_car;
		this.first_class = first_class;
		this.duration_m = duration_m;
		this.sleeper = sleeper;
		this.from_station_name = from_station_name;
		this.number = number;
		this.departure = departure;
		this.return_train = return_train;
		this.to_station_code = to_station_code;
		this.second_ac = second_ac;
		this.classes = classes;
		this.to_station_name = to_station_name;
		this.duration_h = duration_h;
		this.type = type;
		this.first_ac = first_ac;
		this.distance = distance;
	}

	public Properties() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Properties [third_ac=" + third_ac + ", arrival=" + arrival + ", from_station_code="
				+ from_station_code + ", name=" + name + ", zone=" + zone + ", chair_car=" + chair_car
				+ ", first_class=" + first_class + ", duration_m=" + duration_m + ", sleeper=" + sleeper
				+ ", from_station_name=" + from_station_name + ", number=" + number + ", departure=" + departure
				+ ", return_train=" + return_train + ", to_station_code=" + to_station_code + ", second_ac=" + second_ac
				+ ", classes=" + classes + ", to_station_name=" + to_station_name + ", duration_h=" + duration_h
				+ ", type=" + type + ", first_ac=" + first_ac + ", distance=" + distance + "]";
	}
	
}
