package testNG;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestDataDrivenByCSVFile {
	public WebDriver driver;
	String baseUrl = "http://www.google.com/";
	// Use DataProvider as a comment, named test suite as "testData"
	
	@DataProvider(name = "testData")
	public static Object[][] words() throws IOException{
		// Call static method name is getTestData, get CSV test file
		return getTestData("E:\\GitHub\\TestNGPro\\testData.csv");
	}
		
	
  @Test(dataProvider="testData")
  public void testSearch(String searchWord1, String searchWord2, String searchResult) {
	  driver.get(baseUrl + "/");
	  driver.findElement(By.id("lst-ib")).sendKeys(searchWord1+" "+searchWord2);
	  driver.findElement(By.name("btnG")).click();
	  
	  // Use ExpectedCondition to make sure page has been loaded
	  
//	  (new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>(){
//			  @Override
//			  public Boolean apply(WebDriver d){
//		  return d.findElement(By.id("hplogo")).getText().contains("New Zealand");
//			  }
//	  });
	  
	  Assert.assertTrue(driver.getPageSource().contains(searchResult));	 
	  
  }
  
  @BeforeMethod
  public void beforeMethod(){
	  	System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
  }
  
  @AfterMethod
  public void afterMethod(){
	  driver.quit();
  }
  
  // Read CSV file
  public static Object[][] getTestData(String fileName) throws IOException{
	  List<Object[]> records = new ArrayList<Object[]>();
	  String record;
	  // set UTF-8, use BufferedReader read file content
	  BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
	  
	  // Ignore first line content
	  file.readLine();
	  
	  // Iterate file list and saved as records in ArrayList
	  while((record=file.readLine())!=null){
		  String fields[] = record.split(",");
		  for (int j = 0; j<fields.length; j++){
				String tem=fields[j].trim();
				
				fields[j] = " "+tem;
			}

		  records.add(fields);
	  }
	  
	  // Close file object
	  file.close();
	  
	  // Define return value
	  Object[][] results = new Object[records.size()][];
	  
	  for(int i=0; i<records.size(); i++){
		  results[i] = records.get(i);
	  }
	  
	  
	  return results;
  }
  
  
  
  
  
  
  
  
  
  
  
}
		