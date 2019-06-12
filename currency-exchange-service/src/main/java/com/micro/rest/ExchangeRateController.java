package com.micro.rest;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.entity.ExchangeRate;
import com.micro.repo.ExchangeRateRepo;

@RestController
public class ExchangeRateController {

	Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Environment environment;
	
	@Autowired
	ExchangeRateRepo exchangeRateRepo;
	
	@GetMapping("/exchange-rates/{from}/to/{to}")
	public ExchangeRate getRate(@PathVariable String from, @PathVariable String to) {	
		ExchangeRate rate = exchangeRateRepo.findByFromRateAndToRate(from, to);
				
		log.info("rate :{} port: {}",rate.getRate(),rate.getPort());
		rate.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return rate;
	}
	

}
