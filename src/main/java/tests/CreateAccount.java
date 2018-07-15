package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateAccount extends PreAndPost{

	@Test(dependsOnMethods={"tests.CreateLead.createLead"},alwaysRun=true)
	public void deleteLead() {
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleTitleLead = locateElement("link", "Accounts");
		click(eleTitleLead);
				
		WebElement eleCreateLead = locateElement("link", "Create Account");
		click(eleCreateLead);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String accNAME="SHANTESTNG";
		
		WebElement eleAccName = locateElement("id","accountName");
		type(eleAccName, accNAME);
				

		WebElement eleIndustry = locateElement("name", "industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "Retail");

		WebElement eleCurrency = locateElement("id", "currencyUomId");
		selectDropDownUsingVisibleText(eleCurrency, "NZD - New Zealand Dollar");
		
		WebElement eleSource = locateElement("id", "dataSourceId");
		selectDropDownUsingVisibleText(eleSource, "Conference");

		WebElement eleMeetingCamp = locateElement("id", "marketingCampaignId");
		selectDropDownUsingVisibleText(eleMeetingCamp, "Automobile");
			
		WebElement eleMobNum = locateElement("id", "primaryPhoneNumber");
		type(eleMobNum, "9600067826");


		WebElement eleCity = locateElement("id", "generalCity");
		type(eleCity, "Chennai");
		
		
		WebElement eleEmail = locateElement("id", "primaryEmail");
		type(eleEmail, "sankarraja.1212@gmail.com");
		
		
		WebElement eleCountry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingVisibleText(eleCountry, "India");
		
		WebElement eleState = locateElement("id", "generalStateProvinceGeoId");
		selectDropDownUsingVisibleText(eleState, "TAMILNADU");
		
			
		WebElement eleSubmitAccount = locateElement("xpath", "//input[@class='smallSubmit']");
		click(eleSubmitAccount);
		
		WebElement eleGetAccId = locateElement("xpath", "(//span[@class='tabletext'])[3]");
		String acc = getText(eleGetAccId);
		
		System.out.println(acc);
		
	//	String acc = "TETSTleahfk (10987)";
		
		String accNum = acc.replaceAll("[a-z,A-Z,(,)]", "");
		String accID = accNum.trim();
		System.out.println("Account ID:"+accID);
		

		WebElement eleFindAcc = locateElement("link", "Find Accounts");
		click(eleFindAcc);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		WebElement eleAccID1 = locateElement("xpath", "//input[@name='id']");
		type(eleAccID1,accID);
		

		WebElement eleAccName1 = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(eleAccName1,accNAME);
		

		WebElement eleFindID = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindID);
		
		
		WebElement eleResAccID = locateElement("xpath", "(//a[@class='linktext'])[4]");
		String ResID = getText(eleResAccID);
		
		verifyText(ResID, accID);
		
		
				
				
	}
	
	
}




