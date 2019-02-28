package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import Keywords.Constants;
import Keywords.Keywords;
import Utility.ExcelUtils;
//import junit.framework.Assert;

public class AdminLogInTestCase {

	@BeforeTest
	public static void openingBrowser() {
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
		Keywords.sleep();
	}

	@AfterTest
	public static void closingBrowser() {
		Keywords.sleep();
		Keywords.closeBrowser();
		Keywords.sleep();
	}
	
	
	@Test
	public static void adminLoginTest() throws IOException {
		Keywords.selectFromDropDown("account_type", "admin");

		for (int colNumEmail = 2, rowNumEmail = 2; rowNumEmail < 60; rowNumEmail++) {

			Keywords.enterText("email", ExcelUtils.readExcelFileCellData(Constants.testCaseDataFilePath,
					Constants.sheetName, rowNumEmail, colNumEmail));

 
			for (int colNumPass = 3, rowNumPass = 2; rowNumPass < 60; rowNumPass++) {

				Keywords.enterText("password", ExcelUtils.readExcelFileCellData(Constants.testDataFilePath,
						Constants.sheetName, rowNumPass, colNumPass));			 

				Keywords.clickButton("login");
				Keywords.getPageTitle();
				Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
			}
		}

	}
}
	
	
	
	
	/*

	
	  // Admin type Login
	  
	  @Test public static void adminLogin9(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin10(){
	  Keywords.enterText("email","admin_emailtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	 Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	 
	 @Test public static void adminLogin11(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("password", "admin_passwordtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  @Test public static void adminLogin12(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("email","admin_emailWrongtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin13(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("password", "admin_passwordWrongtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin14(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("email","admin_emailtxt");
	  Keywords.enterText("password", "admin_passwordtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin15(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("email","admin_emailWrongtxt");
	  Keywords.enterText("password", "admin_passwordtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin16(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("email","admin_emailtxt");
	  Keywords.enterText("password", "admin_passwordWrongtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	  
	  @Test public static void adminLogin17(){
	  Keywords.selectFromDropDown("account_type", "admin");
	  Keywords.enterText("email","admin_emailWrongtxt");
	  Keywords.enterText("password", "admin_passwordWrongtxt");
	  Keywords.clickButton("Login"); Keywords.getPageTitle();
	  Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle ); }
	 
}
*/