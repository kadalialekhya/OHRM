package com.Amazon;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.edge.EdgeDriver;

import com.utility.log;

public class Amazon_Yourwishlist_Click {
	EdgeDriver driver;
	String applicationurladdress="http://amazon.in";
	
	public void applicationLaunch()
	{
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Edge Driver File\\msedgedriver.exe");
		driver=new EdgeDriver();
		System.out.println("****successfully launched edgeBroser***");
		driver.get(applicationurladdress);
		System.out.println("Navigated to Amazon Application HomePage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void main (String[]args)
	{
		Amazon_Yourwishlist_Click amazon=new Amazon_Yourwishlist_Click();
		amazon.applicationLaunch();
		//log.info("testing");
	}

}
