package com.vishnu.collaboration.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	public HomeController() {
		System.out.println("controller is ;loadesd");
	}
	@RequestMapping("/abc")
	String m1()
	{
		return "hello";
	}

}
