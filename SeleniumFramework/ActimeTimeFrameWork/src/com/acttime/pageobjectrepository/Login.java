package com.acttime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.WebDriverCommomLib;

public class Login extends WebDriverCommomLib{
	
	@FindBy(name="username")
	private WebElement userNAmeEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	
	public void loginToAPP(){
		Driver.driver.get(Constants.url);
		userNAmeEdt.sendKeys(Constants.userNAme);
		passwordEdt.sendKeys(Constants.password);
		loginButton.click();
		waitForPageToLoad();
	}
	
	
	
	

}
