package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Driver;

public class CarGurusSearch {
	private WebDriver driver;

	public CarGurusSearch() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "carPickerUsed_makerSelect")
	private WebElement makeDropdown;

	@FindBy(id = "carPickerUsed_modelSelect")
	private WebElement modelDropdown;

	@FindBy(xpath = "//form[@id='dealFinderForm']//input[@id='dealFinderZipUsedId']")
	private WebElement enterZIP;

	@FindBy(id = "dealFinderForm_0")
	public WebElement searchForMyNextCar;

	public void selectMake(String make) {
		Select select = new Select(makeDropdown);
		select.selectByVisibleText(make);
	}

	public void selectModel(String model) {
		Select select = new Select(modelDropdown);
		select.selectByVisibleText(model);
	}

	public void enterZIPCode(String zip) {
		enterZIP.sendKeys(zip);
	}
}
