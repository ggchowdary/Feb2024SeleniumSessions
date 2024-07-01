package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean disp = driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(disp);
		By email = By.id("input-email11");
		By logo = By.className("img-responsive11");
//		if(doIsDisplayed(email)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		
//		}
//	
//		List<WebElement> emailList = driver.findElements(email);
//		if(emailList.size()==1) {
//			System.out.println("Email Id is present");
//		}
//		else {
//			System.out.println("Email Id is present more than once");}

		System.out.println(isElementDisplayed(logo));
		 By linkText = By.linkText("Forgotten Password");
		 System.out.println(isElementDisplayed(linkText,3));
		}
	
		public static boolean isElementDisplayed(By locator) {
			int elementCount = driver.findElements(locator).size();
			if(elementCount==1) {
				System.out.println("Element is displayed");
				return true;
			}else {
				System.out.println("Element is displayed more than once or no elements found");
			return false; 
		}}
		public static boolean isElementDisplayed(By locator,int expectedEleCount) {
			int elementCount = driver.findElements(locator).size();
			if(elementCount==expectedEleCount) {
				System.out.println("Element is displayed"+" "+expectedEleCount+"times");
				return true;
			}else {
				System.out.println("Element is displayed more than "+expectedEleCount+"times or no elements found");
			return false; 
		}}
	
	public static boolean doIsDisplayed(By locator) {
		try {
		boolean flag = getElement(locator).isDisplayed();
		return flag;
		}
		catch(NoSuchElementException e) {
			System.out.println("element with locator:"+locator+"is not displayed");
			return false;}
		
		}
		
	
	
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
}
