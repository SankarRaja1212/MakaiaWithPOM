package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readData.readExcel;

public class PreAndPost extends WebDriverServiceImpl{

	public String testCaseName, testDescription, moduleName,author, category,excelFileName;

	@BeforeMethod
	
		
	@Parameters({"url", "username", "password"})
	public void beforeMethod(String url, String uName, String pwd) {

		
		startTestModule(moduleName);
		test.assignAuthor(author);
		test.assignCategory(category);
				
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), uName);	
		type(locateElement("id", "password"), pwd);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
		
		
	}

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@BeforeClass
	public void beforeClass() {

		startTestCase(testCaseName,testDescription);
		//startTestModule(moduleName);
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {

	}

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
		startReport();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

}
