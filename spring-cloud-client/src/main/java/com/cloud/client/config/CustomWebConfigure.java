//package com.cloud.client.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@Import(CustomTraceInterceptor.class)
//public class CustomWebConfigure implements WebMvcConfigurer {
//
//	@Autowired
//	ApplicationContext applicationContext;
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		InterceptorRegistration registration = registry.addInterceptor(this.applicationContext
//				.getBean(CustomTraceInterceptor.class));
//		registration.order(10);
//	}
//}
