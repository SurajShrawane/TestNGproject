package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.baseClass;

public class verifySignup extends baseClass {
	@Test
	public void signup() throws IOException, InterruptedException {
	
		driverInitilize();
		// This driver dont have scope
		driver.get("https://login.salesforce.com/"); 
		
		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.clickOntryForFree().click();

		SignupPageObjects obj1 = new SignupPageObjects(driver);
		
		 Thread.sleep(5000);

		obj1.enterFirstName().sendKeys("Suraj");

	/*	obj1.enterLastName().sendKeys("Shrawane");

		obj1.enterJobtitle().sendKeys("QA");

		obj1.enterEmail().sendKeys("tester@gmail.com");

		obj1.enterPhone().sendKeys("9876543210");

		
		obj1.clickOnCheckbox().click();
		*/
		Select s=new Select(obj1.selectEmployee());
		  s.selectByIndex(1);
	}

}
