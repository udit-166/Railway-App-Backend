package com.railway.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.railway.Service.StationService;
import com.railway.model.Station;
import com.railway.model.Trains;
import com.railway.reponse.AuthResponse;
import com.railway.repository.StationRepository;

@RestController
@RequestMapping("/api/railway")
public class StationController {
	
	
	@Autowired
	private StationService stationService;
	
	@PostMapping("/addStation")
	public ResponseEntity<AuthResponse> addStationDetails(@RequestBody String requestBody) throws IOException {
	    // Sanitize the input JSON
	    String sanitizedInput = requestBody.replace("\u00A0", " ");
	    
	    // Convert sanitized JSON back to Trains array
	    ObjectMapper mapper = new ObjectMapper();
	    Station[] stations = mapper.readValue(sanitizedInput, Station[].class);
	    
	    for (Station station : stations) {
	        stationService.addStation(station);
	    }
	    
	    AuthResponse res = new AuthResponse();
	    res.setMessage("Response Send Successfully");
	    res.setStatus(true);
	    return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
	@GetMapping("/stations/search")
    public ResponseEntity<List<Station>> searchStations(
            @RequestParam String searchTerm) {
        List<Station> stations = stationService.getStationsBySearchTerm(searchTerm);
        return ResponseEntity.ok(stations);
    }
}
