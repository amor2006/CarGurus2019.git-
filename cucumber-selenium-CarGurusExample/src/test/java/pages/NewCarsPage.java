package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Driver;

public class NewCarsPage {

	private WebDriver driver;

	public NewCarsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='New Cars']")
	public WebElement newCars;

	@FindBy(id = "submitTopicForm_0")
	public WebElement shopCars;
	@FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")
	public WebElement make;

	@FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")
	public WebElement model;

	@FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")
	public WebElement year;

	@FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")
	public WebElement trim;

	@FindBy(id = "distance")
	public WebElement distance;

	@FindBy(id = "stepOneSearchZip")
	public WebElement zipCode;

	public void selectDropDown(String visibleText, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public WebElement elementAfterWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return element;
	}

}
