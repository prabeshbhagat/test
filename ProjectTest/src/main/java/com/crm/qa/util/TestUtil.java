package com.crm.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	
public static long PAGE_LOAD_TIMEOUT=20;
public static long IMPLICIT_WAIT=10;




public void switchToFrame(){
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("intercom-borderless-frame"));
	driver.switchTo().frame("intercom-borderless-frame");
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
	
	

		
		
	}
	
public static void takeScreenshotAtEndOfTest() throws IOException{
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String currentDir=System.getProperty("user.dir");
	FileUtils.copyFile(srcFile, new File(currentDir +"/screenshots/" + System.currentTimeMillis() +".png"));
}

public void switchToUserNameFrame(){
	driver.switchTo().frame("mainpanel");
}
}
