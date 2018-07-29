package com.acttime.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommomLib;

public class UserList extends WebDriverCommomLib{
	
	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createUSetBtn;
	
	@FindBy(className="successmsg")
	private WebElement sucMsgText;
	
	
	
	
	public WebElement getCreateUSetBtn() {
		return createUSetBtn;
	}




	public WebElement getSucMsgText() {
		return sucMsgText;
	}




	public void navigateToCreateNewUSerPage(){
		createUSetBtn.click();
		waitForPageToLoad();
		
	}
	
	

}
