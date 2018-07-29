package failedscreenshot;

import java.util.concurrent.TimeUnit;

import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CapturingFailedScreenShot {
	WebDriver wb;
	@Test
public void actiFailedScreenshot(){
		 wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wb.get("http://sony-pc:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();

wb.findElement(By.xpath("//a[@class='logouti']")).click();


	
}
@AfterMethod
public void tearDown(ITestResult result){
	if (ITestResult.FAILURE==result.getStatus()){
		Utility.captureScreenShot(wb, result.getName());
	}
	
}
}