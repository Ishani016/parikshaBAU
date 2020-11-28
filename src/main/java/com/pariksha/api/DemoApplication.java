package com.pariksha.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pariksha.api.services.UserServiceImplementation;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public UserServiceImplementation userServiceImplementation() {
        return new UserServiceImplementation();
	}
}
