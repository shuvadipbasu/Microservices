package com.micro.rest;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro.bean.ExchangeData;

//@FeignClient(name="currency-exchange-service",url="localhost:8200")
@FeignClient(name="netflix-api-gateway-service")
@RibbonClient(name="currency-exchange-service")
public interface ExchangeRateControllerProxy {
	
	@GetMapping("/currency-exchange-service/exchange-rates/{from}/to/{to}")
	public ExchangeData getRate(@PathVariable("from") String from, @PathVariable("to") String to);

}
