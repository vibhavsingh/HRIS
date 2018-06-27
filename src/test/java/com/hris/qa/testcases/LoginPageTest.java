package com.hris.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hris.qa.base.TestBase;
import com.hris.qa.pages.LoginPage;
import com.hris.qa.pages.TimeSheetPage;

public class LoginPageTest extends TestBase{
	public LoginPage lp;
	public TimeSheetPage tsp;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		lp=new LoginPage();
	}
   @Test(priority=1)
   public void loginPageTitle()
   {
	   String title=lp.validateLoginPageTitle();
	   Assert.assertEquals(title, "HRIS Login");
   }
   @Test(priority=2)
   public void logoImageTest()
   {Boolean flag= lp.ValidateImage();
	  Assert.assertTrue(flag);
   }
	@Test(priority=3)
	public void loginTest()
	{
		tsp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
   public void shut() {
	   driver.quit();
   }

}
