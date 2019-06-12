package com.micro.rest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.bean.ExchangeData;

@RestController
public class CurrencyCalculationService {

	Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	ExchangeRateControllerProxy proxy;
	//call rest service using rest client example
	@GetMapping("/calculation/{from}/to/{to}/unit/{unit}")
	public ExchangeData getRate(@PathVariable String from,
			@PathVariable String to,
			@PathVariable int unit) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		
        ResponseEntity<ExchangeData> responseEntity=  new RestTemplate().
        		getForEntity("http://localhost:8200/exchange-rates/{from}/to/{to}",
        				ExchangeData.class, 
        		uriVariables);		
		
        ExchangeData data = responseEntity.getBody();
        data.setUnit(BigDecimal.valueOf(unit));
        data.setValue((BigDecimal.valueOf(unit)).multiply(data.getRate()));
		return data;
	}
	
	
	@GetMapping("/calculation/feighn/{from}/to/{to}/unit/{unit}")
	public ExchangeData getFeighnRate(@PathVariable String from,
			@PathVariable String to,
			@PathVariable int unit) {	
		
        ExchangeData data =proxy.getRate(from, to);
        
        log.info("rate :{}",data.getRate());
        data.setUnit(BigDecimal.valueOf(unit));
        data.setValue((BigDecimal.valueOf(unit)).multiply(data.getRate()));
		return data;
	}
}
