package lib.selenium;

import org.testng.annotations.Test;

import readData.readExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PreAndPostOld extends WebDriverServiceImpl {
  
	
	public String testCaseName, testCaseDesc, moduleName,author, category,excelFileName;
	
		// @BeforeMethod(groups= "smoke")
	
		@BeforeMethod
		@Parameters({"url", "username", "password"})
		public void beforeMethod(String url, String uName, String pwd) {
	  
	  
	  	System.out.println("beforeMethod");
	  
	  	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		
		driver.manage().window().maximize();
		driver.get(url);
		//driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pwd);
		
  }

  @AfterMethod// (groups= "smoke")
  public void afterMethod() {
	  System.out.println("afterMethod");
	  closeActiveBrowser();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }
  
  	//@DataProvider(name ="QA", indices= {0})
	@DataProvider(name ="QA")
	public Object[][] getData() throws IOException
	{
		
		readExcel data1= new readExcel();
		Object[][] readData = data1.readData(excelFileName);
		return readData;
  
		
	}

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }


	  
}
