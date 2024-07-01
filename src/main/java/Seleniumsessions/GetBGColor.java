package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBGColor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		String Color = LoginBtn.getCssValue("backgroundColor");
		System.out.println(Color);
	}

}
