package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;
	
	public HomePageTest(){
		super();  
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil=new TestUtil();

		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToFrame();
		
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String HomePagetitle=homepage.verifyHomepageTitle();
		Assert.assertTrue(HomePagetitle.contains("CRMPRO"),"failed");
		
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		testutil.switchToUserNameFrame();
		Assert.assertTrue(homepage.verifyCorrectUsername());
	}
	
	
	@Test(priority=3)
	public void verifyContactslink(){
		testutil.switchToUserNameFrame();
		contactspage=homepage.clickOnContactsLink();
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
