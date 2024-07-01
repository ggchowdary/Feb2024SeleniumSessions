package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		 	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 	WebElement source = driver.findElement(By.id("draggable"));
		 	WebElement target = driver.findElement(By.id("droppable"));
		 	Actions act = new Actions(driver);
//		 	act.
//		 	clickAndHold(source)
//		 				.moveToElement(target)
//		 						.release()
//		 								.perform();
		 	
		 	act.dragAndDrop(source, target).perform();
	}

	
	
	public static void doDragandDrop(By sourceLocator , By targetLocator) {
		WebElement source = driver.findElement(By.id("draggable"));
	 	WebElement target = driver.findElement(By.id("droppable"));
	 	Actions act = new Actions(driver);
	 	act.dragAndDrop(source, target).perform();

	}
}
