package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	
	public ContactsPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyContactsLabel(){
		return ContactsLabel.isDisplayed();
		
		
	}
	
	
	}


