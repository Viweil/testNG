package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class testBaidu {
	public WebDriver driver;
	String baseUrl = "http://www.baidu.com";
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
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
