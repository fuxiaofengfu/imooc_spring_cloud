package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;

@EnableEurekaClient
@SpringBootApplication
public class ClientRouteTraceApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ClientRouteTraceApplication.class);
		springApplication.setAdditionalProfiles("client1");
		springApplication.run(args);
	}
}
