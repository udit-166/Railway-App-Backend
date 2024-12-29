package com.railway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.model.SearchHistory;

public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {

}
