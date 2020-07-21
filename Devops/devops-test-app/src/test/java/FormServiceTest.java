
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.FormService;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FormServiceTest {

	FormService fs = new FormService();

	@Test
	public void test1() {
		FormService fs = new FormService();
		Assertions.assertEquals(fs.checkFirstname(), "Saumya");
	}
	
	@Test
	public void test2() {
		FormService fs = new FormService();
		Assertions.assertEquals(fs.checkFirstname(), "saumya");
		
	}
	
	@Test
	public void test3() {
		Assertions.assertEquals(fs.checkFirstname(), "saumya@");
		
	}
	
	@Test
	public void test4() {
		Assertions.assertEquals(fs.checkFirstname(), "saumya1");
		
	}
	
	@Test
	public void test5() {
		Assertions.assertEquals(fs.checkFirstname(), "saumya@12");
		
	}
	
	@Test
	public void test6() {
		Assertions.assertEquals(fs.checkEmail(), "saumya@gmail.com");
		
	}
	
	@Test
	public void test7() {
		Assertions.assertEquals(fs.checkEmail(), "saumya123@gmail.com");
		
	}
	
	@Test
	public void test8() {
		Assertions.assertEquals(fs.checkEmail(), "saumya.saxena123@gmail.com");
		
	}
	
	@Test
	public void test9() {
		Assertions.assertEquals(fs.checkEmail(), "saumya.saxena@gmail.com");
		
	}
	
	@Test
	public void test10() {
		Assertions.assertEquals(fs.checkEmail(), "12@gmail.com");
		
	}
	
	@Test
	public void test11() {
		Assertions.assertEquals(fs.checkEmail(), "1.2@gmail.com");
		
	}
	
	@Test
	public void test12() {
		Assertions.assertEquals(fs.checkEmail(), ".----@gmail.com");
		
	}
	
	@Test
	public void test13() {
		Assertions.assertEquals(fs.checkEmail(), "saumya.saxena@test.com");
		
	}
	
	@Test
	public void test14() {
		Assertions.assertEquals(fs.checkEmail(), "saumya@tcs.com");
		
	}
	
	@Test
	public void test15() {
		Assertions.assertEquals(fs.checkEmail(), "saumya123@tcs.com");
		
	}
	
}
