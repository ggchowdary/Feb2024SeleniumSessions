package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandlingBB {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		 	driver.get("https://www.bigbasket.com/");
		 	By label1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
//		 	By label2 = By.linkText("Beverages");
//		 	By label3 = By.linkText("Tea");
//		 	By label4 = By.linkText("Green Tea");
////		 	driver.findElement(label1).click();
//		 	Thread.sleep(2000);
//		 	Actions act = new Actions(driver);
//		 	act.moveToElement(driver.findElement(label2)).perform();
//		 	Thread.sleep(1000);
//		 	act.moveToElement(driver.findElement(label3)).perform();
//		 	Thread.sleep(1000);
//		 	driver.findElement(label4).click();
		 	level4MenuHandlingUsingClick(label1, "Beauty & Hygiene" , "Men's Grooming" , "Face & Body");
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void level4MenuHandlingUsingClick(By label1 , String label2 , String label3 , String label4) throws InterruptedException {
		getElement(label1).click();
	 	Thread.sleep(2000);
	 	Actions act = new Actions(driver);
	 	act.moveToElement(getElement(By.linkText(label2))).perform();
	 	Thread.sleep(1000);
	 	act.moveToElement(getElement(By.linkText(label3))).perform();
	 	Thread.sleep(1000);
	 	getElement(By.linkText(label4)).click();	
	}
	public static void level4MenuHandlingUsingClick(By label1 , By label2 , By label3 , By label4) throws InterruptedException {
		getElement(label1).click();
	 	Thread.sleep(2000);
	 	Actions act = new Actions(driver);
	 	act.moveToElement(getElement(label2)).perform();
	 	Thread.sleep(1000);
	 	act.moveToElement(getElement(label3)).perform();
	 	Thread.sleep(1000);
	 	getElement(label4).click();	
	}
	public static void level4MenuHandlingUsingMouseHover(By label1 , By label2 , By label3 , By label4) throws InterruptedException {
	 	Actions act1 = new Actions(driver);
	 	act1.moveToElement(getElement(label1)).perform();
	 	Thread.sleep(1000);
	 	act1.moveToElement(getElement(label2)).perform();
	 	Thread.sleep(1000);
	 	act1.moveToElement(getElement(label3)).perform();
	 	Thread.sleep(1000);
	 	getElement(label4).click();
	}
}
