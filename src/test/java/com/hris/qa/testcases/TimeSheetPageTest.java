package com.hris.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeSheetPageTest {
	
	@FindBy(css="head > title")
	WebElement TimeSheetTitle;
	
	@FindBy(css="#drawerDiv > user-profile-sidebar > div > div.pro-dtl-brief > div > ul.list-unstyled.pro-details-left.marginTop15 > li:nth-child(2) > span.pro-dtl-val.ng-scope > a")
    WebElement EmployeeName;
	
	
}
