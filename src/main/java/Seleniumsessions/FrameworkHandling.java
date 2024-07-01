package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
//		driver.switchTo().frame(2);
//		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
