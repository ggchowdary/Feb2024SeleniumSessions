package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test(description="Checking login page title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title,"Google");
	}
	
	
	@Test(description="Checking login page URL")
	public void googleURLTest() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("page URL is :" + currentUrl);
		Assert.assertTrue(currentUrl.contains("google"));
	}




}



