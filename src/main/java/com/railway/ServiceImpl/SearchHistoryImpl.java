package com.railway.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Service.SearchHistoryService;
import com.railway.model.SearchHistory;
import com.railway.repository.SearchHistoryRepository;

@Service
public class SearchHistoryImpl implements SearchHistoryService {
	
	@Autowired
	private SearchHistoryRepository historyRepository;

	@Override
	public List<SearchHistory> getSearchHisotry() {
		
		return historyRepository.findAll();
	}

}
