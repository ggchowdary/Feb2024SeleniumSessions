package TestNGSessions;

import org.testng.annotations.Test;

public class DependsonConcept {

	@Test(dependsOnMethods="searchTest")
	public void LoginTest() {
		System.out.println("Login to page");
	}

	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}

	///AAA - Arrange , Act , Assert
	
	
	
	
	
}

