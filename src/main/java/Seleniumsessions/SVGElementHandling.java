package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {

		// SVG : Scalable Vector Graphics
		// normal XPath doesn't work for SVG
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-inst')]")));
		String xpath = "//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path'] ";
		List<WebElement> stateList = driver.findElements(By.xpath(xpath));
		System.out.println(stateList.size());
		
		for(WebElement e : stateList)
		{
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
		
	}

}
