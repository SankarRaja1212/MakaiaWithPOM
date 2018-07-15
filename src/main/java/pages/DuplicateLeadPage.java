package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadPage extends WebDriverServiceImpl {
	
	public DuplicateLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="createLeadForm_firstName")
	WebElement eleFName;
	
	
	@FindBy(className = "smallSubmit")
	WebElement eleduplicateLead;
	
	public DuplicateLeadPage typeFirstName(String fName)
	{
		type(eleFName, fName);
		return this;
	}
	
	
	public DuplicateLeadPage clickCreateLead(String deleLead)
	{
		type(eleduplicateLead, deleLead);
		return this;
	}
	
	
}
