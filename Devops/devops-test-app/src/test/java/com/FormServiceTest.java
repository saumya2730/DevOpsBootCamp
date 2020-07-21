package com;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.FormService;

import jdk.internal.joptsimple.util.RegexMatcher;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FormServiceTest {

	FormService fs = new FormService();

	@Test
	public void test1() {
//		System.out.println("======================================");
//		System.out.println(fs.checkFirstname());
//		System.out.println("======================================");
//	
		Assertions.assertEquals(fs.checkFirstname("Saumya"), "Saumya");
		
	}
	
//	@Test
//	public void test2() {
//		Assertions.assertEquals(fs.checkFirstname("Saumya"), "saumya");
//		
//	}
//	
//	@Test
//	public void test3() {
//		Assertions.assertEquals(fs.checkFirstname("Saumya"), "saumya@");
//		//Assertions.assertEquals(fs.checkFirstname(), "saumya@");
//		
//	}
//	
//	@Test
//	public void test4() {
//		Assertions.assertEquals(fs.checkFirstname("Saumya"), "saumya1");
//		//Assertions.assertEquals(fs.checkFirstname(), "saumya1");
//		
//	}
//	
//	@Test
//	public void test5() {
//		Assertions.assertEquals(fs.checkFirstname("Saumya"), "saumya@12");
//		//Assertions.assertEquals(fs.checkFirstname(), "saumya@12");
//		
//	}
	
	@Test
	public void test6() {
		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "saumya.saxena2730@gmail.com");
		//Assertions.assertEquals(fs.checkEmail(), "saumya@gmail.com");
		
	}
//	
//	@Test
//	public void test7() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "saumya123@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya123@gmail.com");
//		
//	}
//	
//	@Test
//	public void test8() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "saumya.saxena123@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya.saxena123@gmail.com");
//		
//	}
//	
//	@Test
//	public void test9() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "saumya.saxena@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya.saxena@gmail.com");
//		
//	}
//	
//	@Test
//	public void test10() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "12@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), "12@gmail.com");
//		
//	}
//	
//	@Test
//	public void test11() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "1.2@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), "1.2@gmail.com");
//		
//	}
//	
//	@Test
//	public void test12() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "---------@gmail.com");
//		//Assertions.assertEquals(fs.checkEmail(), ".----@gmail.com");
//		
//	}
//	
//	@Test
//	public void test13() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@test.com"), "saumya.saxena@test.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya.saxena@test.com");
//		
//	}
//	
//	@Test
//	public void test14() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@tcs.com"), "saumya@tcs.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya@tcs.com");
//		
//	}
//	
//	@Test
//	public void test15() {
//		Assertions.assertEquals(fs.checkEmail("saumya.saxena2730@gmail.com"), "saumya123@tcs.com");
//		//Assertions.assertEquals(fs.checkEmail(), "saumya123@tcs.com");
//		
//	}
	
}
