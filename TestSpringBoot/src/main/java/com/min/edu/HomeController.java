package com.min.edu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		return "redirect:/info.do";
	}
	
	@GetMapping(value = "/info.do")
	public String info() {
		return "info";
	}
}
