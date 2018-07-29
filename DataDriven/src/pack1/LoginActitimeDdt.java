 package pack1;
 

import java.util.concurrent.TimeUnit;

import lib.ExcelDataConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginActitimeDdt {
@Test(dataProvider="actidata")

		public void firefoxTest(String username,String password) throws InterruptedException {

		WebDriver wb=new FirefoxDriver();
         wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wb.get("http://sony-pc:8080/login.do");
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
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\Sony\\workspace_selenium\\DataDriven\\TestData\\InputData.xlsx");
		int rows=config.getRowCount(0);
		
		Object[][]data=new Object[rows][2];
		for(int i=0;i<rows;i++){
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);

		}
		return data;


	
	}

}
