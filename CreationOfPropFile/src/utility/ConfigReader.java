package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;
public ConfigReader() {
	try {
		File src=new File("./configuration/config.property");
		FileInputStream fis=new FileInputStream(src);
		 pro=new Properties();
		pro.load(fis);
	} catch (Exception e) {
		e.getMessage();
	}

}
public String getChromePath(){
	String path=pro.getProperty("ChromeDriver");
	return path;
	
}
public String getURL(){
	
			
	return pro.getProperty("URL");



}}
