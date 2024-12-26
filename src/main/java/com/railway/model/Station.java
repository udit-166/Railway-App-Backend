package com.railway.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Embedded
	private StationGeometry geometry;
	
	
	private String type;
	
	@Embedded
	private StationProperties properties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StationGeometry getGeometry() {
		return geometry;
	}

	public void setGeometry(StationGeometry geometry) {
		this.geometry = geometry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public StationProperties getProperties() {
		return properties;
	}

	public void setProperties(StationProperties properties) {
		this.properties = properties;
	}

	public Station(Long id, StationGeometry geometry, String type, StationProperties properties) {
		super();
		this.id = id;
		this.geometry = geometry;
		this.type = type;
		this.properties = properties;
	}

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
