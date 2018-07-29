package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
  
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//button[@type='button' and @class='btn']")
	WebElement SignUp;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive') and @src='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
	WebElement crmlogo;
	
	public LoginPage(){
	PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public boolean validateCRMImage(){
		return crmlogo.isDisplayed();
		
		
	}
	public HomePage login(String un,String pw){
		Username.sendKeys(un);
		Password.sendKeys(pw);
		Submit.click();
	
		return new HomePage();
		
	}

}
	

