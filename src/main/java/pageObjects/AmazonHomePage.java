package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	@CacheLookup
	public WebElement twotabsearchtextbox;

	@FindBy(id = "nav-search-submit-button")
	@CacheLookup
	public WebElement searchsubmitbutton;

	public void clickSearchTextBox(String searchItem) {
		twotabsearchtextbox.sendKeys(searchItem);
	}

	public void clickSearchSubmitButton() {
		searchsubmitbutton.click();
	}
/**/
}
