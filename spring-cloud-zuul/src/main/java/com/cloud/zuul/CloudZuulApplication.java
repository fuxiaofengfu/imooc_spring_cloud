package com.cloud.zuul;

import com.cloud.zuul.filter.ErrorFilterDemo;
import com.cloud.zuul.filter.PostFilterDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class CloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulApplication.class, args);
	}

	@Bean
	public PostFilterDemo getPostFilterDemo() {
		return new PostFilterDemo();
	}

	@Bean
	public ErrorFilterDemo getErrorFilterDemo() {
		return new ErrorFilterDemo();
	}
}
