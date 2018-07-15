package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl {
	
	public MyHomePage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Leads")
	WebElement eleLeadsTitle;
	
	@And ("click Leads Tab")
	public MyLeadsPage clickLeads()
	{
		click(eleLeadsTitle);
		return new MyLeadsPage(driver,test);
	}

}
