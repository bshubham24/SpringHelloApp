package com.capgi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello from Shubham";
	}

	@RequestMapping("/query")
	public String sayHello(@RequestParam(value = "fName") String fName,@RequestParam(value="lName")String lName) {
		return "Hello " + fName +" "+lName+ "!";
	}
}
