package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		 	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 	By ele = By.xpath("//span[text()='right click me']");
		 	Actions act = new Actions(driver);
		 	act.contextClick(driver.findElement(ele)).perform();
		 	
		 	List<WebElement> list = driver.findElements(By.xpath("//ul/li/span"));
		 	for (WebElement e:list) {
		 		String text = e.getText();
		 		System.out.println(text);
		 		if(text.equals("Copy")) {
		 			e.click();
		 			Alert alert = driver.switchTo().alert();
		 			alert.accept();


		 		}
		 	}
		 	
		 	
	}

}
