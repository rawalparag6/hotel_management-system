package com.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DepartmentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentalApplication.class, args);
	}

}
