package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> rightlinklist = driver.findElements(By.xpath("//a[@class='list-group-item11']"));
		System.out.println(rightlinklist.size());
		
		
		
		
	}

}
