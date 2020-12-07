package com.capgi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
		return "Hello " + fName + " " + lName + "!";
	}

	@GetMapping("/param/{fName}/{lName}")
	public String sayHelloParam(@PathVariable String fName, @PathVariable String lName) {
		return "Hello " + fName + " " + lName + "!";
	}
}
