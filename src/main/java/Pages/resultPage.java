package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.beust.jcommander.internal.Lists;
import com.google.inject.spi.Element;

public class resultPage extends pageBase {

	@FindAll(@FindBy(className = "e75f1d9859"))
	List<WebElement> hotels;
	
	public resultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	String hotelName;
	public void getHotelNames() {
		
			for(WebElement h : hotels) {
		String name= h.getAttribute("src").toString();
		if(!name.isEmpty()) {
					System.out.println(name);

				}
		else continue;
		   List<WebElement> hotel = h.findElements(By.tagName("img"));
		   
	        System.out.println(h.getTagName() + " has attributes: " + hotel.toString());
	        //.getAttribute("data-testid").toString()
		 //  String	hotelname= hotel.
		 //  String hot= hotelname.
		  // System.out.printf(hotelname);	
					
				//String	hotelname= hotel.toString();
				
				
			if(h.getAttribute("alt")!=null){
			//hotelName= h.getAttribute("alt");
			System.out.printf(hotelName);
			}			
			else continue;

}
			//return hotelName;

		
		
	}
	
	
	
}