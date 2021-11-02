package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
		protected  WebDriver driver;
		//create constructor 

		public pageBase (WebDriver driver) {
			PageFactory.initElements(driver, this);
			//this.driver = driver;
		} 
		protected   void SendText(WebElement textBox,String text)
		{
			textBox.sendKeys(text);
		}
		protected  void scrollToElement(WebElement itemToScroll) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView", itemToScroll);
		}
		
		protected   void clickOnButton(WebElement btn)
		{
			btn.click();
		}
}
