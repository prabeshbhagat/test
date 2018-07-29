package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//td[contains(text(),'User: Bibhuti sahu')] ")
	WebElement User;
	
	@FindBy(xpath="//a[contains (text(),'Contacts')]")
	WebElement Contactstab;
	
	
	@FindBy(xpath="//a[contains (text(),'Deals')]")
	WebElement Dealstab;
	
	@FindBy(xpath="//a[contains (text(),'Tasks')]")
	WebElement taskstab;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle(){
		return driver.getTitle();}
		
		public boolean verifyCorrectUsername(){
			 return User.isDisplayed();
			
			
		}
	
	public ContactsPage clickOnContactsLink(){
		Contactstab.click();
		return new ContactsPage();
		
	}
	
	public DealsPage clickOnDealsLink(){
		Contactstab.click();
		return new DealsPage();
	}
		
		public TasksPage clickOntasksLink(){
			Contactstab.click();
			return new TasksPage();
	
	
	}
}
