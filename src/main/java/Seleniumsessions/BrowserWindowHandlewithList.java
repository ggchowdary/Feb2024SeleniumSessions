package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlewithList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//1. Fetch the window id:
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Converting Set to List
		List<String> handlesList = new ArrayList<String>(windowHandles);
		String pwid = handlesList.get(0);

	}

}
