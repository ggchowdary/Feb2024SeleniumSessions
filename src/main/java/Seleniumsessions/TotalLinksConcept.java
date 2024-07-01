package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");		
		
//		//html tag for links is <a
//		List<WebElement> linklist = driver.findElements(By.tagName("a"));
//		System.out.println("total link =" + linklist.size());
//		for(int i=0;i<linklist.size();i++)
//		{
//			String text = linklist.get(i).getText();
//			if(text.length()!=0) {
//			System.out.println(text);
//			
//		}
//			
//			System.out.println("---------------------------");
//			
//		}
		By links =By.tagName("a");
		System.out.println("total link = "+ getElementsCount(links));
		
		List<String> linktextlist = getElementTextList(links);
		System.out.println(linktextlist);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	//WAF : 
	//name : getElementTextList
	//return : List<String>
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	
	
}


