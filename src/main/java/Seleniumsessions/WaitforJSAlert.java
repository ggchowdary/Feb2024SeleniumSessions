package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforJSAlert {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		String getJSAlertText = getJSAlertText(5);
		System.out.println(getJSAlertText);
		

	}
	public static Alert waitforJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getJSAlertText(int timeOut) {
		Alert alert = waitforJSAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;

}
	
	public static void aceeptAlert(int timeOut) {
		 waitforJSAlert(timeOut).accept();
}
	
	public static void dismissAlert(int timeOut) {
		 waitforJSAlert(timeOut).dismiss();
}
	
	public static void AlertSendKeys(int timeOut , String value) {
		 Alert alert = waitforJSAlert(timeOut);
			alert.sendKeys(value);
			alert.accept();
}
	
	
	
	
}