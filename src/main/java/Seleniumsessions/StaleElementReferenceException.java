package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("ggc@gmail.com");
		driver.navigate().refresh();
		driver.findElement(By.id("input-email")).sendKeys("ggchow@gmail.com");

	}

}
