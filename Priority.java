package testNG;

import org.testng.annotations.Test;

public class Priority {
  @Test (priority = 1)
  public void bTest() {
	  System.out.println("1. bTest");
  }
  
  @Test (priority = 2)
  public void cTest() {
	  System.out.println("2. cTest");
  }
  
  @Test (priority = 3)
  public void aTest() {
	  System.out.println("3. aTest");
  }
}
