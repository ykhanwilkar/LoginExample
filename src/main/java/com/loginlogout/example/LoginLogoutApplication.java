package com.loginlogout.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LoginLogoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginLogoutApplication.class, args);
	}

}
