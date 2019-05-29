package com.micro.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.beans.LimitServiceBean;

@RestController
public class LimitService {
	
	@GetMapping("/limit")
	public LimitServiceBean getLimit() {
		return new LimitServiceBean(1000, 10);
	}

}
