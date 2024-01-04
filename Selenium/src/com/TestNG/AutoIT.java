package com.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoIT extends OHRM_Pim {
	
	@Test(priority=6,description="Add Employee Test")
	public void AddEmployeedata() throws InterruptedException, IOException
	{
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		By FirstNameproperty=By.id("firstName");
	WebElement	FirstName=driver.findElement(FirstNameproperty);
	
	FirstName.sendKeys("kadali");
	
	//shifting the focus from the firstname to middle name
	Actions KeyBoardAction=new Actions(driver);
	KeyBoardAction.sendKeys(Keys.TAB).build().perform();

KeyBoardAction.sendKeys("alekhya").build().perform();

//shifting to Last name
KeyBoardAction.sendKeys(Keys.TAB).build().perform();

KeyBoardAction.sendKeys("k").build().perform();

//shifting to Employee ID

KeyBoardAction.sendKeys(Keys.TAB).build().perform();


//shifting to photograph

KeyBoardAction.sendKeys(Keys.TAB).build().perform();

//perform ENTER key of keyboard operation

KeyBoardAction.sendKeys(Keys.ENTER).build().perform();

Thread.sleep(10000);


java.lang.Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\AutoIt\\AutoIt.exe");
Thread.sleep(10000);

By saveButtonproperty=By.id("btnSave");
WebElement saveaButton=driver.findElement(saveButtonproperty);

saveaButton.click();

//validating image

//inspect property of uploaded picture

//<img alt="Employee Photo" src="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPhoto/empNumber/0003" border="0" id="empPic" width="152" height="200">
By photographproperty=By.id("empPic");
WebElement employeephotograph=driver.findElement(photographproperty);
	
boolean flag=employeephotograph.isDisplayed();
if(flag)
{
	System.out.println("employee phograph uploaded successfully-PASS");
}
else
{
	System.out.println("employee phograph not uploaded successfully-FAIL");
}
	
	

	}


}
