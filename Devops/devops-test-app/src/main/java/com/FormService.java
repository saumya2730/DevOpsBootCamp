package com;

import java.util.regex.Pattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormService {
	
	@GetMapping("/firstname")
	public String checkFirstname(@RequestParam String name) {
		return name;
	}

	@GetMapping("/lastname")
	public String checkLastname(@RequestParam String name) {
		return name;
}
	
	@GetMapping("/username")
	public String checkUsername(@RequestParam String username) {
		return username;
	}
	
	@GetMapping("/email")
	public String checkEmail(@RequestParam String email) {
		return email;
	}
	
//	@GetMapping("/firstname")
//	public String checkFirstname(@RequestParam String name) {
////	String pattern = "^[A-Z][a-z]*";
////	Pattern p = Pattern.compile(pattern);
////	return p.toString();
//		//return "Saumya";
//	} 
	
//	@GetMapping("/lastname")
//	public String checkLastname() {
//		return "Saxena";
//	}
//	
//	@GetMapping("/username")
//	public String checkUsername() {
//		return "Saumya@1";
//	}
//	
//	@GetMapping("/email")
//	public String checkEmail(@RequestParam String email) {
//		return email;
//		String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
//		Pattern p = Pattern.compile(pattern);
//		return p.toString();
//	}
//	
//	@GetMapping("/password")
//	public String checkPassword() {
//		return "Saumya@1234";
//	}
	
}