package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test(description="Checking login page title")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title,"Account Login");
	}
	
	
	@Test(description="Checking login page URL")
	public void URLTest() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("page URL is :" + currentUrl);
		Assert.assertEquals(true,currentUrl.contains("opencart"));
	
	}

}

