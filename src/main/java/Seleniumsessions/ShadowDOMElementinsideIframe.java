package Seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementinsideIframe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();		
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		//Browser --> page --> iframe --> ShadowDOM element --> actual element
		driver.switchTo().frame("pact");
		String JsScript = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tea = (WebElement)js.executeScript(JsScript);
		tea.sendKeys("Masala Tea");
		

		
		
		
	}

}
