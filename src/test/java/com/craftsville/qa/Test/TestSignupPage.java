package com.craftsville.qa.Test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Craftsville.qa.pompages.Homepage;
import com.Craftsville.qa.pompages.SignupPage;
import com.Craftsville.qa.pompages.relegionalSareesPage;
import com.Craftville.qa.Generic.BaseTest;
import com.Craftville.qa.Generic.GenericMethods;
import com.Craftville.qa.Generic.ReadExcel;

public class TestSignupPage  extends BaseTest{
	
		Homepage hm;
		relegionalSareesPage rsp;
		GenericMethods gm;
		SignupPage sp;
		public static WebDriver driver = null;
		public static Properties prop;
		
		public TestSignupPage () {
			super();		
		}
	@BeforeMethod
	public void initialsetup(){
		BaseTest.initialization();
		hm= new Homepage();
		rsp =new relegionalSareesPage();
		gm = new GenericMethods();
		sp = new SignupPage();
		
	}
//	
//@Test(priority=1)
//	public void TestSignUp() {		 
//		hm.gotosignuppage();
//		sp.GetSignupMessage();			
//	}

//@Test(priority=2)
//public void TestcreateaccountusingSignUp() {		 
//	hm.gotosignuppage();
//	sp.EnterEmail();
//	sp.Enterpassword();
//	sp.mousehoveraccount();
//	sp.ClickOnlogout();
//	gm.waitforpagetoload("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
//	
//}
	@Test(priority=1)
  public void TestDatadriven() {
	  //prop =new Properties();
	 // String[][] credentials =ReadExcel.getdata(prop.getProperty("filepath"),"login");
	  String[][] credentials =ReadExcel.getdata("C:\\Users\\kavitha\\eclipse-workspace\\Craftsvilla\\InputData\\Credentials.xlsx","login");
	  
	  for (int i=1; i<credentials.length; i++)
	  {
		  String email =credentials[i][0];
		  String password =credentials[i][1];
		  
		    hm.gotosignuppage();
			sp.EnterEmail(email);
			sp.Enterpassword(password);
			sp.mousehoveraccount();
			sp.ClickOnlogout();
			gm.waitforpagetoload("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
			
	  }
   
}
	@AfterMethod
	public void teardown() {  
	driver.quit();
	}
}
