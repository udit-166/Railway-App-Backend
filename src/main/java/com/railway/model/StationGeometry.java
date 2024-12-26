package com.railway.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;

public class StationGeometry {
	
	@Column(name = "geo_type")
	private String type;
	
	@ElementCollection
	private List<Double> coordinates;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}
}
