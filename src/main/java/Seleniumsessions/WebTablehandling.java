package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);

		SelectUser("Joe.Root");
		SelectUser("John.Smith");
		System.out.println(getUserdataList("Joe.Root"));
		System.out.println(getUserdataList("John.Smith"));


		}
		
		
		public static List<String> getUserdataList (String Username) {
			List<WebElement> UserdataList = driver.findElements(By.xpath("//a[text()='"+Username+"']/parent::td/following-sibling::td"));
			List <String> datalist = new ArrayList<String>();
			for(WebElement e:UserdataList ) {
				String text = e.getText();
				datalist.add(text);
			}
			return datalist;
		}	
		
	

	public static void SelectUser(String Username) {
		driver.findElement(By.xpath("//a[text()='"+Username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}



}
