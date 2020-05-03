package com.Ajith.contoller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontoller {
	
	@GetMapping("welcome")
	public String getname(Map<String, Object> model)
	{
		model.put("message", "HeyAjith");
		
		return "welcome";
		
	}

}
