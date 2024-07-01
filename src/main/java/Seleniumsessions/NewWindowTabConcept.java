package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwid = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
	}

}
