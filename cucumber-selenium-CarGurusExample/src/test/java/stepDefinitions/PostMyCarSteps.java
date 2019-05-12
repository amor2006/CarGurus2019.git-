package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SellMyCarPage;

public class PostMyCarSteps {
	WebDriver driver;
	SellMyCarPage sellMyCar = new SellMyCarPage();

	@When("I click on Sell My Car")
	public void i_click_on_Sell_My_Car() {
		sellMyCar.sellMyCarMenuBar.click();
	}

	@Then("I enter {string}")
	public void i_enter(String string) {
		sellMyCar.zipCode.sendKeys("02169");
	}

	@Then("I select all mandatory fields {string},{string},{string},{string},{string},{string},{string} and I click on I'm still paying off")
	public void i_select_all_mandatory_fields_and_I_click_on_I_m_still_paying_off(String make, String model,
			String year, String trim, String transmission, String engine, String miles) throws InterruptedException {
		sellMyCar.selectDropDown(make, sellMyCar.makeDropDown);
		sellMyCar.selectDropDown(model, sellMyCar.modelDropDown);
		sellMyCar.selectDropDown(year, sellMyCar.yearDropDown);
		sellMyCar.selectDropDown(trim, sellMyCar.trimDropDown);
		sellMyCar.selectDropDown(transmission, sellMyCar.transmissionDropDown);
		sellMyCar.selectDropDown(engine, sellMyCar.engineDropDown);
		sellMyCar.mileage.sendKeys(miles);
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sellMyCar.stillPayingButton));
		element.click();
	
	}

	@Then("I enter {string} and {string} colours")
	public void i_enter_and_colours(String exterior, String interior) {
		sellMyCar.exteriorColour.sendKeys(exterior);
		sellMyCar.interiorColour.sendKeys(interior);
	}

	@Then("I add additional {string}")
	public void i_add_additional(String description) {
		sellMyCar.description.sendKeys(description);
	}

	@Then("I upload {string}")
	public void i_upload(String file) throws AWTException {
		sellMyCar.uploadPhoto.click(); // ozuve uygun duzelt burasini
		StringSelection ss = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("I enter my {string} and {string} and click on I'm at least eighteen")
	public void i_enter_my_and_and_click_on_I_m_at_least_eighteen(String name, String lastName)
			throws InterruptedException {
		sellMyCar.yourName.sendKeys(name);
		sellMyCar.lastName.sendKeys(lastName);
		Thread.sleep(3000);
		sellMyCar.atLeast18Button.click();
	}

	@Then("I finally press on Post My Car")
	public void i_finally_press_on_Post_My_Car() {
		sellMyCar.postMyCar.click();
	}
}
