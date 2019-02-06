package toolbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.BaseTest;
import utils.WaitUtil;

public class Actions extends BaseTest {
	
	int maxWaitForElement=10;
	
	public  WebDriverWait wait = new WebDriverWait(driver,maxWaitForElement);	
	public  JavascriptExecutor je = (JavascriptExecutor)driver;
	
	public  boolean isAlertPresent() 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}   
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}  
	}
	



	/*	 
	public  WebElement FocusOnElement(String type, String value) 
	{

		WebElement webElement = null;
		switch(type)
		{
			case "id": webElement = driver.findElement(By.id(value));
			break;
			case "name": webElement = driver.findElement(By.name(value));
			break;
			case "xpath" : webElement = driver.findElement(By.xpath(value));
			break;
			case "className" : webElement = driver.findElement(By.className(value));
			break;
			case "partialLinkText": webElement = driver.findElement(By.partialLinkText(value));
			break;
			case "linkText": webElement = driver.findElement(By.linkText(value));
			break;

			default: System.out.print("Invalid indentifier type");
		}

		HighlightCurrentElement(webElement);
		return webElement;
	}



	public  Select selectDropdown(String type, String value) 
	{
		Select webElementDrp=null;
		switch(type)
		{
			case "id": webElementDrp = new Select(driver.findElement(By.id(value)));
			break;
			case "name": webElementDrp = new Select(driver.findElement(By.name(value)));
			break;
			case "xpath" : webElementDrp = new Select(driver.findElement(By.xpath(value)));
			break;
			case "className" : webElementDrp = new Select(driver.findElement(By.className(value)));
			break;
			case "partialLinkText": webElementDrp = new Select(driver.findElement(By.partialLinkText(value)));
			break;
			case "linkText": webElementDrp = new Select(driver.findElement(By.linkText(value)));
			break;

			default: System.out.print("Invalid indentifier type");
		}

	//	HighlightCurrentElement1(webElementDrp);
		return webElementDrp;
	}


	public  List <WebElement> FocusOnElements(String type, String value) 
	{
		List<WebElement> webElement = null;
		switch(type)
		{
			case "id": webElement = driver.findElements(By.id(value));
			break;
			case "name": webElement = driver.findElements(By.name(value));
			break;
			case "xpath" : webElement = driver.findElements(By.xpath(value));
			break;
			case "className" : webElement = driver.findElements(By.className(value));
			break;
			case "partialLinkText": webElement = driver.findElements(By.partialLinkText(value));
			break;
			case "linkText": webElement = driver.findElements(By.linkText(value));
			break;

			default: System.out.print("Invalid indentifier type");
		}

		//HighlightCurrentElement(webElement);
		return webElement;
	}   */

