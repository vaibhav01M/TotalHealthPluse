package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import Keywords.Constants;
import Keywords.Keywords;

public class DoctorLogInTest {
	
	@BeforeTest
	public static void openingBrowser(){
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
		Keywords.sleep();
}
	@AfterTest
	public static void closingBrowser(){
		Keywords.sleep();
		Keywords.closeBrowser();
		Keywords.sleep();
	}
	@Test
	public static void DoctorLogin9(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin10(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin11(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin12(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin13(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin14(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin15(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin16(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void DoctorLogin17(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
}
