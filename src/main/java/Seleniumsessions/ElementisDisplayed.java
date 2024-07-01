package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisDisplayed {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");		
		By button = By.id("submitButton");
		boolean f1 = driver.findElement(button).isDisplayed();
		System.out.println(f1);
		boolean f2 = driver.findElement(button).isEnabled();
		System.out.println(f2);
		
		boolean b1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b1);
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b2);
		
		boolean f3 = driver.findElement(button).isDisplayed();
		System.out.println(f3);
		boolean f4 = driver.findElement(button).isEnabled();
		System.out.println(f4);
	}

}
