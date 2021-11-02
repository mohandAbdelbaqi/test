package Utilites;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.pageBase;
import Utilites.*;
public class operations extends pageBase {
public operations(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	//WebDriverWait wait;
	pageBase PBase ;

	 public  void waitForPageLoaded()
     {        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		

     }
	 public void ScrollDown()
     {
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeAsyncScript("window.scrollTo(0,0)");
     }
//          wait = new WebDriverWait(driver, new TimeSpan(0, 1, 0));
//         wait.Until(webdriver => ((JavaScriptExecutor)driver).ExecuteScript("return document.readyState").Equals("complete"));
//     }
}
