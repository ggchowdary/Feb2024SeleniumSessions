package Seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforMutipleElements {
		static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			By tlinks = By.xpath("//div[@id='navbar-collapse']/ul/li");
			int size = waitforPresenceofElementsLocated(tlinks,10).size();
			System.out.println(size);
			
			
	}
	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
		public static List<WebElement> waitforPresenceofElementsLocated(By locator , int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));	
		}
		
	/**
	 * 	
	 * @param locator
	 * @param timeOut
	 * @return
	 */
		public static List<WebElement> waitforVisibiltyofElementsLocated(By locator , int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
}
