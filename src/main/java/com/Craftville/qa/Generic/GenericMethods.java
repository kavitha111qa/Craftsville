package com.Craftville.qa.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.Craftsville.qa.pompages.Homepage;

public class GenericMethods extends BaseTest {

	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver,10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log(ele + "found");
			
		}catch(Exception e) {
			Reporter.log(ele + " Not found");
		}
	}
	public void verifyTitle(String exp_title)
    {
		WebDriverWait w = new WebDriverWait(driver,10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			String act_title =driver.getTitle();
			Assert.assertEquals(act_title,exp_title);
		}catch(Exception e) {
			Reporter.log("Fail,title not returned");
		}
	
	}
		
		
		public void mouseHover(WebDriver driver,WebElement ele)
		{
		try
			{
				Actions action =new Actions(driver);
				action.moveToElement(ele).perform();
				Reporter.log(ele + " mousehovered");
			
           }catch(Exception e) {
				Reporter.log(ele + "unable to mousehover");
			}	
		}	
	
		public void waitUntillElementappears(WebElement exp_ele)
	    {
			WebDriverWait w = new WebDriverWait(driver,10);
			try
			{
				w.until(ExpectedConditions.elementToBeClickable(exp_ele));
			}catch(Exception e) {
				Reporter.log("Fail,title not returned");
			}
		
		}
		
		public void waitforpagetoload(String title)
	    {
			WebDriverWait w = new WebDriverWait(driver,10);
			try
			{
				w.until(ExpectedConditions.titleIs(title));
			}catch(Exception e) {
				Reporter.log("Fail,title not returned");
			}
		
		}
		
		
		
}
	








