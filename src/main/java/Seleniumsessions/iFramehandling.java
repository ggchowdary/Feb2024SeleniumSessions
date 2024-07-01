package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramehandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,frame-one)]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Chowdary");
		
		driver.switchTo().defaultContent();	
		
	}

}
