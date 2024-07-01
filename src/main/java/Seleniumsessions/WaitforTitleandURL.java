package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleandURL {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By PLink = By.linkText("Pricing");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.clickWhenready(PLink, 10);
		String URL = waitforURLContains("pricing.html",5);
		System.out.println(URL);
	}
	public static String waitforURLContains(String URLFraction , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlContains(URLFraction))) {
			return driver.getCurrentUrl();
		}}
		catch(TimeoutException e){
			System.out.println("URL not found");
		}
		return driver.getCurrentUrl();
	}
	public static String waitforURLtoBe(String URL , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlToBe(URL))) {
			return driver.getCurrentUrl();
		}}
		catch(TimeoutException e){
			System.out.println("URL not found");
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitforTitleContains(String TitleFraction , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(TitleFraction))) {
			return driver.getTitle();
		}}
		catch(TimeoutException e){
			System.out.println("Title not found");
		}
		return driver.getTitle();
	}
	public static String waitforTitletoBe(String TitleVal , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(TitleVal))) {
			return driver.getTitle();
		}}
		catch(TimeoutException e){
			System.out.println("Title not found");
		}
		return driver.getTitle();
	}

}
