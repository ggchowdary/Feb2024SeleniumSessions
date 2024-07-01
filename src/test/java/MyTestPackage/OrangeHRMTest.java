package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	
	@Test(description="Checking login page title")
	public void TitleTest() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title,"OrangeHRM");
	}
	
	
	@Test(description="Checking login page URL")
	public void URLTest() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("page URL is :" + currentUrl);
		Assert.assertTrue(currentUrl.contains("hrmlive"));
	}

}
