package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownGetOptionswithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
//		By country=By.id("Form_getForm_Country");
//		By employee = By.id("Form_getForm_NoOfEmployees");
////		1. select value from dropdown without using Select Class methods
//		2. select value from dropdown without using Select Class
	
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");

		SelectValuefromDropdownwithoutSelect(countryOptions,"India");
		
//	SelectValuefromDropdown(country,"India");
		
//		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
//		 List<WebElement> Countrylist = driver.findElements(countryOptions);
//		 System.out.println(Countrylist.size());	
//		 for(WebElement e:Countrylist) {
//			 String text=e.getText();
//			 if(text.equals("India")) {
//				 e.click();
//			 }
//		 }
		 
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void SelectValuefromDropdown(By locator , String OptionText) {
		Select select = new Select(getElement(locator));
		List <WebElement> optionList = select.getOptions();
		for(WebElement e: optionList) {
			String text = e.getText();
			if(text.equals(OptionText.trim()));
			e.click();
			break;
		}		
		}
	public static void SelectValuefromDropdownwithoutSelect(By locator , String optionText) {
		List<WebElement> optionsList = driver.findElements(locator);
		 for(WebElement e:optionsList) {
			 String text=e.getText();
			 if(text.equals("optionText")) {
				 e.click();
				 break;
			 }
		 }
		}		
	
	
	
	
	
}
