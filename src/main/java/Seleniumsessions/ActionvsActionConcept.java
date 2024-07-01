package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionvsActionConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
		 	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 	By firstname = By.id("input-firstname");
		 	Actions act = new Actions(driver);
		 	Action action = act.sendKeys(driver.findElement(firstname), "ggchow").build();
//		 	act.click(driver.findElement(By.linkText("Forgotten Password"))).perform();	
	

	}

}
