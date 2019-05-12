package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Driver;

public class CareerPage {
	private WebDriver driver;

	public CareerPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Careers')]")
	public WebElement careersBar;
	@FindBy(xpath = "//button[@class='nwh-main-cta']")
	public WebElement findJobButton;
	@FindBy(xpath = "//span[contains(text(),'Senior Test Automation Architect/Manager')]")
	public WebElement testJobButton;

	public void scrollDownPage() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void windowHandlerByMe() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		}
	}

	public void untilClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
