package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	// This driver dont have scope
	public WebDriver driver;

	private By firstName = By.xpath("//input[@name='UserFirstName']");

	/*private By lastName = By.xpath("//input[@name='UserLastName']");

	private By jobTitle = By.xpath("//input[@name='UserTitle']");

	private By email = By.xpath("//input[@name='UserEmail']");

	private By phone = By.xpath("//input[@name='UserPhone']");

	private By checkbox = By.xpath("//div[@class='checkbox']");
*/
	 private By employee=By.xpath("//select[@name='CompanyEmployees']");
	
	public SignupPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}

	/*public WebElement enterLastName() {
		return driver.findElement(lastName);
	}

	public WebElement enterJobtitle() {
		return driver.findElement(jobTitle);
	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}

	public WebElement enterPhone() {
		return driver.findElement(phone);
	}

	public WebElement clickOnCheckbox() {
		return driver.findElement(checkbox);
	}*/
	  public WebElement selectEmployee() {
		  
		  return driver.findElement(employee);
		 }
		 
}