package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl {
	
	public ViewLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="viewLead_firstName_sp")
	WebElement eleViewFirstName;
	
	@FindBy(id ="viewLead_companyName_sp")
	WebElement eleViewCompName;
	
	@FindBy(linkText ="Edit")
	WebElement eleEditLead;
	
	@FindBy(linkText ="Duplicate Lead")
	WebElement eleDupLead;
	
	@FindBy(linkText ="Delete Lead")
	WebElement eleDelLead;
	
			
	public ViewLeadPage getfirstName()
	{
		String resultFirstName = getText(eleViewFirstName);
		verifyExactText(eleViewFirstName, resultFirstName);
		return this;
		
	}
	
	public OpenTapsPage clickEditLead()
	{
		click(eleEditLead);
		return new OpenTapsPage(driver,test);
	}
	
	public DuplicateLeadPage clickDeplicateLead()
	{
		click(eleDupLead);
		return new DuplicateLeadPage(driver,test);
		
	}
	
	public MyLeadsPage clickDeleteLead()
	{
		click(eleDelLead);
		return new MyLeadsPage(driver,test);
		//return new MyLeadsPage();
		
	}
	
	
}
