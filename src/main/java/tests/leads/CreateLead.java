package tests.leads;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.CreateLeadPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import readData.readExcel;

public class CreateLead extends PreAndPost{

	@BeforeTest
	
	public void setValue()
	{
		testCaseName  = "Create Lead";
		testDescription = "Creating a New Lead";
		moduleName = "Lead";
		author = "Sankar";
		category = "Sanity";
		excelFileName ="CreateLead";
				
	}

	//@Test(invocationCount=2,invocationTimeOut=30000)
	//@Test(groups= {"smoke"})
	
	@Test(dataProvider = "QA")
	public void createLead(String cName,String fName, String lName) {
		
		new MyHomePage(driver, test)
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadButton()
		.getfirstName();
		
		
		
	}
	
	

		
}




