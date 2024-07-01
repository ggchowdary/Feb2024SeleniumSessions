package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By forgotpswd = By.linkText("Forgotten Password");
		By loginlink = By.linkText("Login");
		doClick(forgotpswd);
		doClick(loginlink);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
 