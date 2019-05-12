package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.BrowserUsefulMethods.waitForClickablility;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import pages.CareerPage;

public class CareerSteps {
	WebDriver driver;
	CareerPage sellMyCar = new CareerPage();

	@When("I scroll down till the end of the page and click on Careers")
	public void i_scroll_down_till_the_end_of_the_page_and_click_on_Careers() throws InterruptedException {
		sellMyCar.scrollDownPage();
		sellMyCar.careersBar.click();
		sellMyCar.windowHandlerByMe();
		waitForClickablility(sellMyCar.findJobButton, 20);
	}

	@When("I click on Find Jobs")
	public void i_click_on_Find_Jobs() {
		sellMyCar.findJobButton.click();
	}

	@When("On a new window I click on Test Automation Job and assert it")
	public void on_a_new_window_click_on_Test_Automation_Job_and_assert_it() {
		String expectedJob = "Senior Test Automation Architect/Manager";
		String actualJob = sellMyCar.testJobButton.getText();
		assertEquals(expectedJob, actualJob);
	}
}
