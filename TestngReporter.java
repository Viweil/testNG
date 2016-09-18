package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngReporter {
	  @Test (dependsOnMethods = "openBrowser")
	  public void signIn() {
		  System.out.println("2. sign in");
		  Reporter.log("signed in");
	  }
	  
	  @Test
	  public void openBrowser(){
		  System.out.println("1. open Browser");
		  Reporter.log("opened");
	  }
	  
	  @Test (dependsOnMethods = "signIn")
	  public void logOut(){
		  System.out.println("3. log Out");
		  Reporter.log("signed out");
	  }

}
