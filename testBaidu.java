package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class testBaidu {
	public WebDriver driver;
	String baseUrl = "http://www.baidu.com";
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("WebDriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
	  }

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	  }
	
	@Test
	public void testBaiduSearch() {
		driver.get(baseUrl);
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
	}


}
