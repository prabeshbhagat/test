package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();

		loginpage=new LoginPage();
	}
		@Test(priority=1)
		public void LoginPageTitleTest(){
			 String title=loginpage.validateLoginPageTitle();
			Assert.assertTrue(title.contains("Free CRM for Any Business: Online Customer Relationship Software"),"failed");
		}
		
		@Test(priority=2)
		public void crmLogoImageTest(){
			boolean flag=loginpage.validateCRMImage();
			Assert.assertTrue(flag);
		}
		@Test(priority=3)
		public void loginTest(){
			 homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
		
		
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
