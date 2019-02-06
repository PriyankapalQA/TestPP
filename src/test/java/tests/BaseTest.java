package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import library.CommonFunctions;
import utils.Config;


public class BaseTest {

	public WebDriver driver;
	String browser="chrome";
//	CommonFunctions comObj= new CommonFunctions();

	public WebDriver getDriver() {
		return driver;
	}

	String driverPath=".\\resources\\DriverFiles";


//	@Parameters("browser")
	

	@BeforeMethod
	public void BaseTest1() 
	
//	public BaseTest()                           // use for running in local machine
	{
		Config.readConfigExcelFile();
				
		if (Config.browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", driverPath+"\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (Config.browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", driverPath+"\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options); 
			
		}
		else
		{
			System.out.println("Select ie/chrome as browser");
		}

		
	
		

	}


	/*	@BeforeMethod
	public BaseTest(String browser)                 // use for running with browser stack
	{
		final String USERNAME = "priyankapal2";
		final String AUTOMATE_KEY = "Lv4PBijFJkMARJVQynsF";
		final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768"); 

		if (browser.equalsIgnoreCase("ie"))
		{
			caps.setCapability("browser", "IE");
			caps.setCapability("browser_version", "11.0");
		}

		else if (browser.equalsIgnoreCase("chrome")) 
		{
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "62.0");
		}
		else
		{
			System.out.println("Select ie/chrome as browser");
		}
		try
		{
			driver = new RemoteWebDriver(new URL(URL), caps);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}  */


	@AfterMethod
	public void afterTest()
	{
		try{
			//	Thread.sleep(3000);
			driver.quit();

		}
		catch(Exception e)
		{
			System.out.println("exception"+e.getMessage());
		}
	}

}
