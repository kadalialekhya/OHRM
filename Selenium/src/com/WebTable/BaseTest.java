package com.WebTable;

import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	EdgeDriver driver;
	
	String applicationurladdress="https://www.timeanddate.com/worldclock";
	
	public void applicationlaunch()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Edge Driver File\\msedgedriver.exe");
 
		driver=new EdgeDriver();
		
		System.out.println("**Browser launched successfully**");
		
		driver.get(applicationurladdress);
		
		System.out.println("**successfully navigated to time and date application**");
		
		
	}
	
	public void applicationclose()
	{
		driver.quit();
		System.out.println("**browser closed successfully**");
	}
	
	 public static void main(String[]args) {
	
	BaseTest WebTable=new BaseTest();
	WebTable.applicationlaunch();
	WebTable.applicationclose();

}
}
