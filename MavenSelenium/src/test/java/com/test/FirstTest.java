package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstTest {
	@Test

	public void tc_01(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Sony/Desktop/XPATH/Multiselectlistbox.html");
		WebElement ele=driver.findElement(By.xpath("html/body/select"));
		Select sel=new Select(ele);
		List<WebElement>alloptions=sel.getOptions();
		for(int i=0;i<alloptions.size();i++){
			WebElement a=alloptions.get(i);
			String t=a.getText();
			System.out.println(t);
		}
	}


	
}
