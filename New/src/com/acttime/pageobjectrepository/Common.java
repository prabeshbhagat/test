package com.acttime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommomLib;

public class Common extends WebDriverCommomLib{
	
	@FindBy(id="logoutLink")
	private WebElement logoutLin;
	
	public void logout(){
		logoutLin.click();
		waitForPageToLoad();
	}

}
