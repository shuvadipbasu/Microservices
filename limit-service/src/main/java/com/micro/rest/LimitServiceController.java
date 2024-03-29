package com.micro.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.beans.LimitServiceBean;
import com.micro.config.props.Configuration;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration configuration; 
	
	@GetMapping("/limit")
	public LimitServiceBean getLimit() {
		return new LimitServiceBean(configuration.getMax(),configuration.getMin());
	}

}
