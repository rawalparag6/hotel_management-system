package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
@EnableEurekaClient
public class SpringSecurityMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMongoApplication.class, args);
	}
	@Bean 
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	    return new BCryptPasswordEncoder(); 
	}

}
//Important points

// not able to sign up using same username
// password validation
//make sure jwt expires after 30 mins
//role based authorization using jwt
//email validation