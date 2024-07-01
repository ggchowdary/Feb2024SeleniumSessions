package Seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {

		String FnameJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";
		String ColorJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color');";

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		String Fcontent = jss.executeScript(FnameJS).toString();
		System.out.println(Fcontent);
		if(Fcontent.contains("*")) {
			System.out.println("It is mandatory");
		}
		
		
		String Color = jss.executeScript(ColorJS).toString();
		System.out.println(Color);
		
		
		
		
	}

}
	