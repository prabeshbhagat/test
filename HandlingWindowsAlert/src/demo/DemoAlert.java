package demo;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAlert {

	@Test
	public void handleAlert() throws Exception{
		WebDriver wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wb.get("http://www.ksrtc.in/");
		wb.findElement(By.xpath("//a[@class='button1 redbtn']")).click();
		Thread.sleep(2000);
		//Alert alt=wb.switchTo().alert();
		//alt.accept();
		String alt=wb.switchTo().alert().getText();
		System.out.println("alert mssg is"+alt);
		wb.switchTo().alert().accept();
		
		String exp_mssg="From' place is required.";
		Assert.assertEquals(alt, exp_mssg);
		wb.quit();

	} 

}
