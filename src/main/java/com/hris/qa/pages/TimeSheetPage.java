package com.hris.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hris.qa.base.TestBase;

public class TimeSheetPage extends TestBase{


	@FindBy(css="head > title")
	WebElement TimeSheetTitle;
	
	@FindBy(css="#drawerDiv > user-profile-sidebar > div > div.pro-dtl-brief > div > ul.list-unstyled.pro-details-left.marginTop15 > li:nth-child(2) > span.pro-dtl-val.ng-scope > a")
    WebElement EmployeeName;
	
	public TimeSheetPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateTimeSheetTitle()
	{
		return driver.getTitle();
	}

public boolean validateEmployeeName()
{
	return EmployeeName.isDisplayed();
		
	
}
}
