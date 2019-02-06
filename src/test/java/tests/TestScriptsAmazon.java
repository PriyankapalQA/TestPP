package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import library.CommonFunctions;
import utils.Config;
import utils.ExtentReport.ExtentTestManager;

public class TestScriptsAmazon extends BaseTest {

	CommonFunctions comObj= new CommonFunctions();
	WebDriverWait wait  = new WebDriverWait(driver, 10);

	@Test
	public void TC1_SearchItem_AddToCart()
	{
	//	ExtentTestManager.getTest().setDescription("Test1");
		try{
			comObj.openUrl("https://www.amazon.in",driver);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-logo']/a")));
			String logo = driver.findElement(By.xpath("//*[@id='nav-logo']/a")).getText();
			if(logo.equalsIgnoreCase("amazon"))
				System.out.println("Amazon Logo found");
			else
				System.out.println("Amazon Logo not found");
			String oldTab=comObj.getCurrentWindow(driver);

			WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("Fossil Machine Chronograph Black Dial Men's Watch - FS4682");
			search.submit();

			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result_0']/div/div[4]/div[1]/a/h2")));
			WebElement searchResult =driver.findElement(By.xpath("//*[@id='result_0']/div/div[4]/div[1]/a/h2"));
			String searchResultText = searchResult.getText();
			if (searchResultText.equalsIgnoreCase("Fossil Machine Chronograph Black Dial Men's Watch - FS4682"))
				System.out.println("Search result correct");
			else 
				System.out.println("Search result not correct");

			if (searchResultText.contains("Fossil Machine Chronograph Black Dial Men's Watch - FS4682"))
				System.out.println("1Search result correct");
			else 
				System.out.println("1Search result is not correct");

			searchResult.click();

			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			// change focus to new tab
			driver.switchTo().window(newTab.get(1));

			driver.findElement(By.id("add-to-cart-button")).click();

			String cartValue = driver.findElement(By.id("nav-cart-count")).getText();
			if (cartValue.equalsIgnoreCase("1"))
				System.out.println("Cart displaying 1 item");
			else 
				System.out.println("Cart not displaying 1 item");

			driver.switchTo().window(oldTab);
		}
		catch(Exception e)
		{
			System.out.println("test2: exception"+e.getMessage());
		}


	}



/*	@Test
	public void TC2_Checkout_PayByDelivery() {
		//		ExtentTestManager.getTest().setDescription("Test2");
		try{
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

		}
		catch(Exception e)
		{
			System.out.println("test3: exception"+e.getMessage());
		}
	}  */






}
