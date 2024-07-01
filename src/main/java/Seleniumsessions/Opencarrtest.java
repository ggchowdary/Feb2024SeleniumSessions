package Seleniumsessions;

import java.util.Properties;
public class Opencarrtest {

	public static void main(String[] args) {
//		String browser = "chrome";
		propread pr = new propread();
		Properties prop = pr.initprop(); 
		BrowserUtil bu = new BrowserUtil();
		bu.launchBrowser(prop.getProperty("browser"));
		bu.launchURL(prop.getProperty("url")); 
		String actitle=bu.pagegetTitle();
		System.out.println("Page title:"+ actitle);
		bu.pagequit();
	}

}
