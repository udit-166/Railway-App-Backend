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
import com.railway.Service.TrainService;
import com.railway.model.Trains;
import com.railway.reponse.AuthResponse;



@RestController
@RequestMapping("/api/railway")
public class MainController {
	
	@Autowired
	private TrainService trainService;
	
	
	@PostMapping("/createTrain")
	public ResponseEntity<AuthResponse> createTrainDetails(@RequestBody String requestBody) throws IOException {
	    // Sanitize the input JSON
	    String sanitizedInput = requestBody.replace("\u00A0", " ");
	    
	    // Convert sanitized JSON back to Trains array
	    ObjectMapper mapper = new ObjectMapper();
	    Trains[] trains = mapper.readValue(sanitizedInput, Trains[].class);
	    
	    for (Trains train : trains) {
	        trainService.createTrain(train);
	    }
	    
	    AuthResponse res = new AuthResponse();
	    res.setMessage("Response Send Successfully");
	    res.setStatus(true);
	    return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("/number/{trainNumber}")
    public ResponseEntity<Trains> getTrainByNumber(@PathVariable String trainNumber) {
        Trains train = trainService.getTrainByNumber(trainNumber);
        if (train != null) {
            return ResponseEntity.ok(train);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@GetMapping("/name/{trainName}")
    public ResponseEntity<List<Trains>> getTrainsByName(@PathVariable String trainName) {
        List<Trains> trains = trainService.getTrainByName(trainName);
        if (!trains.isEmpty()) {
            return ResponseEntity.ok(trains);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	 @GetMapping("/trains/between")
	    public ResponseEntity<List<Trains>> getTrainsBetweenStations(
	            @RequestParam String startStationCode,
	            @RequestParam String endStationCode) {
	        List<Trains> trains = trainService.getTrainsBetweenStations(startStationCode, endStationCode);
	        return ResponseEntity.ok(trains);
	    }
}