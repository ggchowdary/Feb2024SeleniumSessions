package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//approach 1
		
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		//approach 2

//		WebElement emailid = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailid.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
		
		//approach3
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement email_ele = driver.findElement(email);
//		WebElement pass_ele = driver.findElement(password);
//		email_ele.sendKeys("naveen@gmail.com");
//		pass_ele.sendKeys("test@123");
		
//		//approach4
//		By email = By.id("input-email");
//		By pass = By.id("input-password");
//		getElement(email).sendKeys("naveen@gmail.com");
//		getElement(pass).sendKeys("test@123");
//		
		//approach5
//		By email = By.id("input-email");
//		By pass = By.id("input-password");
//		doSendKeys(email,"naveen@gmail.com");
//		doSendKeys(pass,"test@123");
		
//		approach 6
		By email = By.id("input-email");
		By pass = By.id("input-password");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doSendKeys(email,"naveen@gmail.com");
		eutil.doSendKeys(pass,"test@123");

		
		}
	
		public static void doSendKeys (By locator , String value) {
			getElement(locator).sendKeys(value);
		}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
}
