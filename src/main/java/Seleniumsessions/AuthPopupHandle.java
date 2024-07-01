package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		String username="admin";
		String pass = "admin";

	WebDriver driver = new ChromeDriver();
	driver.get("https://"+username+":"+pass+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
