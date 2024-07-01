package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("a.menulink"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		By Mainmenu=By.cssSelector("a.menulink");
		By subMenu = By.linkText("COURSES");
		handleParentSubMenu(Mainmenu,subMenu);
		
	}

		public static void handleParentSubMenu(By parentLocator , By subLocator) throws InterruptedException 
		{
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(parentLocator)).perform();
			Thread.sleep(2000);
			driver.findElement(subLocator).click();
		}
	
	
	
}
