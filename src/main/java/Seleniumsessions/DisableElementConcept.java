package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

		static WebDriver driver;

		public static void main(String[] args)  {

			driver=new ChromeDriver();
			driver.get("https:seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");		
//			By button = By.id("submitButton");
//			driver.findElement(button).click();
			driver.findElement(By.id("pass")).click();
			driver.findElement(By.id("pass")).sendKeys("Naveen");
		}

}
