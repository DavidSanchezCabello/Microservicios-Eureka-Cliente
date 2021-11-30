package com.dscode.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesEureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEureka2Application.class, args);
	}

}
