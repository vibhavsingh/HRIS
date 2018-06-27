package com.hris.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hris.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	public TestBase()// throws IOException
	{ //FileInputStream fis;
		
		
		try {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\vibhavsingh\\eclipse-workspace\\HRIS\\src\\main\\java\\com\\hris\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
public static void initialization()
{
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\vibhavsingh\\\\Downloads\\\\firefoxdriver\\\\geckodriver.exe");	
		driver = new FirefoxDriver(); 
	}

//driver.manage().window().maximize();
//driver.manage().deleteAllCookies();
//long TimeOut=prop.getProperty("PAGE_LOAD_TIMEOUT");
//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
}}
