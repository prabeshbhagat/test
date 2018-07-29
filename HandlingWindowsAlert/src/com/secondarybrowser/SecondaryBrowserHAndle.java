package com.secondarybrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class SecondaryBrowserHAndle {
public void handleSecondaryBrowserTest() throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	driver.findElement(By.linkText("Contact Us")).click();
	Thread.sleep(4000);
	Set<String>allhandles=driver.getWindowHandles();
	Iterator<String>it=allhandles.iterator();
	String mainhandle=it.next();
	String childhandle=it.next();
	driver.switchTo().window(childhandle);
	String ctc=driver.findElement(By.linkText("care@irctc.co.in")).getAttribute(childhandle);
	System.out.println(ctc);
	driver.close();
	driver.switchTo().window(mainhandle);
	driver.findElement(By.id("usernameId")).sendKeys("bibhujrk");
	driver.close();
	
}
}
