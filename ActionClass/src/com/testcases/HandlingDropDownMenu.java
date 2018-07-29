package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingDropDownMenu {
	@Test
	public void yatraTest(){
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.yatra.com/");
	Actions actions=new Actions(driver);	
	WebElement ele=driver.findElement(By.partialLinkText("Customer Support"));

	actions.moveToElement(ele).perform();
	driver.findElement(By.linkText("Contact Us")).click();
	}

}
