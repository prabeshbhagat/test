package com.crm.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

 public class WebEventListener extends TestBase implements WebDriverEventListener {
public void beforeNavigateTo(String url,WebDriver driver){
	System.out.println("before navigating to : '"+ url +" ' ");
}

public void afterNavigateTo(String url,WebDriver driver){
System.out.println("after navigating to : '"+ url +" ' ");	
}

public void beforeChangeValueOf(WebElement element,WebDriver driver){
	System.out.println("Element value changed to: "+element.toString());
}

public void afterChangeValueOf(WebElement element,WebDriver driver){
	System.out.println("Element value changed to: "+element.toString());
}

public void beforeClickOn(WebElement element,WebDriver driver){
	System.out.println("trying to click on: "+element.toString());
}

public void afterClickOn(WebElement element,WebDriver driver){
	System.out.println("trying to click on: "+element.toString());
}

public void beforeNavigateBack(WebDriver driver){
	System.out.println("navigating back to previous page");
	
	
}
public void afterNavigateBack(WebDriver driver){
	System.out.println("navigating back to next page");
	
}


public void beforeNavigateForward(WebDriver driver){
	System.out.println("navigating forward to next page");
	
}

public void afterNavigateForward(WebDriver driver){
	System.out.println("navigating forward to next page");
	
}
public void onException(Throwable error,WebDriver driver)
{
	System.out.println("Exception occured " +error);
	try{
		TestUtil.takeScreenshotAtEndOfTest();
		
	} catch(IOException e){
		e.printStackTrace();
	}
	
}

public void beforeFindBy(By by,WebElement element,WebDriver driver){
	System.out.println("Trying to find by: " +by.toString());
}

public void afterFindBy(By by,WebElement element,WebDriver driver){
	System.out.println("Trying to find by: " +by.toString());
}
public void beforeScript(String script,WebDriver driver){
	
}
public void afterScript(String script,WebDriver driver){
	
}
public void beforeAlertAccept(WebDriver driver){
	
}

public void afterAlertAccept(WebDriver driver){
	
}

public void afterAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}

public void afterChangeValueOf(WebElement arg0, WebDriver arg1,
		CharSequence[] arg2) {
	// TODO Auto-generated method stub
	
}

public void afterNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}

public void beforeAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}

public void beforeChangeValueOf(WebElement arg0, WebDriver arg1,
		CharSequence[] arg2) {
	// TODO Auto-generated method stub
	
}

public void beforeNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
}
