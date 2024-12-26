package com.railway.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Embeddable
public class Geometry {
	
	@Column(name = "geo_type")
	private String type;
	
	@ElementCollection
	private List<List<Double>> coordinates;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<List<Double>> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<List<Double>> coordinates) {
		this.coordinates = coordinates;
	}

	public Geometry(String type, List<List<Double>> coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}

	public Geometry() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	

	
	
}
