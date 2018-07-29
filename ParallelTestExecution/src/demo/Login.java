package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public void logInTest(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wb.get("http://localhost:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
	
		wb.findElement(By.xpath("//a[@id='logoutLink']")).click();
		wb.close();
		
		

	}
@Test
public void logInUsingFirefoxTest(){
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
