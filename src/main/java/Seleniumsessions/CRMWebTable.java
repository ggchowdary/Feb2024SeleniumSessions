package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		SelectLastUser("neha sharma");
		SelectUser("neha sharma",2);

;		

	}

	public static void SelectUser(String Username) {
		driver.findElement(By.xpath("//a[text()='"+Username+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}
	
	public static void SelectUser(String Username,int index) {
		if(index>0) {
		driver.findElement(By.xpath("(//a[text()='"+Username+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])["+index+"]")).click();
	}}
	
	public static void SelectLastUser(String Username) {
		driver.findElement(By.xpath("(//a[text()='"+Username+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[last()]")).click();
	}
	
	
	public static void multiSelectUser(String Username) {
		List<WebElement> checklist = driver.findElements(By.xpath("//a[text()='"+Username+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']"));
		for(WebElement e: checklist) {
			e.click();
		}
	
	
	}
	
	public static String getCompanyName(String Username) {
		return
		driver.findElement(By.xpath("//a[text()='"+Username+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	
	
}
