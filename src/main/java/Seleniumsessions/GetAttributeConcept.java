package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By frtxlk = By.linkText("Forgotten Password");
		String hrefVal = driver.findElement(frtxlk).getAttribute("href");
		System.out.println(hrefVal);
	}
}
