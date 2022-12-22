package com.webapp.signupproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.webapp.signupproject.repository.*", "com.webapp.signupproject.web.*"})
@EnableJpaRepositories("com.webapp.signupproject.model.User")
public class SignUpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignUpProjectApplication.class, args);
	}

}
