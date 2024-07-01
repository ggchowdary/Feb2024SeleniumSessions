package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test(priority =2)
	public void searchTest1() {
		System.out.println("search test");
	}
	
	@Test(priority =3)
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	@Test(priority =1)
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	
	
	
}
