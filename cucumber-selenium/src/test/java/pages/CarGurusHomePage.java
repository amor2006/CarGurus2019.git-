package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CarGurusHomePage {
	private WebDriver driver;

	public CarGurusHomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBys({@FindBy (xpath = "//ul[@class='nav navbar-nav']/li")} )
	 public List <WebElement> topMenuBars;
}
