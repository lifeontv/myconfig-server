package com.springtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${spring.config.name}")
	public String name;
	@RequestMapping("hello")
	public String hello() {
		return name;
	}
}
