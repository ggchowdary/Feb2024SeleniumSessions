package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysusingPause {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		 	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 	By search = By.name("search");
//		 	String skey = "macbook";
//		 	Actions act = new Actions(driver);
//		 	char[] array = skey.toCharArray();
//		 	for (char c:array) {
//			 	act.sendKeys(driver.findElement(search),String.valueOf(c)).pause(500).perform();
//
//
//		 	}
//		 	
		 	doActionSendKeyswithPause(search , "samsung" , 500);
		
		
		
		
		
	}
		public static void doActionSendKeyswithPause(By locator , String value , long pausetime) {
			Actions act = new Actions(driver);
		 	char[] array = value.toCharArray();
		 	for (char c:array) {
			 	act.sendKeys(driver.findElement(locator),String.valueOf(c)).pause(pausetime).perform();
		 	}}
			
		 	public static void doActionSendKeyswithoutPause(By locator , String value) {
				Actions act = new Actions(driver);
			 	char[] array = value.toCharArray();
			 	for (char c:array) {
				 	act.sendKeys(driver.findElement(locator),String.valueOf(c)).pause(500).perform();
			 	}
		}
}
