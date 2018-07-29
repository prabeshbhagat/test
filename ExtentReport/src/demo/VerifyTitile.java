package demo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyTitile {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@Test
public void verifyGoogle() throws InterruptedException{
		report=new ExtentReports("C:\\REPORTS\\allreports.html");
		report.startTest("verifyfacebooktitle");
		
		driver=new FirefoxDriver();
		logger.log(LogStatus.INFO, "browsr started");
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "browser maximized");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		logger.log(LogStatus.INFO, "App is up and running");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		logger.log(LogStatus.PASS, "title verified","C:\\Users\\Public\\Pictures\\Sample Pictures.jpg");
		
		
	report.endTest(logger);
	report.flush();
	driver.get("C:\\REPORTS\\allreports.html");
}
	
}
