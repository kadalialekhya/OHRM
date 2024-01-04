package com.DropDown;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	EdgeDriver driver;
	@BeforeTest
	public void applicationlaunch()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Edge Driver File\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		String applicationurladdress="https://www.osmania.ac.in/";
		driver.get(applicationurladdress);
		System.out.println("succesfully navigated to application");
		)
	}
	@AfterTest
	
	public void applicationclose()
	{
		driver.close();
	}
	

}
