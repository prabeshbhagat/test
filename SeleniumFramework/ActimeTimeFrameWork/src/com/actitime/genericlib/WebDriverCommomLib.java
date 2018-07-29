package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommomLib {

	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForXpathPresent(String wbXpath){
		
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                  (By.xpath(wbXpath)));
		
	}
	
	public boolean verifyText(WebElement wb , String expString){
		boolean flag = false;
		String actVal = wb.getText();
		if(expString.equals(actVal)){
			flag = true;
			System.out.println(expString+ "= test is verified=PASS");
		}else{
			System.out.println(expString+ "= test is not verified=FAIL");

		}
		return flag;
	}
	
	
	
	
	

}
