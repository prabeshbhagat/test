package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageValidationTest {
	@Test
	public void actiElementTest(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
		try {
			WebElement logoimg=driver.findElement(By.xpath(".//*[@id='logoContainer']/div[2]/img"));
			boolean status=logoimg.isDisplayed();
			Assert.assertTrue(status,"the element is not dispalyed");
		} catch (NoSuchElementException e) {
			
			e.getMessage();
		}
			

		
	}

}
