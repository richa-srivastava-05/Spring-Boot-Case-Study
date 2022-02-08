package com.librarysys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController 
public class Controller {
	@GetMapping("/adminlogin")
	public String verifyAdmin(@RequestParam("u_name") String u_name, @RequestParam("pass") String pass){
		return "hui";
	}
		
}
 