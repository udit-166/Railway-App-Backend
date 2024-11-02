package com.railway.model;

import java.util.List;

public class UpcomingStation {
	
	private int si_no;
	private String station_code;
	private String station_name;
	private boolean is_diverted_station;
	private long distance_from_source;
	private int distance_from_current_station;
	private String distance_from_current_station_txt;
	private String sta;
	private String std;
	private String eta;
	private String etd;
	private int halt;
	private int a_day;
	private int arrival_delay;
	private int platform_number;
	private int on_time_rating;
	private double station_lat;
	private double station_lng;
	private int stoppage_number;
	private int day;
	private int eta_a_min;
	private boolean food_available;
	private List<NonStops> non_stops;
	public int getSi_no() {
		return si_no;
	}
	public void setSi_no(int si_no) {
		this.si_no = si_no;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public boolean isIs_diverted_station() {
		return is_diverted_station;
	}
	public void setIs_diverted_station(boolean is_diverted_station) {
		this.is_diverted_station = is_diverted_station;
	}
	public long getDistance_from_source() {
		return distance_from_source;
	}
	public void setDistance_from_source(long distance_from_source) {
		this.distance_from_source = distance_from_source;
	}
	public int getDistance_from_current_station() {
		return distance_from_current_station;
	}
	public void setDistance_from_current_station(int distance_from_current_station) {
		this.distance_from_current_station = distance_from_current_station;
	}
	public String getDistance_from_current_station_txt() {
		return distance_from_current_station_txt;
	}
	public void setDistance_from_current_station_txt(String distance_from_current_station_txt) {
		this.distance_from_current_station_txt = distance_from_current_station_txt;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public String getEtd() {
		return etd;
	}
	public void setEtd(String etd) {
		this.etd = etd;
	}
	public int getHalt() {
		return halt;
	}
	public void setHalt(int halt) {
		this.halt = halt;
	}
	public int getA_day() {
		return a_day;
	}
	public void setA_day(int a_day) {
		this.a_day = a_day;
	}
	public int getArrival_delay() {
		return arrival_delay;
	}
	public void setArrival_delay(int arrival_delay) {
		this.arrival_delay = arrival_delay;
	}
	public int getPlatform_number() {
		return platform_number;
	}
	public void setPlatform_number(int platform_number) {
		this.platform_number = platform_number;
	}
	public int getOn_time_rating() {
		return on_time_rating;
	}
	public void setOn_time_rating(int on_time_rating) {
		this.on_time_rating = on_time_rating;
	}
	public double getStation_lat() {
		return station_lat;
	}
	public void setStation_lat(double station_lat) {
		this.station_lat = station_lat;
	}
	public double getStation_lng() {
		return station_lng;
	}
	public void setStation_lng(double station_lng) {
		this.station_lng = station_lng;
	}
	public int getStoppage_number() {
		return stoppage_number;
	}
	public void setStoppage_number(int stoppage_number) {
		this.stoppage_number = stoppage_number;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getEta_a_min() {
		return eta_a_min;
	}
	public void setEta_a_min(int eta_a_min) {
		this.eta_a_min = eta_a_min;
	}
	public boolean isFood_available() {
		return food_available;
	}
	public void setFood_available(boolean food_available) {
		this.food_available = food_available;
	}
	public List<NonStops> getNon_stops() {
		return non_stops;
	}
	public void setNon_stops(List<NonStops> non_stops) {
		this.non_stops = non_stops;
	}
	public UpcomingStation(int si_no, String station_code, String station_name, boolean is_diverted_station,
			long distance_from_source, int distance_from_current_station, String distance_from_current_station_txt,
			String sta, String std, String eta, String etd, int halt, int a_day, int arrival_delay, int platform_number,
			int on_time_rating, double station_lat, double station_lng, int stoppage_number, int day, int eta_a_min,
			boolean food_available, List<NonStops> non_stops) {
		super();
		this.si_no = si_no;
		this.station_code = station_code;
		this.station_name = station_name;
		this.is_diverted_station = is_diverted_station;
		this.distance_from_source = distance_from_source;
		this.distance_from_current_station = distance_from_current_station;
		this.distance_from_current_station_txt = distance_from_current_station_txt;
		this.sta = sta;
		this.std = std;
		this.eta = eta;
		this.etd = etd;
		this.halt = halt;
		this.a_day = a_day;
		this.arrival_delay = arrival_delay;
		this.platform_number = platform_number;
		this.on_time_rating = on_time_rating;
		this.station_lat = station_lat;
		this.station_lng = station_lng;
		this.stoppage_number = stoppage_number;
		this.day = day;
		this.eta_a_min = eta_a_min;
		this.food_available = food_available;
		this.non_stops = non_stops;
	}
	public UpcomingStation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UpcomingStation [si_no=" + si_no + ", station_code=" + station_code + ", station_name=" + station_name
				+ ", is_diverted_station=" + is_diverted_station + ", distance_from_source=" + distance_from_source
				+ ", distance_from_current_station=" + distance_from_current_station
				+ ", distance_from_current_station_txt=" + distance_from_current_station_txt + ", sta=" + sta + ", std="
				+ std + ", eta=" + eta + ", etd=" + etd + ", halt=" + halt + ", a_day=" + a_day + ", arrival_delay="
				+ arrival_delay + ", platform_number=" + platform_number + ", on_time_rating=" + on_time_rating
				+ ", station_lat=" + station_lat + ", station_lng=" + station_lng + ", stoppage_number="
				+ stoppage_number + ", day=" + day + ", eta_a_min=" + eta_a_min + ", food_available=" + food_available
				+ ", non_stops=" + non_stops + "]";
	}
	
}
