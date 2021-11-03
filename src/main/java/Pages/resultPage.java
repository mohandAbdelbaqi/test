package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class resultPage extends pageBase {

	@FindAll(@FindBy(className = "e75f1d9859"))
	List<WebElement> hotels;
	String hotelName;

	public resultPage(WebDriver driver) {
		super(driver);
	}

	public void getHotelNames() {

		for (WebElement hotel : hotels) {
			String hotelName = hotel.getAttribute("alt").toString();
			if (!hotelName.isEmpty()) {
				System.out.println(hotelName);
			}

			WebElement image = hotel.findElement(By.tagName("img"));

			System.out.println(hotel.getTagName() + " has attributes: " + hotelName);
			
		}
		// return hotelName;

	}

}