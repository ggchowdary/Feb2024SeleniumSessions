package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Hamilton, Canada"));
//		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
//		System.out.println(leftRank);
		String rightRank = driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println(rightRank);
		String belowRank = driver.findElement(with(By.tagName("a")).below(element)).getText();
		System.out.println(belowRank);
//		String belowRank = driver.findElement(with(By.tagName("a")).below(element)).getText();
//		System.out.println(belowRank);
	}

}
