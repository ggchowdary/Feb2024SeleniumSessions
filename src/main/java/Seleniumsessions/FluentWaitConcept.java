package Seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By PLink = By.linkText("Pricing");

		// Wait(I) --> Fluent Wait(C) -->WebDriver Wait(C)
		//default polling time in Selenium is 500 milliseconds
		
		waitForElementVisibilitywithFluentWait(PLink,10,2).click();
		
	}

	public static WebElement waitForElementVisibilitywithFluentWait(By locator , int timeOut , int Intervaltime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(Intervaltime))
						.ignoring(NoSuchElementException.class)
							.withMessage("Element is not found");

			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForElementPresencewithFluentWait(By locator , int timeOut , int Intervaltime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(Intervaltime))
						.ignoring(NoSuchElementException.class)
							.withMessage("Element is not found");

			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	
	
}
