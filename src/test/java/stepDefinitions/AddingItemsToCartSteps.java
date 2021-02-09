package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AmazonAddToCart;
import utilities.BaseClass;

public class AddingItemsToCartSteps {

	public static WebDriver driver;
	BaseClass bcls = new BaseClass();
	AmazonAddToCart AmazonAddToCart;

	@Given("^I open \"([^\"]*)\" browser and launch the Amazon application$")
	public void i_open_browser_and_launch_the_Amazon_application(String strArg1) throws Throwable {
		// TODO Auto-generated method stub

		driver = bcls.setup(strArg1);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in/");
		System.out.println("This step is to enter into Amazon Application");
		System.out.println("Browser is " + strArg1);
	}

	@Then("^I click on Menu$")
	public void i_click_on_menu() throws InterruptedException {
		AmazonAddToCart = new AmazonAddToCart(driver);
		AmazonAddToCart.clickAmazonAllMenu();
		System.out.println("This step is to click on Amazon Menu");
	}

	@Then("^I select Echo and Alexa from under Digital content and Devices$")
	public void i_select_echo_and_alexa_from_under_digital_content_and_devices() {
		BaseClass.waitUntilExpectedConditions(driver, AmazonAddToCart.echoAndAlexaItem, 30);
		AmazonAddToCart.clickEchoAndAlexa();
		System.out.println("This step is to select Echo & Alexa");
	}

	@Then("^I select Echo Dot 3rd Gen item$")
	public void i_select_echo_dot_3rd_gen_item() throws InterruptedException {
		BaseClass.waitUntilExpectedConditions(driver, AmazonAddToCart.echoDot3rdGenItem, 30);
		AmazonAddToCart.clickEchoDot3rdGen();
		System.out.println("This step is to select Echo Dot (3rd Gen)");
	}

	@Then("^I retrieve the items count in cart$")
	public void i_retrieve_the_items_count_in_cart() {
		BaseClass.waitUntilExpectedConditions(driver, AmazonAddToCart.cartItemsCount, 30);		
		String cartValue = AmazonAddToCart.getCartItemsCount();
		System.out.println("This step is to retrieve the items count in cart");
		System.out.println("The items in the cart are " + cartValue);
	}

	@When("^I click on Add to cart")
	public void i_click_on_add_to_cart() {
		BaseClass.waitUntilExpectedConditions(driver, AmazonAddToCart.addItemsToCart, 30);	
		AmazonAddToCart.clickToAddItemsToCart();
		System.out.println("This step is to add items into cart");
	}

	@Then("^Added Items count in cart should be retrieved$")
	public void added_items_count_in_cart_should_be_retrieved() {
		BaseClass.waitUntilExpectedConditions(driver, AmazonAddToCart.updatedCartItemsCount, 30);	
		String cartValueUpdated = AmazonAddToCart.getUpdatedCartItemsCount();
		System.out.println("This step is to retrieve the items count in cart after adding them");
		System.out.println("The items in the cart are " + cartValueUpdated);
		driver.close();
	}
}
