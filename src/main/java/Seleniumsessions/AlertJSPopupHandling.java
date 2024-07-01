package Seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopupHandling {

	public static void main(String[] args) throws InterruptedException {
//		//JS Alerts - 1. alert()
//					  2. prompt()
//					  3. confirm()
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
//		alert.dismiss();
		
	}

}
