package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public WebDriver setup(String br) {

		if (br.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (br.equals("Firefox")) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");

			// Initialize Gecko Driver using Desired Capabilities Class
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;

	}

	// Clickable method declared explicitly
	public static void waitUntilExpectedConditions(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));// Expectedcondition
	}
}


