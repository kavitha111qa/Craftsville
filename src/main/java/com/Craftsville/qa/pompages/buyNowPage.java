package com.Craftsville.qa.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Craftville.qa.Generic.GenericMethods;

public class buyNowPage extends GenericMethods{
	GenericMethods gm;
	WebDriver driver;
	public buyNowPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "address-email")
	private WebElement emailaddress;
	
	@FindBy(id= "address-first-name")
	private WebElement firstname;
	
	@FindBy(id= "address-last-name")
	private WebElement lastname;
	
	@FindBy(id= "address-street-one")
	private WebElement address;
	
	@FindBy(id= "address-mobileno")
	private WebElement mobileno;
	
	@FindBy(id= "address-form-submit")
	private WebElement delivertothisaddress;
		
	@FindBy(id= "//div[@data-payment-type='debit-card']")
	private WebElement debitcard;
	
	@FindBy(id= "change-address")
	private WebElement changeaddress;
	
	@FindBy(id= "edit-address")
	private WebElement editaddress;
	
	public void typeEmailAddress() {
		gm.verifyElementPresent(emailaddress);
		emailaddress.sendKeys(prop.getProperty("username"));	
	}
	public void typefirstname() {
		gm.verifyElementPresent(firstname);
		firstname.sendKeys(prop.getProperty("Firstname"));	
	}
	public void typelastname() {
		gm.verifyElementPresent(lastname);
		lastname.sendKeys(prop.getProperty("Lastname"));	
	}
	
	public void typeaddress() {
		gm.verifyElementPresent(address);
		address.sendKeys(prop.getProperty("Address"));	
	}
	public void typemobileno() {
		gm.verifyElementPresent(mobileno);
		mobileno.sendKeys(prop.getProperty("Mobileno"));	
	}
	public void clickOnsubmitaddress() {
		gm.verifyElementPresent(delivertothisaddress);
		delivertothisaddress.click();	
	}
	public void clickOnchangeaddress() {
		gm.verifyElementPresent(changeaddress);
		changeaddress.click();	
	}
	public void clickOnseditaddress() {
		gm.verifyElementPresent(editaddress);
		editaddress.click();	
	}
	
	
	
	

}
