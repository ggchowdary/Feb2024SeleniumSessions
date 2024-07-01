package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrList {

static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		
//	
//		By images = By.tagName("img");
//	
//		getElementAttributeList(images,"src");
//			
//		getElementAttributeList(images,"alt");

		By links = By.tagName("a");
		getElementAttributeList(links, "href");
		
	}
		
		
		
		public static List<String> getElementAttributeList(By locator,String attrName) {
			List<String> attrList = new ArrayList<String>();
			List<WebElement> imglist = getElements(locator);
			for (WebElement e : imglist) {
				String attrVal = e.getAttribute(attrName);
				if(attrVal!=null&&attrVal.length()!=0) {
					attrList.add(attrVal);
					System.out.println(attrVal);
				}
		}
	return attrList;
		}
		

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
}
