package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(description="Checking login page title")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title,"Account Login");
	}
	
	
	@Test(description="Checking login page URL")
	public void URLTest() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("page URL is :" + currentUrl);
		Assert.assertTrue(currentUrl.contains("login"));
	}

	@Test(description="Checking login page Logo")
	public void LOGOTest() {
		boolean logo = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(logo, true);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}



}

