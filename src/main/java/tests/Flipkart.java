package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;


public class Flipkart extends WebDriverServiceImpl{

	@Test
	public void createLead() {
		
		pressEscapeKey();
		
		WebElement eleTVTitle = locateElement("link", "TVs & Appliances");
		
		mouseHoverOver(eleTVTitle);
		
		WebElement selSamsung = locateElement("link", "Samsung");
		click(selSamsung);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleMinAmount = locateElement("xpath", "//select[@class='fPjUPw'][1]");
		selectDropDownUsingVisibleText(eleMinAmount, "₹25000");
		
		WebElement eleMaxAmount = locateElement("xpath", "(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingVisibleText(eleMaxAmount, "₹60000");
		
		WebElement eleScrSize = locateElement("xpath", "(//div[@class='_2yccxO D0YrLF'])[2]");
		click(eleScrSize);
		
		WebElement eleExactSize = locateElement("xpath", "//div[text()='48 - 55']");
		click(eleExactSize);
		
		WebElement eleFirstResPrice = locateElement("xpath", "(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String tvPriceInFirstPage = getText(eleFirstResPrice);
		
		System.out.println("Price Of the Selected TV is:" +tvPriceInFirstPage);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleFirstRes = locateElement("xpath", "(//div[@class='_3wU53n'])[1]");
		click(eleFirstRes);
				
		switchToWindow(1);
		
		System.out.println("Navigated to New Window");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleSecondPagePrice = locateElement("xpath", "//div[@class='_1vC4OE _3qQ9m1']");
		String tvPriceInSecondPage = getText(eleSecondPagePrice);
		
		verifyText(tvPriceInFirstPage,tvPriceInSecondPage);
		
		System.out.println("Price Of the TV in Second Page:" +tvPriceInSecondPage);
		
		closeActiveBrowser();
		
		System.out.println("Closed the Second Window");
		
		switchToWindow(0);
		
		System.out.println("Back to parent Window");
		
		WebElement eleAddToCompare = locateElement("xpath", "(//div[@class='_1p7h2j'])[18]");
		click(eleAddToCompare);
		
		WebElement eleAddToCompare2 = locateElement("xpath", "(//div[@class='_1p7h2j'])[19]");
		click(eleAddToCompare2);
		
		WebElement eleClickCompare = locateElement("xpath", "//span[text()='COMPARE']");
		String compareButtonName = getText(eleClickCompare);
		
		System.out.println("Compare Button Name is:" +compareButtonName);
		
		click(eleClickCompare);
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement eleSectionTitle = locateElement("xpath", "(//span[text()='Compare'])[1]");
		String sectionTitle = getText(eleSectionTitle);
		
		System.out.println("Section Title is:" +sectionTitle);
		
	    boolean compareSectionResult = compareButtonName.equalsIgnoreCase(sectionTitle);
	    
	    System.out.println("Compare section Result is:" +compareSectionResult);

				
		WebElement eleCompareOnePrice = locateElement("xpath", "(//div[@class='_1vC4OE'])[1]");
		String compareFirstTvPrice = getText(eleCompareOnePrice);
	
		System.out.println("First TV Price in Compare Screen:" +compareFirstTvPrice);
				
		String withoutSplCharacter = compareFirstTvPrice.substring(1);
		
		System.out.println("First TV Price without Spl char:" +withoutSplCharacter);
		
		String replacesplChar = withoutSplCharacter;
		
		replacesplChar = replacesplChar.replaceAll(",", "");
		
		System.out.println("First TV After Replaced:" +replacesplChar);
		
				
		int firstprice = Integer.parseInt(replacesplChar);
		
		WebElement eleCompareTwoPrice = locateElement("xpath", "(//div[@class='_1vC4OE'])[2]");
		String compareSecondTvPrice = getText(eleCompareTwoPrice);
		
		
		System.out.println("Second  TV Price in Compare Screen:" +compareSecondTvPrice);
		
		String withoutSplCharacter2 = compareSecondTvPrice.substring(1); 
		
		System.out.println("Second TV Price without Spl char:" +withoutSplCharacter2);

		String replacesplChar2 = withoutSplCharacter2;
		
		replacesplChar2 = replacesplChar2.replaceAll(",", "");
		
		System.out.println("Second TV after Replaced:" +replacesplChar2);
		
				
		int secondprice = Integer.parseInt(replacesplChar2);			
		System.out.println("Second TV in Compare Screen:" +secondprice);
		
		verifyResult(firstprice, secondprice);
		
		
	  }
	}


