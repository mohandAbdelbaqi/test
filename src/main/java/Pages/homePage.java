package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase{
	@FindBy(id = "ss")
	public WebElement searchField;
	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")
	private WebElement travelPeriodBtn;
	@FindBy(className = "bui-calendar__date")
	List<WebElement> calender ;
	@FindBy(className = "sb-searchbox__button")
	public WebElement searchBtn;
	public homePage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	String tripPeriod;
	public String selectTravelDate(String fromDate, String toData) 
	{	clickOnButton(travelPeriodBtn);
		for(WebElement e : calender) {
			if(e.getAttribute("data-date")!=null) {
			String date= e.getAttribute("data-date");
			if(date.equalsIgnoreCase(fromDate)) {
				clickOnButton(e);
			}
			else if (date.equalsIgnoreCase(toData)) {
				e.click();
			}
			tripPeriod= e.getText();			
		}
			}
		System.out.printf("Trip period from  %s  to  %s ",fromDate,toData);
		return tripPeriod;
	}
	}
	