package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewCarsPage;

public class NewCarSearchCarGurusSteps {
	WebDriver driver;
	NewCarsPage ncPage = new NewCarsPage();

	@When("I click on New Cars")
	public void i_click_on_New_Cars() {
		ncPage.newCars.click();
	}

	@Then("I select all mandatory fields {string},{string},{string},{string},{string} and {string}")
	public void i_select_all_mandatory_fields_and(String make, String model, String year, String distance, String trim,
			String zipcode) throws InterruptedException {
		ncPage.selectDropDown(make, ncPage.make);
		ncPage.selectDropDown(model, ncPage.model);
		ncPage.selectDropDown(year, ncPage.year);
		ncPage.selectDropDown(trim, ncPage.trim);
		ncPage.selectDropDown(distance, ncPage.distance);
		ncPage.zipCode.sendKeys(zipcode);
	}

	@Then("I click on Search Bar")
	public void i_click_on_Search_Bar() {
		ncPage.shopCars.click();
	}
}
