package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PutMapping(value = "/getdata")
	public String getData()
	{
		return "Get Data Employee";
	}
}
