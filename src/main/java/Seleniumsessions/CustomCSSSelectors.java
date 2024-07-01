package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By loginFields = By.cssSelector("input#username,input#password,input#remember,button#loginBtn");
		int FieldCount = driver.findElements(loginFields).size();
		System.out.println(FieldCount);
		if(FieldCount == 4) {
			System.out.println("All fields are present");
		}

		//CSS is a locator - Cascaded Style Sheet
		//FORMAT
//		#id or htmltag#id
		//class- htmltag.className
//		//class - htmltag.c1.c2.c3....cn
//		htmltag[attr='value']
		
		
//		input[placeholder*='E-Mail Address'] - this is for contains() in CSS
//		input[placeholder^='E'] - this is for starts-with() in CSS
//		input[placeholder$='ress'] - this is for ends-with() in CSS
		
//		there is no text() in CSS!!!!!!!!!!!
		
//		 
	    //select#Form_getForm_Country>option   -- parent to child 
	    //select#Form_getForm_Country option	--indirect elements
//		div#content form>div.form-group>#input-email
		
		
//		there is way to traverse back from child to parent in CSS....!!!!
//		there is no preceding sibling in CSS
//		there is following sibling in CSS
//		+ will be used for following sibling
//		~ will be used for indirect sibling
		
//		indexing in CSS
//		select#Form_getForm_Country>option:first-child
//		select#Form_getForm_Country>option:last-child
//		select#Form_getForm_Country>option:nth-child(199)
//		select#Form_getForm_Country>option:nth-child(odd)
		
		
		
		
		
//		comma in CSS
		
//		input#username,input#password,input#remember,button#loginBtn
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
