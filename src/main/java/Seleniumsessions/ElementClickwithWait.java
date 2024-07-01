package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickwithWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By signUplink = By.linkText("Sign Up");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.clickWhenready(signUplink, 10);
		
	}

}
