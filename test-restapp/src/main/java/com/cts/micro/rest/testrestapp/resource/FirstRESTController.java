package com.cts.micro.rest.testrestapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class FirstRESTController {

	@GetMapping("/hello/{username}")
	public String helloWorld(@PathVariable("username") final String username) {
		return "Hello World!! " + "I'm " + username;
	}

}
