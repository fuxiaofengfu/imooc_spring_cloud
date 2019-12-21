package com.cloud.client.controller;

import org.springframework.cloud.sleuth.annotation.ContinueSpan;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value={"demo"},method = {RequestMethod.POST,RequestMethod.GET})
	public String demoTest(@RequestParam String test){
		if("e".equals(test)){
			throw new RuntimeException("你犯错了。。。。");
		}
		return test;
	}
}
