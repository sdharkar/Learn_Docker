package com.docker.projectdeo.dockerdemo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public Map<String, Object> getvalues(){
		Map<String, Object> data = new HashMap<>();
		data.put("message", "java api is working file");
		data.put("languages", Arrays.asList("Java", "Python", "C++"));
		data.put("code", 2345);
		return data;
	}

}

