package forpassed;

import java.util.concurrent.TimeUnit;

import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Actitime {
	@Test
	public void testingScreenshot(){
		WebDriver wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wb.get("http://sony-pc:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
Utility.captureScreenShot(wb, "acti1");
wb.findElement(By.xpath("//a[@class='logout']")).click();
Utility.captureScreenShot(wb, "acti2");

	}

}
