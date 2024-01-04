package com.LinksTesting;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_Homepage_Links_Count {

	public static void main(String[] args) {
		
		EdgeDriver driver;
		
		String applicationurladdress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\OHRMApplication\\src\\msedgedriver\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		driver.get(applicationurladdress);
		
		By linkscommonproperty=By.tagName("a");
		
		List<WebElement>arraylist=driver.findElements(linkscommonproperty);
		
		int tsrtc_homepagelinkscount=arraylist.size();
		
		System.out.println("The number of links on the TSRTC Application HomePage are:-"+tsrtc_homepagelinkscount);
       
		for(int index=0;index<arraylist.size();index++)
		{
			System.out.println(arraylist.get(index).getText());
		}
			
		
		

	
	}

}
