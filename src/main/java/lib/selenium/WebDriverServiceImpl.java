package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {
		
		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));
			
			case "class": return driver.findElement(By.className(locValue));
			
			case "link" : return driver.findElement(By.linkText(locValue));
			
			case "name" : return driver.findElement(By.name(locValue));
			
			case "xpath" : return driver.findElement(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element Not found with locator" +locator+ "and the value is" +locValue);
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportSteps("Value entered", "PASS");
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Ele" +ele+ "is not ready for typing");
			reportSteps("Element not Identified", "FAIL");
		}		
	}

	
	
	public void click(WebElement ele) {
		try {
			ele.click();
			reportSteps("Element Identified", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("Element Not found with locator" +ele);
			reportSteps("Element not Identified", "FAIL");
		}		
	}

	public String getText(WebElement ele) {
		String text = "";
		// TODO Auto-generated method stub
		try {
			text = ele.getText();
		} catch (InvalidSelectorException e) {
			// TODO Auto-generated catch block
			System.err.println(ele+ "is selected wrongly");
		}
		 catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println(ele+ "Not Found");
			}
		 catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				System.err.println("Browser closed");
			}
		return text;
	}
	
	public void clear(WebElement ele)
	{
		driver.unregister(this);
		ele.clear();
		driver.register(this);
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);

	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String actualText = getText(ele);
		
		if(actualText.contentEquals(expectedText))
		{
			System.out.println("Account ID Verified Successfully");
		}
		
		else
		{
			System.out.println("Account ID MISMATCH");
		}
		
	}

	public void verifyText(String actual, String expect)
	{
		
		if(actual.equals(expect)) 
		{
			System.out.println("PASS");
		} 
		else
		{
			System.out.println("FAIL");
		}
	}
	
	
	public void verifyResult(int firstVal, int secondVal) 
	{
		if(firstVal == secondVal) 
		{
			System.out.println("Two values are SAME");
		} else 
		{
			System.out.println("Two values are NOT SAME");
		}
		if(firstVal > secondVal) 
		{
			System.out.println("First value is Bigger");
		}
		
		else 
		{
			System.out.println("Second value is Bigger");
		}
		
	}
	
	
 	public void verifyPartialText(WebElement ele, String expectedText) {

		// TODO Auto-generated method stub
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		Set<String> allWind = driver.getWindowHandles();
		List<String> listOfWin = new ArrayList<String>();
		listOfWin.addAll(allWind);
		driver.switchTo().window(listOfWin.get(index));
		
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
	
		//driver.alert.accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		driver.close();
		
	}

	public void verifyURL()
	{
	System.out.println("URL Verified");
	System.out.println();
	}
	
	
	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

	public void pressEscapeKey() {
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
	}
	
	public void mouseHoverOver(WebElement ele) {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
	}
		

}
