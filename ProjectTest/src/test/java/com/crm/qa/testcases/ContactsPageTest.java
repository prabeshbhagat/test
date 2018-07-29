package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase
{

LoginPage loginpage;
HomePage homepage;
TestUtil testutil;
ContactsPage contactspage;


public ContactsPageTest(){
	super();
	
}

@BeforeMethod
public void setup() {
	initialization();
	testutil=new TestUtil();

	loginpage=new LoginPage();
	homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	testutil.switchToFrame();
	contactspage=homepage.clickOnContactsLink();

}
@Test
public void verifyContactsPage(){
	Assert.assertTrue(contactspage.verifyContactsLabel(),"missing contact label");
	
}
}