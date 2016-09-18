package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Grouping {	
	
  @Test(groups = {"human"}, priority=1)
  public void student() {
	  System.out.println("student method");
  }
  
  @Test(groups = {"human"}, priority=2)
  public void teacher(){
	  System.out.println("teacher method");
  }
  
  @Test(groups = {"animal"}, priority=3)
  public void cat() {
	  System.out.println("cat method");
  }
  
  @Test(groups = {"animal"}, priority=4)
  public void dog() {
	  System.out.println("dog method");
  }
  
  @Test(groups = {"animal"}, priority=5)
  public void feeder(){
	  System.out.println("feeder method");
  }

}
