package com.Craftsville.qa.pompages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Craftville.qa.Generic.BaseTest;
import com.Craftville.qa.Generic.GenericMethods;



public class Homepage extends BaseTest{
	
	GenericMethods gm;
	
	//Declaration
	@FindBy(xpath= "//span[text()='Sign In']")
	private WebElement signIn;
	
	@FindBy(xpath= "//span[text()='Cart ']")
	private WebElement cart;
	
	@FindBy(xpath= "//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall'][1]")
	private WebElement sarees;
	
	@FindBy(xpath= "//a[contains(@href,\"/womens-clothing/kurtis-tunics/?\")]")
	private WebElement kurtistunics;
	
	@FindBy(xpath= "//a[contains(@ href,\"/womens-clothing/salwar-suits/?MID=megamenu_salwarsuit_seeall\")][1]")
	private WebElement salwarsuit;
	      
	@FindBy(xpath="//img[@src=\"https://img3.craftsvilla.com/image/upload/f_auto/assets1/banner-craftsvilla/cvfeeds/1535530685_kurtis_340.jpg\"]")
	private WebElement image;
	
	@FindBy(xpath= "//a[@href=\"https://www.craftsvilla.com/cvfeeds/buy-craftsvilla-women-ethnic-wear-regional-sarees-online\"]")
	private WebElement relegionalsarees;
	
  
	//Utilization
	

	 public Homepage(){	
		PageFactory.initElements(driver, this);	
		gm = new GenericMethods();
	}
	public void clickOnSignIn() {		
	gm.verifyElementPresent(signIn);		
	 signIn.click();		
   }     
	
	public void clickOnCart() {
		gm.verifyElementPresent(cart);
		cart.click();
	}
	public void goToSarees() {
		gm.verifyElementPresent(sarees);
		gm.mouseHover(driver, sarees);
		//gm.waitUntillElementappears(relegionalsarees);
		relegionalsarees.click();
	}
	
	public void goToKurtisTunics() {
		gm.verifyElementPresent(kurtistunics);
		gm.mouseHover(driver, kurtistunics);
		kurtistunics.click();
	}
	
	public void goToSalwarSuit() {
		gm.verifyElementPresent(salwarsuit);
		gm.mouseHover(driver, salwarsuit);
		salwarsuit.click();
	}
	
	public void VerifyImage() {
		gm.verifyElementPresent(image);
		gm.waitUntillElementappears(image);
		image.click();;
	}
	public relegionalSareesPage goToRelegionalSarees() {
		gm.verifyElementPresent(sarees);
		gm.mouseHover(driver, sarees);
		gm.waitUntillElementappears(relegionalsarees);
		gm.verifyElementPresent(relegionalsarees);
		relegionalsarees.click();
		return new relegionalSareesPage();
	}
	
	public SignupPage gotosignuppage() {
		gm.verifyElementPresent(signIn);
		signIn.click();
		return new SignupPage();
	}
}