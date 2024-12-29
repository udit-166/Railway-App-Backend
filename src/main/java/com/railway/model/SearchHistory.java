package com.railway.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SearchHistory {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String train_code;
	
	private String train_name;
	
	private LocalDateTime search_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrain_code() {
		return train_code;
	}

	public void setTrain_code(String train_code) {
		this.train_code = train_code;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public LocalDateTime getSearch_time() {
		return search_time;
	}

	public void setSearch_time(LocalDateTime search_time) {
		this.search_time = search_time;
	}

	public SearchHistory(long id, String train_code, String train_name, LocalDateTime search_time) {
		super();
		this.id = id;
		this.train_code = train_code;
		this.train_name = train_name;
		this.search_time = search_time;
	}

	public SearchHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SearchHistory [id=" + id + ", train_code=" + train_code + ", train_name=" + train_name
				+ ", search_time=" + search_time + "]";
	}
	
	
	
	

}
