package Seleniumsessions;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {

	public static void main(String[] args) {
		
		// Launching chrome
		WebDriver d= new FirefoxDriver();
		
		//Launch URL
		d.get("https://www.google.com");
	
		//get Title
		String Title=d.getTitle();
		System.out.println(Title);
		if(Title.equals("Google")) {
			System.out.println("Title is correct");}
			else {
				System.out.println("Title is incorrect");
}
		d.close();
		}
		
	}


 