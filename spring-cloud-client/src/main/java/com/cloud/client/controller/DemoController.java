package com.cloud.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class DemoController {

	@RequestMapping(value = {"client1"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String client1(@RequestParam String test, HttpServletRequest request) {
		if ("e".equals(test)) {
			throw new RuntimeException("client1 param test is error。。。。");
		}

		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			System.out.println("clien1=="+ header +"=="+request.getHeader(header));
		}

		return test;
	}

	@RequestMapping(value = {"client2"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String client2(@RequestParam String test, HttpServletRequest request) {
		if ("e".equals(test)) {
			throw new RuntimeException("client2 param test is error。。。。");
		}
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			System.out.println("clien2=="+header+"=="+request.getHeader(header));
		}
		return test;
	}
}
