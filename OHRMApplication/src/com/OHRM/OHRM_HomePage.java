package com.OHRM;

import org.openqa.selenium.edge.EdgeDriver;

public class OHRM_HomePage {

	public static void main(String[] args) {
		EdgeDriver driver;
		String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\OHRMApplication\\src\\msedgedriver\\msedgedriver.exe");
		
		//Navigating to OrangeHRM Application Url Address
		
		driver=new EdgeDriver();
	       driver.get(applicationurladdress);


	}

}
