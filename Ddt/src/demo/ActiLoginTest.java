package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActiLoginTest {


	@Test
	public void firefoxTest() {
		WebDriver wb=new FirefoxDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wb.get("http://localhost:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
	
		System.out.println(wb.getTitle());
}

	}


