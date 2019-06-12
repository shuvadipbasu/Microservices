package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = {"com.micro.config"})
public class EurekaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServiceApplication.class, args);
	}

}
