package com.acttime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommomLib;

public class CreateNewUser extends WebDriverCommomLib{
	
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="firstName")
	private WebElement firstNameEdt;
	
	@FindBy(name="lastName")
	private WebElement lastNameEdt;
	
	@FindBy(name="email")
	private WebElement emailEdt;
	
	@FindBy(name="passwordText")
	private WebElement passwordTextEdt;
	
	@FindBy(name="passwordTextRetype")
	private WebElement passwordTextRetypeEdt;
	
	@FindBy(xpath="//input[contains(@value,'Create')]")
	private WebElement createUserBtn;
	
	public void createNewUSer(String userName , String firstName, String lastName, String email, String password){
		userNameEdt.sendKeys(userName);
		firstNameEdt.sendKeys(firstName);
		lastNameEdt.sendKeys(lastName);
		emailEdt.sendKeys(email);
		passwordTextEdt.sendKeys(password);
		passwordTextRetypeEdt.sendKeys(password);
		createUserBtn.click();
		waitForPageToLoad();
	}
	
	
	
	
	
	
	

}
