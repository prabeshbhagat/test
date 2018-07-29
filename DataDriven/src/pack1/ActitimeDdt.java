package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDdt {
@Test(dataProvider="actidata")

		public void firefoxTest(String username,String password) throws InterruptedException {

		WebDriver wb=new FirefoxDriver();
         wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wb.get("http://localhost:8080/login.do");
		wb.findElement(By.name("username")).sendKeys(username);
		wb.findElement(By.name("pwd")).sendKeys(password);
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
	
		System.out.println(wb.getTitle());
		Assert.assertTrue(wb.getTitle().contains("Time-Track"),"invalid credentials");
		System.out.println("page title verified");
		
}


	@DataProvider(name="actidata")
	public Object[][] passData(){
		Object[][]data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manag";
		data[1][0]="admin";
		data[1][1]="manager";
		data[2][0]="admin";
		data[2][1]="ad";
		return data;


	
	}

}
