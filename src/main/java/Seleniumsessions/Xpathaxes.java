package Seleniumsessions;

public class Xpathaxes {

	public static void main(String[] args) {
	
		// parent to child :
		// if direct child - use /
		// if indirect child - use // (also includes direct child)
//		for going back from child to parent use - (/..) or (::) 
		
//		preceding-sibling - for before sibling
//		following-sibling - for next siblings
//		preceding - for all before things
//		following - for all next things
//		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		
		
		//a[text()='Nimi VJ VJ']/parent::td/following-sibling::td/a[@context='company']
		
		
//		(//a[text()='Rakesh King']/parent::td/following-sibling::td)[last()-1]/a - get email id
		
		//a[text()='Rakesh King']/parent::td/following-sibling::td/a[contains(@href,'mailto:')]
		
		
//		(//select[@id='Form_getForm_Country']/option)[position() mod 2=0] - for even elements
//		(//select[@id='Form_getForm_Country']/option)[position() mod 2=1] - for odd elements
		
		
		
//									Xpath       vs        CSS
//		1. Syntax - 				medium				easy
//		2. Performance - 			slow				fast
//		3. backward - 				yes					no
//		4. sibling - 				yes					only follwoing sibling
//		5. text() - 				yes					no
//		6. ancestor - 				yes					no
//		7. indexing - 				yes					yes(better)
//		8. starts with() - 			yes					yes
//		9. contains() - 			yes					no
//		10 . endswith() - 			no					yes
//		11. comma/union - 			yes 				yes
//		12. not - 					yes					yes
//		13 . SVG element - 			yes					no
//		14. shadowDOM - 			no 					yes
		
		
		
		
//		//footer//a|//footer//h5 ---- union operator in Xpath
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}
}
