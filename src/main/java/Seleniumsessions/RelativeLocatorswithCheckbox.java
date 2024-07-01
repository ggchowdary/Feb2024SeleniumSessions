package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocatorswithCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
//		WebElement base = driver.findElement(By.cssSelector("a.agree"));
//		driver.findElement(with(By.name("agree")).toRightOf(base)).click();
//		driver.findElement(with(By.xpath("//input[@value='Continue']")).toRightOf(base)).click();
		WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement btn = driver.findElement(By.linkText("Continue"));
		List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(btn));
		for(WebElement e : paraList) {
			System.out.println(e.getText());
		}
		
	}

}
