package Seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowwithMutipletabs {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
				driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			String pwid = driver.getWindowHandle();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
			driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
			driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
			
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			while(it.hasNext()) {
				String wid = it.next();
				driver.switchTo().window(wid);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				if(!pwid.equals(wid)) {
				driver.close();
				}
			}
			driver.switchTo().window(pwid);
			 
			System.out.println(driver.getTitle());	
			
	}

}
