package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser {
	@Test
	public void browserTest() throws AWTException, InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		
		
	}

}

