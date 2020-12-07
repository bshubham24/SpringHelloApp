package com.capgi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgi.dto.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello from Shubham";
	}

	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
		return "Hello " + fName + " " + lName + "!";
	}

	@GetMapping("/param/{fName}/{lName}")
	public String sayHelloParam(@PathVariable String fName, @PathVariable String lName) {
		return "Hello " + fName + " " + lName + "!";
	}

	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getfName() + " " + user.getlName() + "!";
	}

	@PutMapping("/put/{fName}")
	public String sayHelloPut(@PathVariable String fName, @RequestParam(value = "lName") String lName) {
		return "Hello " + fName + " " + lName + "!";
	}

}
