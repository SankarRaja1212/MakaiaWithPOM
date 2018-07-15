package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class EditLead extends PreAndPost{
	
@BeforeTest
	
	public void setValue()
	{
		testCaseName  = "Edit Lead";
		testDescription = "Editing an already created Lead";
		moduleName = "Lead";
		author = "Sankar";
		category = "Sanity";
		excelFileName ="EditLead";
				
	}
		

  //@Test(dependsOnMethods= {"tests.CreateLead.createLead"},description="Edit the created lead")
  //@Test(groups= {"smoke"})
	@Test
	public void editLead() {
		
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
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				 		
		WebElement eleFirstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(eleFirstName, "Sankar");
		
		WebElement eleFindButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindButton);
		

		WebElement eleNameLink = locateElement("link", "Sankar");
		click(eleNameLink);
		
		
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		

		WebElement eleEditLead = locateElement("link", "Edit");
		click(eleEditLead);
		

		WebElement eleCompName = locateElement("id","updateLeadForm_companyName");
		clear(eleCompName);
		
		WebElement eleCompName1 = locateElement("id","updateLeadForm_companyName");
		type(eleCompName1, "InfoSysTESTNG");

		WebElement eleupdateLead = locateElement("xpath", "//input[@name='submitButton']");
		click(eleupdateLead);
		
				
				
	}

	
	
}




