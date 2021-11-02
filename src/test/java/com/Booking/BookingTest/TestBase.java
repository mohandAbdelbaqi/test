package com.Booking.BookingTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase   {
	protected static  WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void StartUP(@Optional("chrome") String WebBrowserName) {

		if (WebBrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		    //System.setProperty("webdriver.chrome.whitelistedIps", "");
			driver = new ChromeDriver();
			
		}
		else if(WebBrowserName.equalsIgnoreCase("firefox")){		
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(WebBrowserName.equalsIgnoreCase("IE")){				
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://Booking.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();

	}
}
