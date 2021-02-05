package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AmazonHomePage;
import utilities.ReadTestData;

public class AmazonSearchSteps {
	WebDriver driver;
	AmazonHomePage AmazonHomePage;
	ReadTestData ReadTestData;
	int rowCount;
	String cellValue;

	String exceleFilePath = "TestData/cucumberTestData.xlsx";
	String exceleSheetName = "Sheet1";

	@Given("^I open a browser$")
	public void i_open_a_browser() {
		System.out.println("I have opened a browser");
	}

	@Then("^I navigate to amazon page$")
	public void i_navigate_to_amazon_page() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}

	@When("^I enter searchItem \"([^\"]*)\" in search keyword$")
	public void i_enter_searchItem_in_search_keyword(String strArg1) throws IOException {
		AmazonHomePage = new AmazonHomePage(driver);
		cellValue = utilities.ReadTestData.returnTestdataForTestcase(strArg1, exceleFilePath, exceleSheetName);
		System.out.println(cellValue);
		AmazonHomePage.clickSearchTextBox(cellValue);
		System.out.println("I have searched for " + cellValue + " item from Amazon website");
	}

	@And("^I validate searched text$")
	public void i_validate_searched_text() throws InterruptedException {
		AmazonHomePage.clickSearchSubmitButton();
		System.out.println("I validate searched text");
	}

	@Then("^Items should be displayed properly$")
	public void items_should_be_displayed_properly() {
		System.out.println("Items should be displayed properly");
		driver.close();
	}

}
