package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		
		
	}

}