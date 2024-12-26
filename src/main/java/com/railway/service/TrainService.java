package com.railway.Service;

import java.util.List;

import com.railway.model.Trains;

public interface TrainService {
	 public void createTrain(Trains train);
	 
	 public Trains getTrainByNumber(String trainNumber);
	 
	 public List<Trains> getTrainByName(String trainName);
}
