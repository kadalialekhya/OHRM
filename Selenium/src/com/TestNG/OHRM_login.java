package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_login {
	WebDriver driver;
	@BeforeTest
	public void OHRMapplicationlaunch()
	{
	
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Edge Driver File\\msedgedriver.exe");
	
	//Navigating to OrangeHRM Application Url Address
	
	driver=new EdgeDriver();
       driver.get(applicationurladdress);
       
       System.out.println("***successfully navigated to OHRMApplication");
	}
       //validating OHRM Login page
       //Identifying username element on the webpage
       //Identifying the properties of username element by inspecting

//<input name="txtUsername" id="txtUsername" type="text">
       @Test(priority=1,description="OHRM Login Test")
       public void login()
       {
       
       By userNameproperty=By.id("txtUsername");
       WebElement userName=driver.findElement(userNameproperty);
      String userNameTestData="Admin";
      userName.sendKeys(userNameTestData);
      
      //Identifying the properties of password element
      //<div id="divPassword" class="textInputContainer">
// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password"> <span class="form-hint" style="display: none;">Password</span> </div>
      By Passwordproperty=By.id("txtPassword");
      WebElement Password=driver.findElement(Passwordproperty);
      String PasswordTestData="Alekhya@14";
      Password.sendKeys(PasswordTestData);
      
      //Identifying the Login property
      //<div id="divLoginButton">
   //   <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN"  </div>
      
     By LoginButtonproperty=By.id("btnLogin");
  WebElement   LoginButton=driver.findElement(LoginButtonproperty);
  
  LoginButton.click();
       
 /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       }
       
      @AfterTest
      public void applicationclose()
       {
  driver.quit();*/
}

}



