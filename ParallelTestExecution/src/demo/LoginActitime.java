package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginActitime {
@Test
	public void logInUsTest(){
	WebDriver wb=new FirefoxDriver();
	wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	wb.get("http://localhost:8080/login.do");
	wb.findElement(By.name("username")).sendKeys("admin");
	wb.findElement(By.name("pwd")).sendKeys("manager");
	wb.findElement(By.xpath("//a[@id='loginButton']")).click();

	wb.findElement(By.xpath("//a[@id='logoutLink']")).click();
	wb.close();
	
	
	

	}
@Test
public void testCase(){
	System.out.println("Testcase in "+getClass().getSimpleName()+
			"with thread id:"+Thread.currentThread().getId());
}

}
