package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//		1. type must be file
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Garapati.Chowdary\\OneDrive - GVC Group\\Documents\\336.txt");	
		
	}

}
