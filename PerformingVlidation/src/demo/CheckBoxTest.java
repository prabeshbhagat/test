package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest {
	@Test
public void checkIsSelectedTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/login.do");
	boolean selected;
	try {
		driver.findElement(By.xpath(".//*[@id='keepLoggedInCheckBox']")).click();
		selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		Assert.assertTrue(selected, "the check box is not selected");

	} catch (NoSuchElementException e) {
		
		e.getMessage();
	}
	
}
}
