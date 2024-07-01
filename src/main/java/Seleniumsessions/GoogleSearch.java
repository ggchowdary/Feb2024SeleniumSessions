package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//	
//		By searchfield = By.name("q");
//		By suggestion = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
//		
//		doSearch(searchfield , "testing jobs" , suggestion , "pune" );
		
		driver.get("https://www.flipkart.com/");
		By searchfield = By.name("q");
		By suggestion = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		doSearch(searchfield , "macbook" , suggestion , "pro m3" );

	}
	
	public static void doSearch(By searchfield , String searchKey , By suggestions , String value) throws InterruptedException {
		driver.findElement(searchfield).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> slist = driver.findElements(suggestions);
		System.out.println(slist.size());
	
		for(WebElement e:slist) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
		
	}

}
