package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PressCtrlA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
		      String url = "https://www.tutorialspoint.com/index.htm";
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		      // identify element
		      WebElement l = driver.findElement(By.id("gsc-i-id1"));
		      // enter text then ctrl+a with Keys.chord()
		      l.sendKeys("Selenium");
		      String s = Keys.chord(Keys.CONTROL, "a");
		      l.sendKeys(s);
		      
		      /*String copy = Keys.chord(Keys.CONTROL, "c");
		      l.sendKeys(copy);
		      System.out.println(copy);*/
		      
		      /*String selectAll = Keys.chord(Keys.CONTROL, "a");
		      l.sendKeys(selectAll);*/

		    //  driver.quit();
		   }

}
