package com.railway.service;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.railway.model.CheckPnrstatus;
import com.railway.model.CheckTrainSchedule;
import com.railway.model.RunningStatus;
import com.railway.model.SearchStation;
import com.railway.model.SeatAvailability;
import com.railway.model.TrainBetweenStations;

@Service
public class TrainService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String url = "https://irctc1.p.rapidapi.com/api/v3/trainBetweenStations?fromStationCode=BVI&toStationCode=NDLS&dateOfJourney=2024-04-07";
	
	private static final String xRapidApiKey = "cb85a3ba4cmshdc7c19226993821p1f1166jsn0e102cac07da";
	
	private static final String getxRapidApiHost = "irctc1.p.rapidapi.com";
	
	public Object getTrainBetweenStation() {
		
		try {
			
			//set the header
			HttpHeaders headers = new HttpHeaders();
			headers.set("X-RapidAPI-Key", xRapidApiKey);
			headers.set("X-RapidAPI-Host", getxRapidApiHost);
			
			//get the value
			
			ResponseEntity<TrainBetweenStations> response = restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers),TrainBetweenStations.class);
			System.out.println(response.getBody());
			return response.getBody();
			
		} catch (Exception e) {
			System.out.println("Something went wrong while fetching the value from the RapidAPI"+e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception in calling the RapidApi",e);
			

		}
	}
	public Object searchStation(String query) throws Exception {
    try {
        String urlStr = "https://irctc1.p.rapidapi.com/api/v1/searchStation?query=" + query;
        
        //set headers
        HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", xRapidApiKey);
		headers.set("X-RapidAPI-Host", getxRapidApiHost);
		
		//get the value
		
		ResponseEntity<SearchStation> response = restTemplate.exchange(urlStr, HttpMethod.GET,new HttpEntity<>(headers),SearchStation.class);
		System.out.println(response.getBody());
		return response.getBody();
    }
    catch(Exception e){
    	System.out.println("Something went wrong while fetching the value from the RapidAPI"+e);
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception in calling the RapidApi",e);
		
    }
        
    }
	public Object getTrain(String trainNumber) {
			
			try {
				String urlStr = "https://irctc1.p.rapidapi.com/api/v1/searchTrain?query=" + trainNumber;
				//set the header
				HttpHeaders headers = new HttpHeaders();
				headers.set("X-RapidAPI-Key", xRapidApiKey);
				headers.set("X-RapidAPI-Host", getxRapidApiHost);
				
				//get the value
				
				ResponseEntity<TrainBetweenStations> response = restTemplate.exchange(urlStr, HttpMethod.GET,new HttpEntity<>(headers),TrainBetweenStations.class);
				System.out.println(response.getBody());
				return response.getBody();
				
			} catch (Exception e) {
				System.out.println("Something went wrong while fetching the value from the RapidAPI"+e);
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception in calling the RapidApi",e);
				
	
			}
	}
	public Object checkSeatAvailability(String classType,String fromStationCode,String quota,String toStationCode,String trainNo,String date) {
		
		try {
			String urlStr = "https://irctc1.p.rapidapi.com/api/v1/checkSeatAvailability?classType="+classType+"&fromStationCode="+fromStationCode+"&quota="+quota+"&toStationCode="+toStationCode+"&trainNo="+trainNo+"&date="+date;
			//set the header
			HttpHeaders headers = new HttpHeaders();
			headers.set("X-RapidAPI-Key", xRapidApiKey);
			headers.set("X-RapidAPI-Host", getxRapidApiHost);
			
			//get the value
			
			ResponseEntity<SeatAvailability> response = restTemplate.exchange(urlStr, HttpMethod.GET,new HttpEntity<>(headers),SeatAvailability.class);
			System.out.println(response.getBody());
			return response.getBody();
			
		} catch (Exception e) {
			System.out.println("Something went wrong while fetching the value from the RapidAPI"+e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception in calling the RapidApi",e);
			

		}
	}
	
	public Object getPNRStatus(String pnrNumber) {
		
		try {
		String url = "https://irctc1.p.rapidapi.com/api/v3/getPNRStatus?pnrNumber="+pnrNumber;
		
		// get the header
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", xRapidApiKey);
		headers.set("X-RapidAPI-Host", getxRapidApiHost);
		
		// get the value of the rapid api
		ResponseEntity<CheckPnrstatus> response = restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers),CheckPnrstatus.class);
		System.out.println(response.getBody());
		
		return response.getBody();
		}catch (Exception e) {
			System.out.println("Something went wrong while fetching the data from radip api"+e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"The endpoint is not calling",e);
		}
		
	}
	
	public Object getRuuningStatus(String trainNo) {
		try {
			
			String urlRunningStation = "https://irctc1.p.rapidapi.com/api/v1/liveTrainStatus?trainNo="+trainNo+"&startDay=1";
			
			// setting the header 
			HttpHeaders headers = new HttpHeaders();
			headers.set("X-RapidAPI-Key",xRapidApiKey);
			headers.set("X-RapidAPI-Host",getxRapidApiHost);
			
			//get the data from the radipapi
			
			ResponseEntity<RunningStatus> response = restTemplate.exchange(urlRunningStation,HttpMethod.GET,new HttpEntity<>(headers),RunningStatus.class);
			System.out.println(response.getBody());
			return response.getBody();
		} catch (Exception e) {
			System.out.println("something went wrong while fetching the data from rapid api"+e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"the endpoint is not working ");
		}
	}
	
	public Object checkTrainSchedule(String trainNo) {
		try {
			
			String urlRunningStation = "https://irctc1.p.rapidapi.com/api/v1/getTrainSchedule?trainNo="+trainNo;
			
			// setting the header 
			HttpHeaders headers = new HttpHeaders();
			headers.set("X-RapidAPI-Key",xRapidApiKey);
			headers.set("X-RapidAPI-Host",getxRapidApiHost);
			
			//get the data from the radipapi
			
			ResponseEntity<CheckTrainSchedule> response = restTemplate.exchange(urlRunningStation,HttpMethod.GET,new HttpEntity<>(headers),CheckTrainSchedule.class);
			System.out.println(response.getBody());
			return response.getBody();
		} catch (Exception e) {
			System.out.println("something went wrong while fetching the data from rapid api"+e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"the endpoint is not working ");
		}
	}
		

}
