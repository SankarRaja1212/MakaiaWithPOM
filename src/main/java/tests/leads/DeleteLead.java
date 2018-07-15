package tests.leads;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.CreateLeadPage;
import pages.FindLeadPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import readData.readExcel;

public class DeleteLead extends PreAndPost{

	@BeforeTest
	
	public void setValue()
	{
		testCaseName  = "Edit Lead";
		testDescription = "Creating a New Lead";
		moduleName = "Lead";
		author = "Sankar";
		category = "Sanity";
		excelFileName ="EditLeadPage";
				
	}

	//@Test(invocationCount=2,invocationTimeOut=30000)
	//@Test(groups= {"smoke"})
	
	@Test(dataProvider = "QA")
	public void deleteLead(String fName) {
		
			
		new MyLeadsPage(driver,test).clickFindLead()
		.typeFirstName(fName)
		.clickFindLeadsButton()
		.clickLeadsId()
		.clickEditLead()
	//	.typeUpdateCompName(fName)
		
		
		
		;
		
		
		
	}
	
	
		
	

		
}




