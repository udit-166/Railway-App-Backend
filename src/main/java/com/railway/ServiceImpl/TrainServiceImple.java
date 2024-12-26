package com.railway.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Service.TrainService;
import com.railway.model.Trains;
import com.railway.repository.TrainRepository;

@Service
public class TrainServiceImple implements TrainService{
	
	@Autowired
	private TrainRepository trainRepository;
	


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
	
}
