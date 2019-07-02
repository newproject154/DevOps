package Assignment5data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment5 {
WebDriver driver;
String url;
/*upload1="C:\\Users\\User\\Desktop\\sai.jpg";
upload2="C:\\Users\\User\\Desktop\\krishna.jpg";
upload3="C:\\Users\\User\\Desktop\\neemkarolibaba.jpg";
String Chooselist[3]= {upload1,upload2,upload3};
*/
@BeforeMethod
public void setupenvironment()
{
System.setProperty("webdriver.chrome.driver", "C:\\qaclass\\chromedriver.exe");
driver=new ChromeDriver();
url="http://the-internet.herokuapp.com/upload";
driver.manage().window().maximize();
}
@DataProvider(name = "sending")
public Object[][] sendData() {
	 return new Object[][]{
	   {"C:\\Users\\User\\Desktop\\sai.jpg"},
	   {"C:\\Users\\User\\Desktop\\krishna.jpg"},
	   {"C:\\Users\\User\\Desktop\\neemkarolibaba.jpg"}};
	 
	}
@Test(dataProvider="sending")
public void recieving(String uploadfile )
{		driver.get(url);
WebElement element1=driver.findElement(By.name("file"));
element1.sendKeys(uploadfile);
driver.findElement(By.id("file-submit")).click();
}
	

	}