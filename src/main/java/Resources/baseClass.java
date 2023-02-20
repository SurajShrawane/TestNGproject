package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	public WebDriver driver;
	public Properties prop;

	public void driverInitilize() throws IOException {

		// This will read the properties file--
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// Access the properties file--
		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			// Edge code
		} else {
			System.out.println("Please make sure you have correct browser");
		}

	}

	@BeforeMethod
	public void openurl() throws IOException {
		driverInitilize();
		// This driver have scope
		
		String urlName = prop.getProperty("url");
		driver.get(urlName);
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.quit();
	}

}

//browser=chrome
//url=https://www.salesforce.com/


/*Project---
1. create maven project-
2. added depedency in pom.xml


*What is maven?--

3.Crated base class inside resoruce package--  which contains driver initilization code
4.created data.properties file inside resource package-- which contain key and value of browser

5. created first testcases inside testcases pacakge-

6. created page object model package inside resource package--


*Page object model-- design pattern


*Modifications--

1. added beforeMethod and afterMethod-
    beforeMEthod-- browser and url code
 afterMethod -- close the browser.
 
2. added url in data.properties-
3. we kept data in seperate file --constants.java--
4. added syste.getpropertry for common path --
5. added assertions---
6.added common methods-0
*/

// Git Scenario--
/*Scenario no 1-

*When you are uploading project on git for first time--
1. git config --global user.email surajshrawane2015@gamil.com
2. git config --global user.name  bhagyawanp
3. git init
4. git add *
5. git commit -m"my first project"
6. git branch -M main
7. git remote add origin "url"
8. git push -u origin main

Scenario no 2-
When you are uploading project second time--

1. git init
2. git add *     -- working --staging
3. git commit -m"my first project"    -- staging --local 
4. git branch -M main
5. git remote add origin "url"
6. git push -u origin main


Scenario no 3-
Code is already uploaded on github and now you want that code in your machine-

1. they will provide you the url
2. go to code->click on download zip
 
 Other way--
 create a folder on your machine-
 open the folder through cmd

 git clone "url"
  Scenario no -4
 
 
                   Main
 
 
                   Lead
 

 
 (LoginModukeRahul)
    Rahul(Login)       Ramesh(Signup)
    (T)                (T)
 
 
 
 
 
 When you are adding some new changes--

1. git status-
1. git add *   
3. git commit -m"my first project"    -- staging --local 
4. git push -u origin main



git branch--   to check gthe current branch--
git branch -a -- to check the all branches-
git fetch-- to fetch the lastest added branch-
git branch -M main--- to create new branch from command promt

git checkoutt branchname --- to switch from one branch to another
*/