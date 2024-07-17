package com.example.week11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class Week11Application {

	public static void main(String[] args) {
		SpringApplication.run(Week11Application.class, args);
	}

}
