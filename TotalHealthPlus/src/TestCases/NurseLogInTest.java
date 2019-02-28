package TestCases;

import org.testng.Assert;
import org.testng.annotations.*;

import Keywords.Constants;
import Keywords.Keywords;

public class NurseLogInTest {
	
	@BeforeTest
	public static void openingBrowser(){
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
}
	@AfterTest
	public static void closingBrowser(){
		Keywords.closeBrowser();
	}
	@Test
	public static void nurseLogin9(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin10(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin11(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin12(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin13(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin14(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin15(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin16(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	@Test
	public static void nurseLogin17(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}

}
