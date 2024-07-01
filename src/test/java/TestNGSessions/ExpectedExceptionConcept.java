package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	@Test(priority =1 , description = "test" , expectedExceptions = ArithmeticException.class)
	public void addToCartTest() {
		System.out.println("add to cart test");
		int i = 9/0;
		
		
	}
}
