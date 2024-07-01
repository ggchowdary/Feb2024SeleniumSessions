package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownhandling {
	static WebDriver driver;
	public static void main(String[] args) {
		//html tag = select
		//use Select class in selenium
		
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country=By.id("Form_getForm_Country");
		By emp = By.id("Form_getForm_NoOfEmployees");
//		Select s_country = new Select(driver.findElement(country));
//		Select s_emp = new Select(driver.findElement(emp));
////		s_country.selectByIndex(5);
////		s_country.selectByVisibleText("India");
//		s_country.selectByValue("India");
		
		doSelectByVisibleText(country,"India");
		doSelectByVisibleText(emp,"201 - 250");
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doSelectByIndex(By locator , int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);}
		
		public static void doSelectByVisibleText(By locator , String VisibleText) {
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(VisibleText);}
		
	}
	

