package com.actitime.usertest;

import java.awt.print.PageFormat;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xerces.impl.io.Latin1Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.ExcelLib;
import com.actitime.genericlib.WebDriverCommomLib;
import com.acttime.pageobjectrepository.Common;
import com.acttime.pageobjectrepository.CreateNewUser;
import com.acttime.pageobjectrepository.EnterTimeTrack;
import com.acttime.pageobjectrepository.Login;
import com.acttime.pageobjectrepository.UserList;

public class USerTest {
	ExcelLib eLib;
	WebDriver driver;
	WebDriverCommomLib wLib;
	Login loginPage ;
	EnterTimeTrack timePage;
	UserList userListPage;
	CreateNewUser createUSer;
	Common commonPage;

	@BeforeClass
	public void configbeforeclass(){
		eLib = new ExcelLib();
		//get the browser object based on Constant browser variable
		driver = Driver.getDriver();
		wLib = new WebDriverCommomLib();
		loginPage = PageFactory.initElements(driver, Login.class);
		timePage = PageFactory.initElements(driver, EnterTimeTrack.class);
		userListPage = PageFactory.initElements(driver, UserList.class);
		createUSer = PageFactory.initElements(driver, CreateNewUser.class);
		commonPage = PageFactory.initElements(driver, Common.class);
		
	}

	
	@BeforeMethod
	public void configBeforeMtd(){
		String userID = Constants.userNAme;
		String password = Constants.password;
		
		//step 1 :  login to APP
		loginPage.loginToAPP();
	}
	@Test
	public void createUserTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//get data from Workbook
		String userName = eLib.getExcelData("Sheet1", 1, 2);
		String firstNAme = eLib.getExcelData("Sheet1", 1, 3);
		String lastNAme = eLib.getExcelData("Sheet1", 1, 4);
		String emailID = eLib.getExcelData("Sheet1", 1, 5);
		String uSerpassword = eLib.getExcelData("Sheet1", 1, 6);
		String expMsg = eLib.getExcelData("Sheet1", 1, 7);

		//step 2 : navigate to User Page
		timePage.navigateToUSerPage();
		//step 3 : createNew USer
		userListPage.navigateToCreateNewUSerPage();
		createUSer.createNewUSer(userName, firstNAme, lastNAme, emailID, uSerpassword);
		//step 4 : verify user sucessfull msg
		String actVal = userListPage.getSucMsgText().getText();
		Assert.assertEquals(expMsg, actVal,"msg not verfied==FAIL");
	
	}
	
	@Test
	public void modifyUSerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//get data from Workbook
				String userName = eLib.getExcelData("Sheet1", 2, 2);
				String firstNAme = eLib.getExcelData("Sheet1", 2, 3);
				String lastNAme = eLib.getExcelData("Sheet1", 2, 4);
				String emailID = eLib.getExcelData("Sheet1", 2, 5);
				String uSerpassword = eLib.getExcelData("Sheet1", 2, 6);
				String expMsg = eLib.getExcelData("Sheet1", 2, 7);

				//step 2 : navigate to User Page
				timePage.navigateToUSerPage();
				//step 3 : createNew USer
				userListPage.navigateToCreateNewUSerPage();
				createUSer.createNewUSer(userName, firstNAme, lastNAme, emailID, uSerpassword);
				//step 4 : modify User 
	}
	
	@AfterMethod
	public void configAfterMtd(){
		//step 5 : logout
		commonPage.logout();
	}
	
	@AfterClass
	public void configAfterClass(){
		driver.quit();
	}
	

	
}
