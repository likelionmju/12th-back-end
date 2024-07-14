package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class Lion0703Application {

	public static void main(String[] args) {
		SpringApplication.run(Lion0703Application.class, args);
	}

}
