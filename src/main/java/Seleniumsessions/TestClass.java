package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestClass {

	static WebDriver driver;
	static ElementUtil eutil;
	static JavaScriptUtil jutil;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.sports.ladbrokes.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//nav/vn-header-section/vn-h-button)[2]//a/vn-menu-item-text-content/span")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@id='username']/input")).sendKeys("Jagadeesh");
		driver.findElement(By.xpath("//div[@id='password']/input")).sendKeys("Lbr12345");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/section/div/button")).click();
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("(//div//nav//a[@title='Horse Racing'])[1]")).click();
		act.scrollToElement(driver.findElement(By.id("bet-2263102229"))).click().perform();
		act.click(driver.findElement(By.xpath("//div/form/input[@name='amount']"))).perform();
		act.sendKeys("2").perform();
		act.click(driver.findElement(By.xpath("(//div/div/button/span)[3]"))).perform();
		
	}}

		