package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
public class AddmissionApplication {

	public static void main(String[] args) {
		System.out.println("Addmission");
		SpringApplication.run(AddmissionApplication.class, args);
	}

}
