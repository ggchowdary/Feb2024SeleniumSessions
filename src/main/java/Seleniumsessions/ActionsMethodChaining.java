package Seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChaining {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 	driver = new ChromeDriver();
//		 	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		 	WebElement fname = driver.findElement(By.id("input-firstname"));
//		 	Actions act = new Actions(driver);
//		 	act.sendKeys(fname, "GGC")
//		 		.sendKeys(Keys.TAB)
//		 		.pause(1000)
//		 		.sendKeys("Chow")
//		 		.sendKeys(Keys.TAB)
//		 		.pause(1000)
//		 		.sendKeys("ggc@gmail.com")
//		 		.sendKeys(Keys.TAB)
//		 		.pause(1000)
//		 		.sendKeys("9889898998")
//		 		.sendKeys(Keys.TAB)
//		 		.pause(1000)
//		 		.sendKeys("ggc123")
//		 		.sendKeys(Keys.TAB)
//		 		.pause(1000)
//		 		.sendKeys("ggc123")
//		 		.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
//		 		.perform();
//		 		
		 	driver.get("https://www.amazon.in/");
		 	Actions act = new Actions(driver);
		 	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("MACBOOK").perform();

	}

}
