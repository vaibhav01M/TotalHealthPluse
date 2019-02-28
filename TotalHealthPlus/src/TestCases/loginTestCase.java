package TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import Keywords.Constants;
import Keywords.Keywords;
//import junit.framework.Assert;

public class loginTestCase {
	
	@BeforeTest
	public static void openingBrowser(){
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
}
	@AfterTest
	public static void closingBrowser(){
		Keywords.closeBrowser();
	}
	
/*//accountType login
	
	public static void accountTypeLogin1(){
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );		
	}
	public static void accountTypeLogin2(){ 
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void accountTypeLogin3(){		 
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin4(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin5(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void accountTypeLogin6(){
		Keywords.enterText("email","AccountType_emailWrongtxt");
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin7(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.enterText("password", "AccountType_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin8(){
		Keywords.enterText("email","AccountType_emailWrongtxt");
		Keywords.enterText("password", "AccountType_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin9(){
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin10(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin11(){
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin12(){
		Keywords.enterText("email","AccountType_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin13(){
		Keywords.enterText("password", "AccountType_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin14(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin15(){
		Keywords.enterText("email","AccountType_emailWrongtxt");
		Keywords.enterText("password", "AccountType_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin16(){
		Keywords.enterText("email","AccountType_emailtxt");
		Keywords.enterText("password", "AccountType_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountTypeLogin17(){
		Keywords.enterText("email","AccountType_emailWrongtxt");
		Keywords.enterText("password", "AccountType_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}

// accountant login
	 
	public static void accountantLogin2(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void accountantLogin3(){
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin4(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin5(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void accountantLogin6(){
		Keywords.enterText("email","accountant_emailWrongtxt");
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin7(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.enterText("password", "accountant_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin8(){
		Keywords.enterText("email","accountant_emailWrongtxt");
		Keywords.enterText("password", "accountant_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin9(){
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin10(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin11(){
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin12(){
		Keywords.enterText("email","accountant_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin13(){
		Keywords.enterText("password", "accountant_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin14(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin15(){
		Keywords.enterText("email","accountant_emailWrongtxt");
		Keywords.enterText("password", "accountant_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin16(){
		Keywords.enterText("email","accountant_emailtxt");
		Keywords.enterText("password", "accountant_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void accountantLogin17(){
		Keywords.enterText("email","accountant_emailWrongtxt");
		Keywords.enterText("password", "accountant_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	
	//laboratorist,eo login
	 
	public static void laboratoristeoLogin2(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void laboratoristeoLogin3(){
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin4(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin5(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void laboratoristeoLogin6(){
		Keywords.enterText("email","laboratoristeo_emailWrongtxt");
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin7(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.enterText("password", "laboratoristeo_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin8(){
		Keywords.enterText("email","laboratoristeo_emailWrongtxt");
		Keywords.enterText("password", "laboratoristeo_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin9(){
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin10(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin11(){
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin12(){
		Keywords.enterText("email","laboratoristeo_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin13(){
		Keywords.enterText("password", "laboratoristeo_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin14(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin15(){
		Keywords.enterText("email","laboratoristeo_emailWrongtxt");
		Keywords.enterText("password", "laboratoristeo_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin16(){
		Keywords.enterText("email","laboratoristeo_emailtxt");
		Keywords.enterText("password", "laboratoristeo_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void laboratoristeoLogin17(){
		Keywords.enterText("email","laboratoristeo_emailWrongtxt");
		Keywords.enterText("password", "laboratoristeo_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	
	// pharmacist login
		 
	public static void pharmacistLogin2(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void pharmacistLogin3(){
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin4(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin5(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void pharmacistLogin6(){
		Keywords.enterText("email","pharmacist_emailWrongtxt");
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin7(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.enterText("password", "pharmacist_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin8(){
		Keywords.enterText("email","pharmacist_emailWrongtxt");
		Keywords.enterText("password", "pharmacist_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin9(){
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin10(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin11(){
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin12(){
		Keywords.enterText("email","pharmacist_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin13(){
		Keywords.enterText("password", "pharmacist_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin14(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin15(){
		Keywords.enterText("email","pharmacist_emailWrongtxt");
		Keywords.enterText("password", "pharmacist_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin16(){
		Keywords.enterText("email","pharmacist_emailtxt");
		Keywords.enterText("password", "pharmacist_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void pharmacistLogin17(){
		Keywords.enterText("email","pharmacist_emailWrongtxt");
		Keywords.enterText("password", "pharmacist_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
	
	
	// nurse login
	 
	/*  public static void nurseLogin2(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void nurseLogin3(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin4(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin5(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void nurseLogin6(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin7(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin8(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin9(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin10(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin11(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin12(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin13(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin14(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin15(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin16(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
*		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void nurseLogin17(){
		Keywords.selectFromDropDown("account_type", "nurse");
		Keywords.enterText("email","nurse_emailWrongtxt");
		Keywords.enterText("password", "nurse_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
	
	// patient login
	 
	/*public static void PatientLogin2(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void PatientLogin3(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin4(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin5(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void PatientLogin6(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin7(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin8(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin9(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin10(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin11(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin12(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin13(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin14(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin15(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin16(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void PatientLogin17(){
		Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterText("email","Patient_emailWrongtxt");
		Keywords.enterText("password", "Patient_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
	
	
    // Doctor type Login 
	 
	/*public static void DoctorLogin2(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
	public static void DoctorLogin3(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin4(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin5(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
	public static void DoctorLogin6(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin7(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin8(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin9(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin10(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin11(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin12(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin13(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin14(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin15(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin16(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	public static void DoctorLogin17(){
		Keywords.selectFromDropDown("account_type", "doctor");
		Keywords.enterText("email","Doctor_emailWrongtxt");
		Keywords.enterText("password", "Doctor_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
	
	
	// Admin type Login 
 	/*@Test
	public static void adminLogin2(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );	
	}
 	@Test
 	public static void adminLogin3(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin4(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
 	//@Test
	/*public static void adminLogin5(){		
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.takeScreenShot();
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin6(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailWrongtxt");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin7(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.enterText("password", "admin_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin8(){		
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailWrongtxt");
		Keywords.enterText("password", "admin_passwordWrongtxt");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}*/
 	
	public static void adminLogin9(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin10(){
		Keywords.enterText("email","admin_emailtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin11(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	
	public static void adminLogin12(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	
	public static void adminLogin13(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("password", "admin_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin14(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin15(){		
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailWrongtxt");
		Keywords.enterText("password", "admin_passwordtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin16(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailtxt");
		Keywords.enterText("password", "admin_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
 	@Test
	public static void adminLogin17(){
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email","admin_emailWrongtxt");
		Keywords.enterText("password", "admin_passwordWrongtxt");
		Keywords.clickButton("Login");
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle );
	}
	
}	
	 