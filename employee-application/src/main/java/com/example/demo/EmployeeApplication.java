package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.demo"})
@EnableFeignClients()
public class EmployeeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
}
