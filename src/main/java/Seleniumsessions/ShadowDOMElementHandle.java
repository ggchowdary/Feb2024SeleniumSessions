package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		String js = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js1.executeScript(js);
		pizza.sendKeys("Veg Pizza");
		
		
		driver.findElement(By.id("pizza")).sendKeys("Veg");
		
		
		
		
		
	}

}
