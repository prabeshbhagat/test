package com.acttime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommomLib;

public class EnterTimeTrack extends WebDriverCommomLib{
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userImg;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskImg;
	
	public void navigateToUSerPage(){
		userImg.click();
		waitForPageToLoad();
	}
	
	public void navigateToTaskPage(){
		taskImg.click();
		waitForPageToLoad();
	}
}
