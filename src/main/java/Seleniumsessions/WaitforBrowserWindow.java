package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforBrowserWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.clickWhenready(twitter, 10);
		if(WaitforWindowstobe(2,10)) {
			
		}
	}

	public static Boolean WaitforWindowstobe(int totalWindows , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
	}
	
	
	
	
}
