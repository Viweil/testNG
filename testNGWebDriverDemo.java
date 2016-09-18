package testNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGWebDriverDemo {
	public WebDriver driver;
	
	String baseUrl = "http://www.sogou.com/";
	
	
  @Test
  public void testSearch() {
	  driver.get(baseUrl);
	  driver.findElement(By.id("query")).sendKeys("selenium");
	  driver.findElement(By.id("stb")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("WebDriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	  driver = new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
