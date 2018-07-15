package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class FindLeadPage extends WebDriverServiceImpl {
	
	public FindLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//input[@name='firstName'])[3]")
	WebElement eleFName;
	
	@FindBy(xpath ="//input[@name='id']")
	WebElement eleLeadIDVal;
	
	
	@FindBy(xpath ="//input[@class=' x-form-text x-form-field']")
	WebElement elePhoneNum;
	
	@FindBy(xpath ="//span[text()='Email']")
	WebElement eleEmail;
	
	@FindBy(xpath ="//button[text()='Find Leads']")
	WebElement eleFindButton;
	
	@FindBy(xpath ="(//a[starts-with(@href, '/crmsfa/control/viewLead?partyId')])[8]")
	WebElement eleLeadId;
	
	public FindLeadPage typeLeadId(String leadID)
	{
		type(eleLeadIDVal, leadID);
		return this;
	}
	
	public FindLeadPage typeFirstName(String fName)
	{
		type(eleFName, fName);
		return this;
	}
	

	public FindLeadPage typePhoneNum(String phone)
	{
		type(elePhoneNum, phone);
		return this;
	}
	
	
	public FindLeadPage typeEmailAdd(String eMail)
	{
		type(eleEmail, eMail);
		return this;
	}
		
	
	public FindLeadPage clickFindLeadsButton()
	{
		click(eleFindButton);
		return this;
	}
	
	public ViewLeadPage clickLeadsId()
	{
		click(eleLeadId);
		return new ViewLeadPage(driver,test);
	}

}

