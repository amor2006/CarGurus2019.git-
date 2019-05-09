package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pages.CarGurusHomePage;

public class CarGurusMenuBarsStepDefinitions {

	WebDriver driver;
	CarGurusHomePage cgHomePage = new CarGurusHomePage();
	List<String> listOfTopMenus = new ArrayList<>();

	@Then("I get all menu bars from top")
	public void i_get_all_menu_bars_from_top() {
		listOfTopMenus.add("Used Cars");
		listOfTopMenus.add("New Cars");
		listOfTopMenus.add("Car Values");
		listOfTopMenus.add("Sell My Car");
		listOfTopMenus.add("Research");
		listOfTopMenus.add("Questions");
	}

	@Then("I verify all the menu bars in top menu are present and clickable")
	public void i_verify_all_the_menu_bars_in_top_menu_are_present_and_clickable() {
		
		for (int i = 0; i < cgHomePage.topMenuBars.size(); i++) {
			Assert.assertTrue(cgHomePage.topMenuBars.get(i).isDisplayed());
			Assert.assertEquals(listOfTopMenus.get(i), cgHomePage.topMenuBars.get(i).getText());
		}
		
	}
}
