package testNG;

import org.testng.annotations.Test;

public class DependentTest {
  @Test (dependsOnMethods = "openBrowser")
  public void signIn() {
	  System.out.println("2. sign in");
  }
  
  @Test
  public void openBrowser(){
	  System.out.println("1. open Browser");
  }
  
  @Test (dependsOnMethods = "signIn")
  public void logOut(){
	  System.out.println("3. log Out");
  }
  
  
}
