package com.table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {


	@RequestMapping("/")
	public String getHome()
	{
		return "/index.html";
		
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String getHome1()
	{
		return "/index.html12";
		
	}
}
