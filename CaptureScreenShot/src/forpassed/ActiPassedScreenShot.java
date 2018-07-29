package forpassed;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActiPassedScreenShot {
@Test
public  void passScreenshot(){
		WebDriver wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wb.get("http://sony-pc:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();

		try {
			TakesScreenshot ts=(TakesScreenshot) wb;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./shot/acti.png"));
		} catch (Exception e) {
			
			e.getMessage();
		
		}
		System.out.println("screenshot taken");
		
}
}
