package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signIn).perform();

		WebElement startHere = driver.findElement(By.linkText("Start here."));
		startHere.click();

		driver.findElement(By.xpath("//input[contains(@name,'customerName')]")).sendKeys("Satyaa");
		String amazonCustomerName = driver.findElement(By.xpath("//input[contains(@name,'customerName')]"))
				.getAttribute("value");
		System.out.println("amazonCustomerName is " + amazonCustomerName);

		// The below code will click on to change Mobile extension code
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();

		// The below code will select 'United States +1' Mobile extension code
		driver.findElement(By.xpath("//a[text()='United States +1']")).click();
		String selectPhoneExtension = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"))
				.getText();
		System.out.println("Selected Phone Extension is " + selectPhoneExtension);

		WebElement mobNumber = driver.findElement(By.xpath("//input[contains(@id,'ap_phone_number')]"));
		mobNumber.sendKeys("7032890327");
		String sentMobileNumber = driver.findElement(By.xpath("//input[contains(@id,'ap_phone_number')]"))
				.getAttribute("value");
		System.out.println("Mobile Number sent is " + sentMobileNumber);

		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'ap_password')]"));
		password.sendKeys("Satya@123");
		String sentPassword = password.getAttribute("value");
		System.out.println("Sent Password is " + sentPassword);

		driver.quit();

	}

}
