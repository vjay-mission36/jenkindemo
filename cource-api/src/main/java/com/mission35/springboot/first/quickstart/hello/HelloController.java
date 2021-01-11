package com.mission35.springboot.first.quickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public String sayHello() {
		return "hellow spring boot";
	}
}
