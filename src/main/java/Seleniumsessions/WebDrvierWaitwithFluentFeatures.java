package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDrvierWaitwithFluentFeatures {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By PLink = By.linkText("Pricing");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PLink)).click();
	}

}
