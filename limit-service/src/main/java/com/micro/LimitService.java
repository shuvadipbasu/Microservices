package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.micro","com.micro.config.props"})
public class LimitService {

 public static void main(String[] args) {
	 SpringApplication.run(LimitService.class, args);
 }

}
