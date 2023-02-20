package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifySignup extends baseClass {
	@Test
	public void signup() throws IOException, InterruptedException {

		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.clickOntryForFree().click();

		SignupPageObjects spo = new SignupPageObjects(driver);

		Thread.sleep(5000);

		spo.enterFirstName().sendKeys(constants.firstname);

		
		spo.enterLastName().sendKeys(constants.lastname);
		
		spo.enterJobtitle().sendKeys(constants.jobTitle);

		spo.enterEmail().sendKeys(constants.email);

		spo.enterPhone().sendKeys(constants.phone);
		spo.enterCompanyname().sendKeys(constants.company);

		/*Select s = new Select(spo.selectEmployee());
		s.selectByIndex(1);
		


		Select s1= new Select(spo.selectCountry());
		s.selectByIndex(1);
		*/
	commonMethods.SelectDropdown(spo.selectEmployee(),1);
	
	commonMethods.SelectDropdown(spo.selectCountry(),2);

	
	 // spo.clickOnCheckbox().click();

	}

}
