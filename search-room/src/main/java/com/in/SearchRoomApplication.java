package com.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SearchRoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchRoomApplication.class, args);
	}

}
