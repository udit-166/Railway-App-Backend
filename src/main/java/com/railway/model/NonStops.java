package com.railway.model;

public class NonStops {
	
	private long si_no;
	private String station_code;
	private String station_name;
	private boolean is_diverted_station;
	private int distance_from_source;
	private String sta;
	private String std;
	public long getSi_no() {
		return si_no;
	}
	public void setSi_no(long si_no) {
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
	public int getDistance_from_source() {
		return distance_from_source;
	}
	public void setDistance_from_source(int distance_from_source) {
		this.distance_from_source = distance_from_source;
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
	public NonStops(long si_no, String station_code, String station_name, boolean is_diverted_station,
			int distance_from_source, String sta, String std) {
		super();
		this.si_no = si_no;
		this.station_code = station_code;
		this.station_name = station_name;
		this.is_diverted_station = is_diverted_station;
		this.distance_from_source = distance_from_source;
		this.sta = sta;
		this.std = std;
	}
	public NonStops() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NonStops [si_no=" + si_no + ", station_code=" + station_code + ", station_name=" + station_name
				+ ", is_diverted_station=" + is_diverted_station + ", distance_from_source=" + distance_from_source
				+ ", sta=" + sta + ", std=" + std + "]";
	}
	
}
