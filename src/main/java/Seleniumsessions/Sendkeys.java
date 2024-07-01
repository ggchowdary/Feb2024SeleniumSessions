package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

		static WebDriver driver;
		public static void main(String[] args)
		{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			driver.findElement(By.id("input-email")).sendKeys(null);			
		
		
	}

}
