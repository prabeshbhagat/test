package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement {
@Test
public void monsterTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.monsterindia.com/");
	WebElement ele=driver.findElement(By.linkText("Jobs"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	WebElement ele2=driver.findElement(By.linkText("Government Jobs"));
	ele2.click();
	
}
}
