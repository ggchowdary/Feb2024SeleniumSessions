package Seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//1. Fetch the window id:
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String pwid = iterator.next();
		System.out.println(pwid);
		String cwid = iterator.next();
		System.out.println(cwid);
		
		//2. Switching to Windows
		driver.switchTo().window(cwid);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
