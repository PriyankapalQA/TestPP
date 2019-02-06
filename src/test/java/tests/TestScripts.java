package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.CommonFunctions;
import utils.Config;
import utils.ExtentReport.ExtentTestManager;


public class TestScripts{

	CommonFunctions comObj= new CommonFunctions();
	
	
	@Test
	public void TC1_SearchItem_AddToCart() {
	//	ExtentTestManager.getTest().setDescription("Test1");
		try{
			BaseTest ob1 = new BaseTest();
			comObj.openUrl(Config.url,ob1.getDriver());
		//	comObj.openUrl(Config.url,driver);
			TimeUnit.SECONDS.sleep(2);
			System.out.println("test1");
			ob1.getDriver().quit();
		}
		catch(Exception e)
		{
			System.out.println("test1: exception"+e.getMessage());
		}
	}


	@Test
	public void TC2_Checkout_PayByDelivery() {
//		ExtentTestManager.getTest().setDescription("Test2");
	try{
			BaseTest ob2 = new BaseTest();
			comObj.openUrl("https://www.yahoo.com",ob2.getDriver());
		//	comObj.openUrl("https://www.yahoo.com",driver);
			TimeUnit.SECONDS.sleep(2);
			System.out.println("test2");
			ob2.getDriver().quit();
		//	Assert.fail();
		}
		catch(Exception e)
		{
			System.out.println("test2: exception"+e.getMessage());
		}
	}

	@Test
	public void TC3_SelectStoryBook() {
//			ExtentTestManager.getTest().setDescription("Test3");
		try{
			BaseTest ob3 = new BaseTest();
			comObj.openUrl("https://www.facebook.com",ob3.getDriver());
		//	comObj.openUrl("https://www.facebook.com",driver);
			TimeUnit.SECONDS.sleep(2);
			System.out.println("test2");
			ob3.getDriver().quit();
		}
		catch(Exception e)
		{
			System.out.println("test3: exception"+e.getMessage());
		}
	}



	@Test
	public void TC4_SelectStoryBook() {
//		  ExtentTestManager.getTest().setDescription("Test4");
		try{
			BaseTest ob4 = new BaseTest();
			comObj.openUrl("https://www.google.com",ob4.getDriver());
		//	comObj.openUrl("www.google.com",driver);
			TimeUnit.SECONDS.sleep(2);
			System.out.println("test4");
		//	Assert.fail();
			ob4.getDriver().quit();
		}
		catch(Exception e)
		{
			System.out.println("test4: exception"+e.getMessage());
		}
	}   




}



