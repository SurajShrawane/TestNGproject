package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	// This driver dont have scope
	public WebDriver driver;

	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='pw']");
	private By login = By.xpath("//input[@name='Login']");
	private By tryForFree = By.xpath("//a[@class='button secondary']");

	private By errorMessage = By.xpath("//div[@id='error']");

	
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}

	public WebElement clickOntryForFree() {
		return driver.findElement(tryForFree);
	}

	public WebElement errorText() {
		return driver.findElement(errorMessage);

	}

}
