package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
WebDriver driver;
public WebDriver launchBrowser(String broswerName) {
	System.out.println("broswer name:"+ broswerName );
	switch(broswerName.trim().toLowerCase()) {
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		break;
		default:
			System.out.println("pass correct browser:"+ broswerName );
			throw new BrowserException("Invalid Browser");
			
	}
	return driver;
}
	public void launchURL(String url) {
		if(url==null) {
			throw new BrowserException("Invalid Url");
		}
		if(url.isBlank() || url.isEmpty()) {
			throw new BrowserException("Url is empty/blank");
		}
		if(url.indexOf("http")!=0) {
			throw new BrowserException("http(s) is missing");
		}
		driver.get(url.trim());
	}
	public String pagegetTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void pagequit() {
		driver.quit();
	}
	public void pageclose() {
		driver.close();
	}
	


}


