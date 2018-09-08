package com.craftsville.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Craftsville.qa.pompages.Homepage;
import com.Craftville.qa.Generic.BaseTest;


public class TestHomepage extends BaseTest{
	Homepage homepage;
	public static WebDriver driver = null;
	public TestHomepage() {
		super();		
	}
@BeforeMethod
public void initialsetup(){
	BaseTest.initialization();
	homepage= new Homepage();
}
	
	
//@Test(priority=1)
//public void Testclickonsignin() {
//	 homepage.clickOnSignIn();
//}
//	
@Test(priority=2)
public void Testgotosarees() {
	 homepage.goToSarees();
}
	
//@Test(priority=3)
//public void Testclickoncart() {
//	 homepage.clickOnCart();
//}	
//	
//@Test(priority=4)
//public void Testgotoskurthitunics() {
//	 homepage.goToKurtisTunics();
//}
//@Test(priority=5)// unable to identify
//public void Testverifyimage() {
//	 homepage.VerifyImage();
//}	
	
@Test(priority=6)
public void Testgotorelegonalsarees() {
	 homepage.goToRelegionalSarees();	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
