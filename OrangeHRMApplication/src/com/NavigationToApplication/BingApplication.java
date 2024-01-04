package com.NavigationToApplication;

import org.openqa.selenium.edge.EdgeDriver;

public class BingApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Browserdriverfiles\\msedgedriver.exe ");
		EdgeDriver edgebrowser=new EdgeDriver();)
         edgebrowser.get("https://bing.com");

	}

}
