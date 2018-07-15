package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost{
	
	@BeforeTest
	
	public void setValue()
	{
		testCaseName  = "Delete Lead";
		testDescription = "Deleting an Existing Lead";
		moduleName = "Lead";
		author = "Sankar";
		category = "Sanity";
		excelFileName ="DeleteLead";
				
	}
	
	//@Test(enabled=false)
	@Test
	public void deleteLead() {
		
		/*WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);*/
		
		WebElement eleTitleLead = locateElement("link", "Leads");
		click(eleTitleLead);
				
		WebElement eleCreateLead = locateElement("link", "Find Leads");
		click(eleCreateLead);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		WebElement elePhoneButton = locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]");
		click(elePhoneButton);
		

		WebElement elePhNum = locateElement("xpath", "//input[@class=' x-form-text x-form-field']");
		type(elePhNum, "9600067866");
		
		WebElement eleFindLead = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindLead);
		
		WebElement eleStoreLead = locateElement("xpath", "(//a[starts-with(@href, '/crmsfa/control/viewLead?partyId')])[8]");
		System.out.println(eleStoreLead);
		
		
		//WebElement eleNameOfLead = locateElement("link", "SHAN");
		click(eleStoreLead);
		
		WebElement eleDeleteLead = locateElement("link", "Delete");
		click(eleDeleteLead);
		
		System.out.println("Lead Raj has been deleted Successfully");
		
		WebElement eleFindLeadAgain = locateElement("link", "Find Leads");
		click(eleFindLeadAgain);
		
		WebElement eleLead = locateElement("xpath", "//input[@class=' x-form-text x-form-field ']");
	//	type(eleLead,eleStoreLead)
				
		WebElement eleVerifyLead = locateElement("xpath", "(//a[starts-with(@href, '/crmsfa/control/viewLead?partyId')])[8]");
		System.out.println(eleVerifyLead);		
		
		
				
				
				
	}

	
	
}




