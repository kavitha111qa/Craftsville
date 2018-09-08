package com.Craftsville.qa.pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftville.qa.Generic.BaseTest;
import com.Craftville.qa.Generic.GenericMethods;

public class relegionalSareesPage extends BaseTest {
	GenericMethods gm;
	Homepage homepage;
	
   
	
	@FindBy(xpath= "//label[@for='price_5000_0']")
	private WebElement priceabove5000;
	

	@FindBy(xpath= "//label[@for='price_2000_5000']")
	private WebElement priceabove2000;
	
	@FindBy(xpath= "//label[@for='css-label5']")
	private WebElement colorgreen;
	
	@FindBy(xpath= "//span[@id='discountedPriceOrder_DESC']")
	private WebElement pricehightolow;
	
	@FindBy(xpath= "//a[@id='cpp3']")
	private WebElement page3;
	
	@FindBy(xpath="//img[@data-list-src='https://img3.craftsvilla.com/image/upload/f_auto,t_500x500_2/C/V/CV-35633-MCRAF16246546220-1520511697-Craftsvilla_1.jpg']")
	private WebElement whitesaree;
	
	@FindBy(xpath= "/span[text()='Buy Now']")
	private WebElement buynow;
	
	
	public relegionalSareesPage (){
    	super();
    	PageFactory.initElements(driver, this);
    		gm = new GenericMethods();
    	 homepage = new Homepage();
    }

	public void checktitle() {
		gm.verifyTitle("https://www.craftsvilla.com/cvfeeds/buy-craftsvilla-women-ethnic-wear-regional-sarees-online");
     }
	
	public void verifyPriceAbove5000() {
		gm.verifyElementPresent(priceabove5000);
		priceabove5000.click();		
	}
	
	public void verifyPriceHightolow() {
		gm.verifyElementPresent(pricehightolow);
		pricehightolow.click();		
	}	
	public void verifyRadioButtonGreen() {
		gm.verifyElementPresent(priceabove2000);
		priceabove2000.click();	
	}
	public void clickOnPage3() {
		homepage.goToRelegionalSarees();
     JavascriptExecutor jse = ((JavascriptExecutor) driver);
     jse.executeScript("window.scrollBy(0,250)","");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gm.verifyElementPresent(page3);
		page3.click();	
	}
	public void clickOnWhiteSaree() {
		gm.verifyElementPresent(whitesaree);
		whitesaree.click();	
   }	
	public buyNowPage clickOnBuyNow() {
		gm.verifyElementPresent(buynow);
		buynow.click();	
		return new buyNowPage();
	}
	
}