package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl {
	
	public CreateLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="createLeadForm_companyName")
	WebElement eleCName;
	
	@FindBy(id ="createLeadForm_firstName")
	WebElement eleFName;
	
	@FindBy(id ="createLeadForm_lastName")
	WebElement eleLName;
	
	@FindBy(name ="submitButton")
	WebElement eleCreateLeadButton;
	
	@And ("enter Company Name as (.*)")
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCName, cName);
		return this;
	}
	
	@And ("enter first name as (.*)")
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFName, fName);
		return this;
	}
	
	@And ("enter last name as (.*)")
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLName, lName);
		return this;
	}
	
	@When ("click Cread Lead Button")
	public ViewLeadPage clickCreateLeadButton()
	{
		click(eleCreateLeadButton);
		return new ViewLeadPage(driver,test);
	}

}
