package stepDefinition;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintion {
WebDriver driver;
	
	
@Given("^user is already on login page$")
public void loginPage(){
	System.setProperty("webdriver.chrome.driver","D:\\Selenium jar\\New folder\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.freecrm.com/index.html");
}

@When("^When title of login page is Free CRM$")
public void loginPageTitle(){
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);

}
@Then("^user enters username and password$")
public void loginButton(){
	driver.findElement(By.name("username")).sendKeys("bibhutisahu11");
	driver.findElement(By.name("password")).sendKeys("Cognizant1");
}
@Then("Then user clicks on login button$")
public void clickOnLoginButton(){
	WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",loginbutton);
}

@Then("^user is on home page.$")

public void userHomePage(){
	String title=driver.getTitle();
	System.out.println("home page title is"+title);
	Assert.assertEquals("CRMPRO", title);
}


}
