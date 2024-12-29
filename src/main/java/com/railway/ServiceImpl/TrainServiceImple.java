package com.railway.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Service.TrainService;
import com.railway.model.SearchHistory;
import com.railway.model.Station;
import com.railway.model.Trains;
import com.railway.repository.SearchHistoryRepository;
import com.railway.repository.StationRepository;
import com.railway.repository.TrainRepository;

@Service
public class TrainServiceImple implements TrainService{
	
	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private StationRepository stationRepository;
	
	@Autowired
	private SearchHistoryRepository searchHistoryRepository;
	


	@Override
	public void createTrain(Trains train) {
		
		
		 Trains trainDetails = new Trains();
		 
		 trainDetails.setGeometry(train.getGeometry());
		 trainDetails.setProperties(train.getProperties());
		 trainDetails.setType(train.getType());
		 
		 trainRepository.save(trainDetails);
		 
		 
	}



	@Override
	public Trains getTrainByNumber(String trainNumber) {
		return trainRepository.findByPropertiesNumber(trainNumber);
	}



	@Override
	public List<Trains> getTrainByName(String trainName) {
		return trainRepository.findByPropertiesNameContainingIgnoreCase(trainName);
	}
	
	@Override
	 public List<Trains> getTrainsBetweenStations(String startStationCode, String endStationCode) {
	        // Find start station and end station by their codes
	        Station startStation = stationRepository.findByPropertiesCode(startStationCode)
	                .orElseThrow(() -> new IllegalArgumentException("Start station not found"));

	        Station endStation = stationRepository.findByPropertiesCode(endStationCode)
	                .orElseThrow(() -> new IllegalArgumentException("End station not found"));
	        
	        if(startStation!=null) {
	        	SearchHistory history = new SearchHistory();
	        	history.setTrain_code(startStation.getProperties().getCode());
	        	history.setTrain_name(startStation.getProperties().getName());
	        	history.setSearch_time(LocalDateTime.now());
	        	
	        	searchHistoryRepository.save(history);
	        }
	        if(endStation!=null) {
	        	SearchHistory history2 = new SearchHistory();
	        	history2.setTrain_code(endStation.getProperties().getCode());
	        	history2.setTrain_name(endStation.getProperties().getName());
	        	history2.setSearch_time(LocalDateTime.now());
	        	
	        	searchHistoryRepository.save(history2);
	        }

	        // Get coordinates of the start and end stations
	        List<Double> startCoordinate = startStation.getGeometry().getCoordinates();
	        List<Double> endCoordinate = endStation.getGeometry().getCoordinates();

	        // Find trains passing through these stations
	        return trainRepository.findTrainsBetweenStations(startCoordinate, endCoordinate);
	    }
	
}
