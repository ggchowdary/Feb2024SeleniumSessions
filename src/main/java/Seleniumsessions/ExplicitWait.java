package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;
	public static void main(String[] args) {
		//Wait(I) - until(); is a method implemented by FluentWait class extended by WebDriverWait() class.
		// Never mix IMP and EXP wait
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		ele.sendKeys("test@gmail.com");
//		getElement(password).sendKeys("123123");
//		getElement(loginBtn).click();
		
		waitforElementVisibility(email,10).sendKeys("Test@gmail.com");
//		getElement(password).sendKeys("123123");
//		waitforElementPresence(loginBtn,5).click();
	}
	public static WebElement waitforElementPresence(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitforElementVisibility(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
