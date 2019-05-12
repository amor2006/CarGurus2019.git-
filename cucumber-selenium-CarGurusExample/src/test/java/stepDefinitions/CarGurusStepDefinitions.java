package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CarGurusSearch;
import utils.ConfigurationReader;
import utils.Driver;

public class CarGurusStepDefinitions {
	CarGurusSearch cghomePage = new CarGurusSearch();
	WebDriver driver;

	@Given("I am on CarGurus Home Page")
	public void i_am_on_CarGurus_Home_Page() {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(ConfigurationReader.getProperty("url"));
	}

	@Then("I select {string} and {string} of my next car")
	public void i_select_and_of_my_next_car(String make, String model) {
		cghomePage.selectMake(make);
		cghomePage.selectModel(model);
	}

	@Then("I enter the {string} code")
	public void i_enter_the_code(String zip) {
		cghomePage.enterZIPCode(zip);
	}

	@Then("I click on Search")
	public void i_click_on_Search() {
		cghomePage.searchForMyNextCar.click();
	}
}
