package pack1;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	 @BeforeMethod (groups={"sanity"})
	  public void loginTest(){
		  System.out.println("login is successful");
		  
		  
	  }
	  @Test(groups={"regression"})
	  public void searchTest(){
		  System.out.println("search is successful");
		  
		  
	  }
	  @Test(groups={" regression "})

	  public void advSearchTest(){
		  System.out.println("adv search is successful");
		  
		  
	  }
	  @Test(groups={"sanity"})

	  public void buyProductsTest(){
		  System.out.println("buy products successful");
		  
		  
	  }
	  @AfterMethod(groups={"sanity"})
	  public void logoutTest(){
		  System.out.println("logout is successful");
		  
	  }	  
}
