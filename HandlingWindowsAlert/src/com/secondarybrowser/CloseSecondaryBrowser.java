package com.secondarybrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseSecondaryBrowser {
	@Test
public void onlySecondaryBrowsersClose(){
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.popuptest.com/popuptest1.html");
	String mainhandle=driver.getWindowHandle();
	Set<String>allhandles=driver.getWindowHandles();
	for(String hdl:allhandles){
		if(hdl.equals(mainhandle)){
			driver.switchTo().window(hdl);
			driver.close();
		}
	}
	driver.switchTo().window(mainhandle);
}
}
