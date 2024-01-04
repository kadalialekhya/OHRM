package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddEmployee extends OHRM_Pim {
	
	@Test(priority=6,description="Add Employee Test")
	public void AddEmployeedata()
	{
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		By FirstNameproperty=By.id("firstName");
	WebElement	FirstName=driver.findElement(FirstNameproperty);
	
	FirstName.sendKeys("kadali");
	
	
	//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	By middlenameproperty=By.id("middleName");
	WebElement middlename=driver.findElement(middlenameproperty);
	
	middlename.sendKeys("alekhya");
	
	//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	By lastnameproperty=By.id("lastName");
	WebElement lastname=driver.findElement(lastnameproperty);
	lastname.sendKeys("k");
	

	}
	


}