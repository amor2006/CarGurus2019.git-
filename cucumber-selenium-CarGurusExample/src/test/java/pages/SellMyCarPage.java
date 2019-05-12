package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Driver;

public class SellMyCarPage {
	private WebDriver driver;

	public SellMyCarPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Sell My Car']")
	public WebElement sellMyCarMenuBar;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
	public WebElement sellMyCarButton;
	@FindBy(xpath = "//input[@name='carDescription.postalCode']")
	public WebElement zipCode;
	@FindBy(xpath = "//select[@name='carpicker.make']")
	public WebElement makeDropDown;
	@FindBy(xpath = "//select[@name='carpicker.model']")
	public WebElement modelDropDown;
	@FindBy(xpath = "//select[@name='carpicker.year']")
	public WebElement yearDropDown;
	@FindBy(xpath = "//select[@name='carpicker.trim']")
	public WebElement trimDropDown;
	@FindBy(xpath = "//select[@name='carDescription.transmission']")
	public WebElement transmissionDropDown;
	@FindBy(xpath = "//select[@name='carDescription.engineId']")
	public WebElement engineDropDown;
	@FindBy(xpath = "//input[@name='carDescription.mileage']")
	public WebElement mileage;
	@FindBy(xpath = "(//div[@class='icon-select'])[1]")
	public WebElement stillPayingButton;

	@FindBy(xpath = "//input[@name='exteriorColor']")
	public WebElement exteriorColour;
	@FindBy(xpath = "//input[@name='interiorColor']")
	public WebElement interiorColour;
	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement description;
	@FindBy(xpath = "//div[@for='pictureFile']")
	public WebElement uploadPhoto;
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement yourName;
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastName;
	@FindBy(xpath = "(//div[@class='icon-select'])[2]")
	public WebElement atLeast18Button;
	@FindBy(xpath = "//button[@class='btn btn-block btn-lg btn-primary']")
	public WebElement postMyCar;

	public void selectDropDown(String visibleText, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
}
