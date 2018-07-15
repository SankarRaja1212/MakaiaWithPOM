package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class OpenTapsPage extends WebDriverServiceImpl {
	
	public OpenTapsPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="updateLeadForm_companyName")
	WebElement eleUpdCompanyName;
	
	
	@FindBy(className = "smallSubmit")
	WebElement eleupdateLead;
	
	
	
	public OpenTapsPage typeUpdateCompName(String updCompName)
	{
		type(eleUpdCompanyName, updCompName);
		return this;
	}
	
	public ViewLeadPage clickupdateLead(String updLead)
	{
		click(eleupdateLead);
		return new ViewLeadPage(driver,test);
	}
	
	
	
}
