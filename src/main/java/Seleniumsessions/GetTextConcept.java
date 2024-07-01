package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		
//		String frtxlk = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(frtxlk);
//		
		By header = By.tagName("h2");
		By frtxlk = By.linkText("Forgotten Password");
		
		ElementUtil eutil = new ElementUtil(driver);
		String h = eutil.doGetText(header);
		System.out.println(h);
		
		
		
		
	}

}
