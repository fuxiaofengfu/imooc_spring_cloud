package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Profile;

@EnableEurekaClient
@SpringBootApplication
public class Client2Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Client2Application.class);
		springApplication.setAdditionalProfiles("client2");
		springApplication.run(args);
	}
}
