package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.micro","com.micro.config.props"})
public class Application {

 public static void main(String[] args) {
	 SpringApplication.run(Application.class, args);
 }

}
