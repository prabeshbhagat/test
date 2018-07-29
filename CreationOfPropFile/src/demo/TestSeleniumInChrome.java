package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniumInChrome {
	@Test
public void testchrome() throws Exception{
		ConfigReader config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromePath());

	WebDriver driver=new ChromeDriver();
	driver.get(config.getURL());
	
}
}
