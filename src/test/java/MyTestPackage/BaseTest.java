package MyTestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Seleniumsessions.BrowserException;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"browser" , "url"})
	@BeforeTest
	public void setup(String browserName , String url) {
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
			
		case "edge":
			driver= new EdgeDriver();
			break;

		case "firefox":
			driver= new FirefoxDriver();
			break;
		default:
			System.out.println("Give correct browser");
			throw new BrowserException("WRONG BROSWER PASSED");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
