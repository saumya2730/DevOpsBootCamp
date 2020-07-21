package com;

import java.util.regex.Pattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormService {
	
	@GetMapping("/firstname")
	public String checkFirstname() {
		String pattern = "^[A-Z][a-z]*";
		Pattern p = Pattern.compile(pattern);
		return p.toString();
	}
	
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
	@GetMapping("/email")
	public String checkEmail() {
		String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(pattern);
		return p.toString();
	}
//	
//	@GetMapping("/password")
//	public String checkPassword() {
//		return "Saumya@1234";
//	}
	
}