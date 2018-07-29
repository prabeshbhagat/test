package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestActitime {
	@Test
public void testConfig() throws Exception{
	File src=new File("./configuration/config.property");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new Properties();
	pro.load(fis);
	String chromepath=pro.getProperty("ChromeDriver");
	System.out.println("chromepath is" +chromepath);
}
}
