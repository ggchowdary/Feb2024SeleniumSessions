package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Current Crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("jex")).sendKeys("Current");
//
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("Love");
//		
//		driver.switchTo().parentFrame();
//		
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);

		
		
	}

}
