package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;

public class verifyLogin extends baseClass {

	@Test
	public void login() throws IOException {
		
		driverInitilize();
		// This driver dont have scope
		driver.get("https://login.salesforce.com/"); 
		
		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.enterUsername().sendKeys("Suraj");

		obj.enterPassword().sendKeys("Suraj@123");

		obj.clickOnLogin().click();

	} 
}
