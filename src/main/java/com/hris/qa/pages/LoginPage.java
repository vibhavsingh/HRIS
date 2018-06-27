package com.hris.qa.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hris.qa.base.TestBase;

public class LoginPage extends TestBase{
	//4 Page factories or Object Repositories defined below----> All the page factory objects below will be initialized to "driver" by initElements command in line 25
	@FindBy(name="txtUserName")
	WebElement txtUserName;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"demo-2\"]/div/div[1]/a/img")
	WebElement loginPageImage; 
	
	@FindBy(xpath="//*[@id=\"login\"]/form/div[1]/div")
	WebElement cautionAlert;
	//Initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);//Here 'this' points to the current class object
	}
	
//Actions
public String validateLoginPageTitle()
{
return driver.getTitle();	
}

public Boolean ValidateImage()
{
	return loginPageImage.isDisplayed();
}
public TimeSheetPage login(String um,String pwd)
{
	txtUserName.sendKeys(um);
	txtPassword.sendKeys(pwd);
	loginButton.click();
	try{if(cautionAlert.isDisplayed())
	{
		throw new ArithmeticException();
	}}
	catch(NoSuchElementException e)
	{
		e.printStackTrace();
	}
	return new TimeSheetPage();
}
}
