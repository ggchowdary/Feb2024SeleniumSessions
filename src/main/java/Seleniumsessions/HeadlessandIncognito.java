package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessandIncognito {

	public static void main(String[] args) {
		
		//Headless mode :
//		no physical browser - hides UI
//		faster
//		to be used when having headless based OS
//		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
