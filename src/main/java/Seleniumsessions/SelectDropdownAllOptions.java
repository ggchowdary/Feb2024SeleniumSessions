package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country=By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

//		Select select_country = new Select(driver.findElement(country));
//		List<WebElement> countryOptions = select_country.getOptions();
//		System.out.println(countryOptions.size());
//		for(WebElement e:countryOptions) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		List <String> clist = dogetOptionsTextList(country);
		System.out.println(clist);
		List <String> elist = dogetOptionsTextList(employee);
		System.out.println(elist);

	
	
	}
	
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void getDropdownOptionCount(By locator) {
		Select select = new Select(driver.findElement(locator));
		select.getOptions().size();
		}
	
	public static List<String> dogetOptionsTextList(By locator) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionList = select.getOptions();
		List<String> optionsText = new ArrayList<String>();
		for(WebElement e:optionList) {
			String text = e.getText();
			optionsText.add(text);
	}
		return optionsText;
	}}
