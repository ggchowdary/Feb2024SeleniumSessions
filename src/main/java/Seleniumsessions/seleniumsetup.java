package Seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumsetup {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\Garapati.Chowdary\\OneDrive - GVC Group\\Documents\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com");
	}

}
