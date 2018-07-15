package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class CreateLeadSteps {
	
	//ChromeDriver driver = new ChromeDriver();
public static ChromeDriver driver;
	
	/*@Given ("launch browser")
	public void launchBrowser ()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@And ("max the browser")
	public void maxBrowser ()
	{
		driver.manage().window().maximize();
	}
	@And ("launch the URL")
	public void launchURL ()
	{
		driver.get("http://leaftaps.com/opentaps");
	}


	@And ("set timeout")
	public void setTimeout1 ()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	
	@And ("enter username as (.*)")
	public void typeuserName (String uName)
	{
	driver.findElementById("username").sendKeys(uName);	
	}
	@And ("enter password as (.*)")
	public void typepassWord (String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);	
	}
	
	@When ("click Login Button")
	public void clickLoginButton ()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("logged in successfully")
	
	public void verifyLogin()
	{
		System.out.println("Logged in Successfully");
	}
	


	@Given ("click CRMSFA link")
	public void clickCRMSFA ()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And ("set Timeout")
	public void setTimeout ()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
*/	


/*	@And ("click Leads Tab")
	public void clickLeadsTab ()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And ("click Create Lead Link")
	public void clickCreateLeadLink ()
	{
		driver.findElementByLinkText("Create Lead").click();	
	}
	@And ("enter Company Name as (.*)")
	public void typeComName (String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@And ("enter first name as (.*)")
	public void typeFirstName (String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);	
	}
	@And ("enter last name as (.*)")
	public void typeLastName (String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@When ("click Cread Lead Button")
	public void clickCreateLeadSubmit ()
	{
		driver.findElementByName("submitButton").click();
	}
	
	@Then("lead should be created successfully")
	
	public void verifyLead()
	{
		System.out.println("Lead Created Successfully");
	}
*/	

}

