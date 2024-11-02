package com.railway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.railway.service.TrainService;

@RestController
@RequestMapping("/api/railway")
public class MainController {
	
	private final TrainService trainService;
	
	public MainController(TrainService trainService) {
		
		this.trainService = trainService;
	}
	
	@GetMapping("/train")
	public ResponseEntity<?> trainBetweenStation(){
			
			return ResponseEntity.ok(trainService.getTrainBetweenStation());
	}
	
	@GetMapping("/stations")
    public ResponseEntity<?> getStations(@RequestParam("query") String query) throws Exception {
		return ResponseEntity.ok(trainService.searchStation(query));
    }
	@GetMapping("/findTrain")
	public ResponseEntity<?> searchTrain(@RequestParam("query")String query){
			
			return ResponseEntity.ok(trainService.getTrain(query));
	}
	
	@GetMapping("/seatAvailability")
	public ResponseEntity<?> checkSeatAvailable(@RequestParam("classType")String classType, @RequestParam("fromStationCode")String fromStationCode, @RequestParam("quota")String quota
			, @RequestParam("toStationCode")String toStationCode,@RequestParam("trainNo")String trainNo, @RequestParam("date")String date){
			
			return ResponseEntity.ok(trainService.checkSeatAvailability(classType,fromStationCode,quota,toStationCode,trainNo,date));
	}
	
	@GetMapping("/checkPNR")
	public ResponseEntity<?> checkPNRStatus(@RequestParam("pnrNumber")String pnrNumber){
		return ResponseEntity.ok(trainService.getPNRStatus(pnrNumber));
	}
	
	@GetMapping("/runningStatus")
	public ResponseEntity<?> getRunningStatus(@RequestParam("trainNo")String trainNo){
		return ResponseEntity.ok(trainService.getRuuningStatus(trainNo));
	}
	
	@GetMapping("/trainSchedule")
	public ResponseEntity<?> checkTrainSchedule(@RequestParam("trainNo")String trainNo){
		return ResponseEntity.ok(trainService.checkTrainSchedule(trainNo));
	}
	
	
}
