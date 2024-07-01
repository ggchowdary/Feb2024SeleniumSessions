package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
//1.
		static WebDriver driver;
		public static void main(String[] args)
		{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

			
			//1. By id
//			driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
////			driver.findElement(By.id("input-password")).sendKeys("Test@123");
//		
//			//2. By name
//			driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
//			
//			//3. Class name
//			driver.findElement(By.className("form-control")).sendKeys("naveen@gmail.com");
//		
//			//4. xpath is not attribute , it's address of element in html
//			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@1234");
//			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
//			//5. CSS selector is not attribute , 
//			driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//			driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//			driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

			
//			//6. Link text , only for links
//			driver.findElement(By.xpath("//*[@id=\"loginTable\"]/tbody/tr[3]/td/input")).click();
//			driver.findElement(By.xpath("//*[@id=\"type_event_event\"]/a")).click();

			//7. partial LInkText
//			driver.findElement(By.partialLinkText("Delivery")).click();
			
//			//8. tagname: html tag
//			String header=driver.findElement(By.tagName("h2")).getText()	;
//			System.out.println(header);
			
			
			
			
			
			

			
		}
		
		
		
		

}
