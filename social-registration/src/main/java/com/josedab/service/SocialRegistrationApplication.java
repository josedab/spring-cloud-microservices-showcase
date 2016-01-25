package com.josedab.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SocialRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialRegistrationApplication.class, args);
	}
}
