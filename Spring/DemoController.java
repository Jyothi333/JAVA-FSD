package com.example.SpringDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@RequestMapping("/helloPage")
	public String getName() {
		return "Hello Team";
	}
	
	@RequestMapping("/greeting")
	public   List<String> getGreeting() {
		return Arrays.asList("good morning", "hello", "good even");
	}
	

}