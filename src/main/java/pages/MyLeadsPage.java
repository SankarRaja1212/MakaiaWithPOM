package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadsPage extends WebDriverServiceImpl {
	
	public MyLeadsPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Create Lead")
	WebElement eleCreateLead;
	
	@FindBy(linkText ="Find Leads")
	WebElement eleFindLead;
	
	
	@And ("click Create Lead Link")
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLeadPage(driver,test);
	}
	
	public FindLeadPage clickFindLead()
	{
		click(eleFindLead);
		return new FindLeadPage(driver,test);
	}

}
