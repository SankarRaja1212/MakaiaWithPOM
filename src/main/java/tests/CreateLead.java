package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
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
	public void createLead(String cName,String fName, String lName,String email, String phone) {
		
		
		
		/*WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		*/
		WebElement eleTitleLead = locateElement("link", "Leads");
		click(eleTitleLead);
				
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		WebElement eleCompName = locateElement("id","createLeadForm_companyName");
		type(eleCompName, cName);
		
		WebElement elefirstName = locateElement("id", "createLeadForm_firstName");
		type(elefirstName, fName);
		
		/*WebElement eleSource = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource, "Conference");
		*/
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, lName);

		/*WebElement eleMeetingCamp = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingVisibleText(eleMeetingCamp, "Automobile");
		

		WebElement eleLastNameLocal = locateElement("id", "createLeadForm_lastNameLocal");
		type(eleLastNameLocal, "Raj");
		

		WebElement eleSalutation = locateElement("id", "createLeadForm_personalTitle");
		type(eleSalutation, "Mr.");
		

		WebElement eleTitle = locateElement("id", "createLeadForm_generalProfTitle");
		type(eleTitle, "SHAN");
		

		WebElement eleAnnualRev = locateElement("id", "createLeadForm_annualRevenue");
		type(eleAnnualRev, "100000");
		

		WebElement eleDeptName = locateElement("id", "createLeadForm_departmentName");
		type(eleDeptName, "IT");
		

		WebElement eleCurrency = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingVisibleText(eleCurrency, "NZD - New Zealand Dollar");
		

		WebElement eleNumOfEmp = locateElement("id", "createLeadForm_numberEmployees");
		type(eleNumOfEmp, "30");
		

		WebElement eleIndustry = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "Retail");
		

		WebElement eleOwnership = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingVisibleText(eleOwnership, "Partnership");
		

		WebElement eleSicCode = locateElement("id", "createLeadForm_sicCode");
		type(eleSicCode, "SI124");
		

		WebElement eleTicketSymbol = locateElement("id", "createLeadForm_tickerSymbol");
		type(eleTicketSymbol, "RED");
		

		WebElement eleDesc = locateElement("id", "createLeadForm_description");
		type(eleDesc, "My Own Creation of Lead Creation");
		
		WebElement eleCountryCode = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
		type(eleCountryCode, "1");
		
		WebElement elePhAreaCode = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
		type(elePhAreaCode, "044");
*/		
		WebElement eleMobNum = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(eleMobNum, ""+phone);
/*		
		WebElement elePhExtn = locateElement("id", "createLeadForm_primaryPhoneExtension");
		type(elePhExtn, "044");
		
		WebElement eleAskName = locateElement("id", "createLeadForm_primaryPhoneAskForName");
		type(eleAskName, "Owner");
*/		
		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail, email);
		
/*		WebElement eleUrl = locateElement("id", "createLeadForm_primaryWebUrl");
		type(eleUrl, "sankarraja.asok.com");
		
		WebElement eleToName = locateElement("id", "createLeadForm_generalToName");
		type(eleToName, "Sanaaa");
		
		WebElement eleAddress = locateElement("id", "createLeadForm_generalAddress1");
		type(eleAddress, "Ramapuram");
		
		WebElement eleCity = locateElement("id", "createLeadForm_generalCity");
		type(eleCity, "Chennai");


		WebElement elePO = locateElement("id", "createLeadForm_generalPostalCode");
		type(elePO, "Chennai");
		

		WebElement elePOExtn = locateElement("id", "createLeadForm_generalPostalCodeExt");
		type(elePOExtn, "044");
		

		WebElement eleAttnName = locateElement("id", "createLeadForm_generalAttnName");
		type(eleAttnName, "Test");
		

		WebElement eleAddrs2 = locateElement("id", "createLeadForm_generalAddress2");
		type(eleAddrs2, "MGR house");
		
		WebElement eleCountry = locateElement("id", "createLeadForm_generalCountryGeoId");
		selectDropDownUsingVisibleText(eleCountry, "India");
		
		WebElement eleState = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingVisibleText(eleState, "TAMILNADU");
		
*/			
		WebElement eleSubmitLead = locateElement("name", "submitButton");
		click(eleSubmitLead);
		
		
	}
	
	
		
	

		
}




