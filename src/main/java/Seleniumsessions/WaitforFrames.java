package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforFrames {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		By Flocator = By.xpath("//iframe[contains(@id,frame-one)]");
		waitforFrameBylocator(Flocator,10);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Chowdary");
		driver.switchTo().defaultContent();	
		String text = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
		System.out.println(text);
	}

	public static void waitforFrameBylocator(By framelocator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	
	public static void waitforFrameByIndex(int frameIndex , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitforFrameByName(By frameName , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}
	
	public static void waitforFrameByWebElement(WebElement frameElement , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
}
