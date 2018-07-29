package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FramesTest {
@Test
public void ibiboTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Sony/Desktop/ifrm.html");
	driver.switchTo().frame("b2");
	driver.findElement(By.xpath(".//*[@id='gi_source_st']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("html/body/a")).click();
	
	
	
}
}
