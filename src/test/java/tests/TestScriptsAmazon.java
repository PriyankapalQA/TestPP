package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.CommonFunctions;
import utils.Config;
import utils.ExtentReport.ExtentTestManager;

public class TestScriptsAmazon extends BaseTest {

	CommonFunctions comObj= new CommonFunctions();

@Test
public void TC0_Hover_TestToolTip()
{
	try{

	comObj.openUrl("https://www.google.com",driver);
	//comObj.openUrl("https://docs.seleniumhq.org/",driver);
	
	Thread.sleep(4000);
	Actions act = new Actions(driver);
    WebElement googleLogo = driver.findElement(By.id("hplogo"));
//	WebElement googleLogo = driver.findElement(By.cssSelector("#header>h1 a"));
	
    Thread.sleep(2000);
    
    
    act.moveToElement(googleLogo).build().perform();
    Thread.sleep(4000);
    
    String ToolTipText = googleLogo.getAttribute("title");

    //Assert.assertEquals(ToolTipText, "Google");
//    WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));

	
//	String ToolTipText = toolTipElement.getText();
    
    
    Thread.sleep(2000);
    System.out.println("Tooltip value is: " + ToolTipText);
	
	}
	catch(Exception e)
	{
		System.out.println("test2: exception"+e.getMessage());
	}

	
}

/*@Test
	public void TC1_SearchItem_AddToCart()
	{

		//	ExtentTestManager.getTest().setDescription("Test1");
		try{

			comObj.openUrl("https://www.amazon.in",driver);

			WebDriverWait wait  = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-logo']/a")));
			WebElement e1=  driver.findElement(By.xpath("//*[@id='nav-logo']/a"));
			comObj.highlightCurrentElement(e1,driver);
			String logo =e1.getText();
			if(logo.equalsIgnoreCase("amazon"))
				System.out.println("Amazon Logo found");
			else
				System.out.println("Amazon Logo not found");
			
			String oldTab=comObj.getCurrentWindow(driver);

			WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
			comObj.highlightCurrentElement(search,driver);
			search.sendKeys("Fossil Machine Chronograph Black Dial Men's Watch - FS4682");
			search.submit();

			Thread.sleep(1000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result_0']/div/div[4]/div[1]/a/h2")));
			WebElement searchResult =driver.findElement(By.xpath("//*[@id='result_0']/div/div[4]/div[1]/a/h2"));
			comObj.highlightCurrentElement(searchResult,driver);
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
			WebElement cart=  driver.findElement(By.id("add-to-cart-button"));
			comObj.highlightCurrentElement(cart,driver);
			cart.click();

			WebElement cartVal=  driver.findElement(By.id("nav-cart-count"));
			comObj.highlightCurrentElement(cartVal,driver);
			String cartValue = cartVal.getText();
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


	}  */



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
