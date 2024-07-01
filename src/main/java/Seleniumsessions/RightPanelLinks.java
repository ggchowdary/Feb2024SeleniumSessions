package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPanelLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> RightLinks = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		
		System.out.println(RightLinks.size());
		
		for(WebElement e : RightLinks) {
			String link = e.getText();
			System.out.println(link);
			
	}
	}

}
