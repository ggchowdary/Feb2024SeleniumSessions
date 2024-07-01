package Seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingsShadowDOM {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();		
		driver.get("chrome://settings/");
		String JsScript = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search = (WebElement)js.executeScript(JsScript);
		search.sendKeys("notification");
		
	}

}
