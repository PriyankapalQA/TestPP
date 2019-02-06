package library;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import tests.BaseTest;

public class CommonFunctions {
	
	/*	public void setWebDriver(WebDriver driver) {
		this.driver = driver;
	}  */
	
    
	public  void openUrl(String url,WebDriver driver)
	{
		try
		{
			driver.get(url);
			driver.manage().window().maximize();  
			// DriverUtil.driver.manage().timeouts().implicitlyWait(,TimeUnit.SECONDS) ;
		
			
		}
	
		catch(Exception e)
		{
			System.out.println("Exception in opening driver "+e.getMessage());
		}
	}

	
	public  String getCurrentWindow(WebDriver driver)
	{
		 String  oldTab="";
		try
		{
		   oldTab = driver.getWindowHandle();
		}
	
		catch(Exception e)
		{
			System.out.println("Exception in opening driver "+e.getMessage());
		}
		return oldTab;
	}


	
}
