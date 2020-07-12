package com.wynk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.wynk")
@EnableScheduling
@RestController
public class WyncApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(WyncApplication.class, args);
	}
	
	
}
