package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRM_WelcomeAdmin extends OHRM_login{
	
	@Test(priority=2,description="OHRM Welcomeadmin Test")
	public void Welcomeadmin()
	{
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
		
		By Welcomeadminproperty=By.linkText("Welcome Admin");
		WebElement WelcomeAdmin=driver.findElement(Welcomeadminproperty);
		
		WelcomeAdmin.click();
		
					
	}
	
	@Test(priority=3,description="OHRM Logout Test")
	public void Logout()
	{
		By Logoutproperty=By.linkText("Logout");
		WebElement Logout=driver.findElement(Logoutproperty);
		
		Logout.click();
		
	}

}
