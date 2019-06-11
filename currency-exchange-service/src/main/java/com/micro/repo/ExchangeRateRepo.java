package com.micro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.entity.ExchangeRate;

public interface ExchangeRateRepo extends JpaRepository<ExchangeRate, Long> {
	
	public ExchangeRate findByFromRateAndToRate(String fromRate, String toRate);

}
