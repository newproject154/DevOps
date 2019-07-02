package selenium.practice.cucumber.CucumberPractice;

import org.apache.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class FacebookLoginFeature {
	ChromeDriver driver;
	
	@Given("^The user is in facebook login page$")
	public void the_user_is_in_facebook_login_page() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Eclipse\\EclipsePhoton\\eclipse-workspace\\Practice\\CucumberPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters a valid login username and password and clicks submit button$")
	public void user_enters_a_valid_login_username_and_password_and_clicks_submit_button() throws InterruptedException {
	    WebElement txtUsername = driver.findElement(By.id("email"));
	    WebElement txtPassword = driver.findElement(By.id("pass"));
	    WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		
		txtUsername.sendKeys("duddosai@gmail.com");
		txtPassword.sendKeys("9841053432");
		btnLogin.click();
		
		Thread.sleep(10000);
	}

	@Then("^User lands in facebook home page$")
	public void user_lands_in_facebook_home_page() throws InterruptedException {
		
		WebElement txtProfileName = driver.findElement(By.xpath("//span[text()='Sai Krishna']"));
		String txtProfile = txtProfileName.getText();
		Assert.assertEquals("Sai Krishna", txtProfile);
	}
	
}