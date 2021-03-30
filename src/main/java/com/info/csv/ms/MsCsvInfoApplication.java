package com.info.csv.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsCsvInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCsvInfoApplication.class, args);
	}

}