/*	public  void waitTillElementClickable(String type, String value)
	{
		switch(type)
		{
		case "id": wait.until(ExpectedConditions.elementToBeClickable(By.id(value))); 
		break;
		case "name": wait.until(ExpectedConditions.elementToBeClickable(By.name(value)));
		break;
		case "xpath" : wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
		break;
		case "className" : wait.until(ExpectedConditions.elementToBeClickable(By.className(value)));
		break;
		case "partialLinkText": wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(value)));
		break;
		case "linkText": wait.until(ExpectedConditions.elementToBeClickable(By.linkText(value)));
		break;

		default: System.out.print("Invalid indentifier type");
		}

	}

	public  void waitTillElementVisible(String type, String value)
	{
		switch(type)
		{
		case "id": wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
		break;
		case "name": wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(value)));
		break;
		case "xpath" : wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
		break;
		case "className" : wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(value)));
		break;
		case "partialLinkText": wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(value)));
		break;
		case "linkText": wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(value)));
		break;

		default: System.out.print("Invalid indentifier type");
		}

	}

*/



	public  void hibernate()
	{
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver sessionInstance){
				return((JavascriptExecutor) sessionInstance).executeScript("return document.readyState").equals("complete");
			}
		};

	//	wait.until(pageLoadCondition);

	}


	public  void highlightCurrentElement(WebElement element)
	{
		for(int i=0;i<2;i++)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: orange; border:4px solid orange;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: pink; border:4px solid pink;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: yellow; border:4px solid yellow;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"");
		}
	}
	/*
	public  void HighlightCurrentElement1(Select element)
	{
		for(int i=0;i<2;i++)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: orange; border:4px solid orange;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: pink; border:4px solid pink;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"colour: yellow; border:4px solid yellow;");
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"");
		}
	}  */
	/*	public  boolean pageLoaded(final String title)
	{
		try
		{
			ExpectedCondition<Boolean> pageLoadCondition= new ExpectedCondition<Boolean>()
			 {
				public Boolean apply(WebDriver driver)
				{
					return driver.getTitle().equals(title);
  				}

		     };

		     wait.until(pageLoadCondition);
		     return true;
		  }
		 catch(Exception e)
		  {

		   	 return false;
		  }
	}*/


	public  boolean pageLoaded(final String title)
	{

		int maxTime=15;
		int waitTime=0;

		WaitUtil.waitJQueryAngular();
		
		while(waitTime<=maxTime)
		{
			try
			{
				driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
				if (driver.getTitle().equals(title))
					return true;
				
			}
			catch(Exception e)
			{
				waitTime++;
			}

		}

		return false;

	}

	public  void captureScreenshot()
	{
/*		try
		{
			String screenshotPath="\\Screenshot"+"\\"+RandomStringUtils.randomAlphanumeric(8)+".png";
			String fullSreenshotPath = ".\\output\\"+env+"\\"+currentDateTime+screenshotPath;

			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(fullSreenshotPath));

			screenshotPath="."+screenshotPath;  
	//		Reporter.addScreenCaptureFromPath(screenshotPath); 
		}
		catch(Exception e)
		{
			// Reporter.addStepLog("Unable to take screenshot");
			System.out.println("Unable to take screenshot, Exception encountered : "+e.getMessage());
		}
*/
	}


	public  void scroll_PageDown() 
	{
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}  

	public  void scroll_ToElement(WebElement element) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}  

	public  void scroll_DragScrollBarToEnd(WebElement scrollbar)
	{
		Actions act=new Actions();
		//WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("//*[@id='mCSB_1']/div[2]/div/div[1]/div"));
		int numberOfPixelsToDragTheScrollbarDown = 5000;
//		act.moveToElement(scrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
		//Actions.dragAndDropBy(Sourcelocator, x-axis pixel of Destinationlocator, y-axis pixel of Destinationlocator)
	}
	
	
	
	public  WebElement focusOnPopUp(String type,String value) 
	{
		int maxTime=20;
		int waitTime=0;
		WebElement webElement = null;

//		WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				//Thread.sleep(1000);


				switch(type)
				{
				case "id": webElement = driver.findElement(By.id(value));
				break;
				case "name": webElement = driver.findElement(By.name(value));
				break;
				case "xpath" : webElement = driver.findElement(By.xpath(value));
				break;
				case "className" : webElement = driver.findElement(By.className(value));
				break;
				case "partialLinkText": webElement = driver.findElement(By.partialLinkText(value));
				break;
				case "linkText": webElement = driver.findElement(By.linkText(value));
				break;

				default: System.out.print("Invalid indentifier type");
				}

				highlightCurrentElement(webElement);
				return webElement;


			}


			catch(Exception e)
			{
				try {
				//	Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		return webElement;


	}	
	
	

	public  WebElement focusOnElement(String type,String value) 
	{
		int maxTime=30;
		int waitTime=0;
		WebElement webElement = null;

//		WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				Thread.sleep(1000);


				switch(type)
				{
				case "id": webElement = driver.findElement(By.id(value));
				break;
				case "name": webElement = driver.findElement(By.name(value));
				break;
				case "xpath" : webElement = driver.findElement(By.xpath(value));
				break;
				case "className" : webElement = driver.findElement(By.className(value));
				break;
				case "partialLinkText": webElement = driver.findElement(By.partialLinkText(value));
				break;
				case "linkText": webElement = driver.findElement(By.linkText(value));
				break;

				default: System.out.print("Invalid indentifier type");
				}

				highlightCurrentElement(webElement);
				return webElement;


			}


			catch(Exception e)
			{
				try {
					Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		return webElement;


	}	

	
	

	public  void waitClick() 
	{
		int maxTime=30;
		int waitTime=0;
		

//		WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				Thread.sleep(1000);
//				focusOnElement(identifierType, dentifierValue).click();
				break;
			}


			catch(Exception e)
			{
				try {
					Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		

	}	
	

	
	
	
	public  List<WebElement> focusOnElements(String type,String value) 
	{
		int maxTime=30;
		int waitTime=0;
		List<WebElement> webElement = null;

//		WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				Thread.sleep(1000);


				switch(type)
				{
				case "id": webElement = driver.findElements(By.id(value));
				break;
				case "name": webElement = driver.findElements(By.name(value));
				break;
				case "xpath" : webElement = driver.findElements(By.xpath(value));
				break;
				case "className" : webElement = driver.findElements(By.className(value));
				break;
				case "partialLinkText": webElement = driver.findElements(By.partialLinkText(value));
				break;
				case "linkText": webElement = driver.findElements(By.linkText(value));
				break;

				default: System.out.print("Invalid indentifier type");
				}

				//	HighlightCurrentElement(webElement);
				return webElement;


			}


			catch(Exception e)
			{
				try {
					Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		return webElement;


	}	


	public  Select selectDropdown(String type,String value) 
	{
		int maxTime=10;
		int waitTime=0;
		Select webElementDrp=null;

	//	WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				Thread.sleep(1000);


				switch(type)
				{
				case "id": webElementDrp = new Select(driver.findElement(By.id(value)));
				break;
				case "name": webElementDrp = new Select(driver.findElement(By.name(value)));
				break;
				case "xpath" : webElementDrp = new Select(driver.findElement(By.xpath(value)));
				break;
				case "className" : webElementDrp = new Select(driver.findElement(By.className(value)));
				break;
				case "partialLinkText": webElementDrp = new Select(driver.findElement(By.partialLinkText(value)));
				break;
				case "linkText": webElementDrp = new Select(driver.findElement(By.linkText(value)));
				break;

				default: System.out.print("Invalid indentifier type");
				}
				//	HighlightCurrentElement(webElement);
				return webElementDrp;


			}


			catch(Exception e)
			{
				try {
					Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		return webElementDrp;


	}	
	
	
	
	
	public  Boolean waitElementIsPresent(String type, String value) 
	{

		int maxTime=35;
		int waitTime=0;
	
	//	WaitUtil.waitJQueryAngular();

		while(waitTime<=maxTime)
		{
			try
			{
				Thread.sleep(1000);

				switch(type)
				{
				case "id": driver.findElement(By.id(value));
				break;
				case "name": driver.findElement(By.name(value));
				break;
				case "xpath" : driver.findElement(By.xpath(value));
				break;
				case "className" : driver.findElement(By.className(value));
				break;
				case "partialLinkText": driver.findElement(By.partialLinkText(value));
				break;
				case "linkText": driver.findElement(By.linkText(value));
				break;

				default: System.out.print("Invalid indentifier type");
				}
				return true;
			}

			catch(Exception e)
			{
				try {
					Thread.sleep(1000);
					waitTime++;
				} 
				catch (Exception e1) {
					waitTime++;
				}


			}
		}
		return true;
	}



}
