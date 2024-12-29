package com.railway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Service.SearchHistoryService;
import com.railway.model.SearchHistory;

@RestController
@RequestMapping("/api/railway")
public class SearchHistoryController {
	
	@Autowired
	private SearchHistoryService historyService;
	
	@GetMapping("/history")
	public ResponseEntity<List<SearchHistory>> getSearchHistory(){
		
		List<SearchHistory> searchHistory = historyService.getSearchHisotry();
		
		return new ResponseEntity<>(searchHistory, HttpStatus.OK);
		
	}

}
