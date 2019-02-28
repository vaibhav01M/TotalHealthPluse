package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Keywords.Constants;
import Keywords.Keywords;


public class PatientLogInTest {
	
	@BeforeTest
	public static void openingBrowser(){
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
		Keywords.sleep( );
	}
		@AfterTest
		public static void closingBrowser(){
			//Keywords.sleep( );
			Keywords.closeBrowser();
			Keywords.sleep( );
	}
	@Test
	public static void PatientLogin9(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin10(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin11(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin12(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin13(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin14(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin15(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin16(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void PatientLogin17(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	
}
