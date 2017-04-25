package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	  System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
