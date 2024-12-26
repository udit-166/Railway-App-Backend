package com.railway.ServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.railway.Service.StationService;
import com.railway.model.Station;
import com.railway.repository.StationRepository;


@Service
public class StationServiceImpl implements StationService{
	
	@Autowired
	private StationRepository stationRepository;

	



//	@Override
//	public List<Station> findStationsByName(String name) {
//	        return stationRepository.findByNameContainingIgnoreCase(name);
//	}





	@Override
	public void addStation(Station station) {
		Station stations = new Station();
		
		stations.setGeometry(station.getGeometry());
		stations.setType(station.getType());
		stations.setProperties(station.getProperties());
		
		
		stationRepository.save(stations);
		
	}

}
