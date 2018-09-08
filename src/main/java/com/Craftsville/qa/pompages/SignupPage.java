package com.Craftsville.qa.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Craftville.qa.Generic.BaseTest;
import com.Craftville.qa.Generic.GenericMethods;

public class SignupPage extends BaseTest{
	
	GenericMethods gm;
	Homepage hm;
	relegionalSareesPage rsp;
	
	
	@FindBy(id= "emailId")
	private WebElement signupEmailId;
	
	@FindBy(id= "continueBtn")
	private WebElement ClickonContinue;
	
	@FindBy(id= "userRegister")
	private WebElement Register;
	
	@FindBy(id= "/login-signup-msg")
    private WebElement SignupMessage;
	
	@FindBy(id= "set-password")
    private WebElement password_ele;
	
	@FindBy(id= "uloginCheck")
    private WebElement Login;

	@FindBy(xpath= "//a[@href=\"https://cvaccount.craftsvilla.com/customer/account/logout\"]")
    private WebElement Logout;
	
	@FindBy(xpath= "//i[@class='icon cv-login']")
    private WebElement hoverover;
	
	@FindBy(xpath= "//i[@class='icon first_arrow hidden-xs']" )		
    private WebElement account;
	
	
	public SignupPage(){
    	PageFactory.initElements(driver, this);
    	hm= new Homepage();
		rsp =new relegionalSareesPage();
		gm = new GenericMethods();
		
	}
	     
			
	public void GetSignupMessage(){		
			gm.verifyElementPresent(SignupMessage);		
			 String message = SignupMessage.getText();
			 Assert.assertEquals(message, "Please provide your email to Login/Sign Up");
			 
		   }    	 

	public void EnterEmail(String email) {
		gm.verifyElementPresent(signupEmailId);		
		signupEmailId.sendKeys(email);
		ClickonContinue.click();			
	}
	
	public void Enterpassword(String setpassword) {
		gm.verifyElementPresent(password_ele);
		password_ele.sendKeys(setpassword);
		Register.click();				
	}	
	
	public void mousehoveraccount() {		
		gm.verifyElementPresent(account);
		gm.mouseHover(driver, account);			
	}	
		
	public void ClickOnlogout() {		
		gm.verifyElementPresent(Logout);
		Logout.click();				
	}			
			

		
	}

	

	

	


