package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;


public class MergeLead extends PreAndPost{
	
	
	@BeforeTest
	
	public void setValue()
	{
		testCaseName  = "Merge Lead";
		testDescription = "Merging a lead with another Lead";
		moduleName = "Lead";
		author = "Sankar";
		category = "Sanity";
		excelFileName ="MergeLead";
				
	}
	
	//@Test (groups= "Sanity")
	@Test
	public void mergeLead() {
		
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
				
		WebElement eleFindLead = locateElement("link", "Merge Leads");
		click(eleFindLead);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleFrom = locateElement("xpath","(//img[@alt='Lookup'])[1]");
		click(eleFrom);
		
		switchToWindow(1);
		
		WebElement eleLeadId = locateElement("name", "id");
		type(eleLeadId, "10087");
		
		
		WebElement eleFindLeadButton=locateElement("xpath","(//button[@class='x-btn-text'])[1]");
		click(eleFindLeadButton);
		
		WebElement eleFindLeadRes=locateElement("xpath","(//a[@class='linktext'])[1]");
		click(eleFindLeadRes);
		
		switchToWindow(0);
		
		WebElement eleTo = locateElement("xpath","(//img[@alt='Lookup'])[2]");
		click(eleTo);
		
		switchToWindow(1);
		
		WebElement eleLeadIdTo = locateElement("name", "id");
		type(eleLeadIdTo, "10082");
		
		
		WebElement eleFindLeadButton2=locateElement("xpath","(//button[@class='x-btn-text'])[1]");
		click(eleFindLeadButton2);
		
		WebElement eleFindLeadRes2=locateElement("xpath","(//a[@class='linktext'])[1]");
		click(eleFindLeadRes2);
		
		
				
		switchToWindow(0);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement eleMergeLeadButton=locateElement("xpath","//a[@class='buttonDangerous']");
		click(eleMergeLeadButton);
		
		acceptAlert();
		
		WebElement eleFindLeadAgain = locateElement("link", "Find Leads");
		click(eleFindLeadAgain);
		
		WebElement eleNameIDTab = locateElement("xpath", "(//span[@class='x-tab-strip-text '])[1]");	
		click(eleNameIDTab);
		
		WebElement eleLeadIDAgain = locateElement("name", "id");
		//String leadID = eleLeadIDAgain;
		type(eleLeadIDAgain, "10087");
		
		WebElement eleFindLeadButtonAgain = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");	
		click(eleFindLeadButtonAgain);
		
		WebElement eleResult = locateElement("xpath", "(//div[@class='x-paging-info'])");
	//  WebElement eleResult = locateElement("xpath", "(//div[text()='No records to display'])");
		String result = getText(eleResult);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
}


