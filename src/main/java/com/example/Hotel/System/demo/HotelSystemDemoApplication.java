package com.example.Hotel.System.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:env.properties")
public class HotelSystemDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSystemDemoApplication.class, args);
	}

}
