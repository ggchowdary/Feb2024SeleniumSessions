package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsConcept {
		//go to URL
		//go back
		//go forward
		//refresh
		
		static WebDriver driver;

		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.navigate().to("https:www.google.com");
			System.out.println(driver.getTitle());
			driver.navigate().to("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.getTitle());
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			driver.navigate().refresh();
			System.out.println(driver.getTitle());

		
		}
		

}
