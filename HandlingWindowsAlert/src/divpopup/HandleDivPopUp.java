package divpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleDivPopUp {
	@Test
public void divPopUpTest(){
		WebDriver wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wb.get("http://localhost:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
        wb.findElement(By.linkText("Tasks")).click();

		
        wb.findElement(By.linkText("Projects & Customers")).click();
		wb.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td[6]/input")).click();
	
	    wb.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[6]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]/input")).click();
	    String mssg=wb.findElement(By.className("confirmDialogApplyButton")).getText();
	    System.out.println(mssg);
	    
	    

}
}
