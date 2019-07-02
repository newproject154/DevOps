package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertE {
	WebDriver driver ;
	@Test
    public void Test1() {
		
		Assert.assertEquals(12, 13);
    	
    }
	@Test
	public void Test2() {
		Assert.assertEquals("Hello", "Hello");
	}
	@Test
	public void Test3() {
		String str = "Sai Krishna";
		Assert.assertTrue(str.contains("Sai Krishna"),"Defined element is verified");
	}
	@Test
	public void testCaseVerifyHomePage() {
		driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}
}