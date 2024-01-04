package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OHRM_Pim extends OHRM_login {
	
	@Test(priority=4,description="OHRM Pim Test")
	public void Pim()
	{
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By PIMproperty=By.linkText("PIM");
		WebElement PIM=driver.findElement(PIMproperty);
		
		//Actions is used to perform operations related to either mouse or keyboard
		
		Actions PIMmouseover=new Actions(driver);
		
		PIMmouseover.moveToElement(PIM).build().perform();
	}
	
	@Test(priority=5,description="Add Employee test")
	public void AddEmployee()
	{
		By Addemployeeproperty=By.linkText("Add Employee");
		WebElement AddEmployee=driver.findElement(Addemployeeproperty);
		AddEmployee.click();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

}
