package MyTestPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
	
	public static String getRandomEmail() {
		String email = "opencart00"+System.currentTimeMillis()+"@gmail.com";
//		String email = "opencart00"+UUID.randomUUID()+"@gmail.com";
		return email;
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"GGCH","Garapati","8428402390","ewj@1234"},
			{"Gg","gara","8428402391","ewj@1234"},
			{"GgC","gera","8428402392","ewj@1234"}
		};
	}
	
	@Test(dataProvider = "getRegTestData")
	public void RegistrationTest(String fname , String lname , String phone , String pass) {
		
		driver.findElement(By.id("input-firstname")).sendKeys(fname);		
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmail());
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.id("input-confirm")).sendKeys(pass);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("(//div/a/following-sibling::input)[2]")).click();
		String text = driver.findElement(By.xpath("//div/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();

	}

}
