package com.Booking.BookingTest;

import org.testng.annotations.Test;

import Pages.homePage;
import Pages.resultPage;

public class ReserveTripTest extends TestBase {
	homePage hp;
	resultPage rp;

	@Test
	public void makeTodayRequest() {
		hp = new homePage(driver);
		hp.searchField.sendKeys("Hurgada");
		hp.selectTravelDate("2021-11-03", "2021-11-07");
		hp.searchBtn.click();
		rp = new resultPage(driver);
		rp.getHotelNames();

	}

}
