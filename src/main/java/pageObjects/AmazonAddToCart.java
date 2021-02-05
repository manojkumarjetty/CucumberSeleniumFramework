package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddToCart {
	WebDriver driver;
	 
	 public AmazonAddToCart(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@id='nav-hamburger-menu']")
	 @CacheLookup
	 public WebElement amazonAllMenu;
	 
	 @FindBy(xpath="//div[text()='Echo & Alexa']")
	 @CacheLookup
	 public WebElement echoAndAlexaItem;
	 
	 @FindBy(xpath="//a[text()='Echo Dot (3rd Gen)']")
	 @CacheLookup
	 public WebElement echoDot3rdGenItem;
	 
	 @FindBy(xpath="//span[@id='nav-cart-count']")
	 @CacheLookup
	 public WebElement cartItemsCount;
	 
	 @FindBy(xpath="//input[@id='add-to-cart-button']")
	 @CacheLookup
	 public WebElement addItemsToCart;
	 
	 @FindBy(xpath="//span[@id='nav-cart-count']")
	 @CacheLookup
	 public WebElement updatedCartItemsCount;
	 
	 	 
	public void clickAmazonAllMenu() {
		amazonAllMenu.click();
		Actions act = new Actions(driver);
		act.moveToElement(amazonAllMenu).build().perform();
		}
	
	public void clickEchoAndAlexa() {
		echoAndAlexaItem.click();
	}
	
	public void clickEchoDot3rdGen() {
		echoDot3rdGenItem.click();
	}
	 
	public String getCartItemsCount() {
		return cartItemsCount.getText();
	}
	
	public void clickToAddItemsToCart() {
		addItemsToCart.click();
	}
	
	public String getUpdatedCartItemsCount() {
		return updatedCartItemsCount.getText();
	}
}
