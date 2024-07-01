package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {

		// Thread.sleep(10000) --> static wait(no matter element is available or not , will wait for 10 secs)
		//Dynamic wait will wait till element is available and any other extra time will be cancelled
		//Dynamic Wait is of two types :
		// 1. Implicit Wait : It is Global wait i.e it'll be applied to all elements by default
		// 2. Explicit Wait
		//	2.a) WebDriver Wait
		//	2.b) Fluent Wait
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123123");
		driver.findElement(By.xpath("//input[@value='Login']"));

	}

}
