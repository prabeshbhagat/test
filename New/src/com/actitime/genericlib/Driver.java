package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	public static WebDriver driver;
	public static WebDriver getDriver(){
		if(Constants.browser.equals("chrome")){
		      System.setProperty("webdriver.chrome.driver", 
		     "C:\\Users\\DEEPU\\Desktop\\new\\chromedriver.exe");
		      driver = new ChromeDriver();
		}else if(Constants.browser.equals("ie")){
			   System.setProperty("webdriver.ie.driver", 
			"C:\\Users\\DEEPU\\Desktop\\new\\IEDriverServer.exe");
			   driver = new InternetExplorerDriver();
		}else{
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
