package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		//JSE is an Interface 
		//Remote WebDriver class is implementing JSE 
		//we use JSE to execute JS on browser 
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJs();
//		System.out.println(title);
//		String url = jsUtil.getURLByJs();
//		System.out.println(url);
//		jsUtil.generateJSAlert("login page");
//		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);	
		WebElement element = driver.findElement(By.id("username"));
//		jsUtil.drawBorder(element);
//		WebElement element1 = driver.findElement(By.id("password"));
//		jsUtil.drawBorder(element1);
		jsUtil.flash(element);
		
	
	
	}

}
