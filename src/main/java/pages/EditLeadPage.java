package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class EditLeadPage extends WebDriverServiceImpl {
	
	public EditLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="createLeadForm_companyName")
	WebElement eleCName;
	

	@FindBy(id ="updateLeadForm_companyName")
	WebElement eleUpdCompanyName;
	
	
	@FindBy(xpath = "//input[@name='submitButton']")
	WebElement eleupdateLead;
	
	
	public EditLeadPage typeCompanyName(String cName)
	{
		type(eleCName, cName);
		return this;
	}
	
	public EditLeadPage clearUpdCompName(String updComName)
	{
		clear(eleUpdCompanyName);
		return this;
	}
	
	public EditLeadPage typeUpdCompName(String updComName)
	{
		type(eleUpdCompanyName, updComName);
		return this;
	}
	
	public EditLeadPage clickUpdateLead()
	{
		click(eleupdateLead);
		return this;
	}
	
		

}
