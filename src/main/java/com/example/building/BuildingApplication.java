package com.example.building;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.building")
public class BuildingApplication {

	public static void main(String[] args) {

			SpringApplication.run(BuildingApplication.class, args);
	}
}
