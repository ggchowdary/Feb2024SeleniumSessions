package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest{

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.pagegetTitle());
		System.out.println(brUtil.getPageURL());
		By email = By.id("input-email");
		By pass = By.id("input-password");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "naveen@gmail.com");
		eutil.doSendKeys(pass, "test@123");
		
		brUtil.pageclose();
	}
	
	

}
