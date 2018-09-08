package com.craftsville.qa.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Craftsville.qa.pompages.Homepage;
import com.Craftsville.qa.pompages.relegionalSareesPage;
import com.Craftville.qa.Generic.BaseTest;
import com.Craftville.qa.Generic.GenericMethods;

public class TestRelegionalSarees extends BaseTest{
	
		Homepage homepage;
		relegionalSareesPage rsp;
		GenericMethods gm;
		public static WebDriver driver = null;
		
		public TestRelegionalSarees() {
			super();		
		}
	@BeforeMethod
	public void initialsetup(){
		BaseTest.initialization();
		homepage= new Homepage();
		rsp =new relegionalSareesPage();
		gm = new GenericMethods();
	}
	
//	@Test(priority=1)
//	public void Testgotorelegonalsarees() {
//		 homepage.goToRelegionalSarees();	
//	}
//	@Test(priority=2)
//	public void Testverifytitle() {
//		homepage.goToRelegionalSarees();
//		 gm.verifyTitle("https://www.craftsvilla.com/cvfeeds/buy-craftsvilla-women-ethnic-wear-regional-sarees-online");
//		
//	}
	@Test(priority=3)
	public void Testclickonpage3() {
		homepage.goToRelegionalSarees();
		 rsp.clickOnPage3();	
	}
//	@Test(priority=4)
//	public void Testverifypricehightolow() {
//		homepage.goToRelegionalSarees();
//		rsp.verifyPriceHightolow();
//		
//	}
}
