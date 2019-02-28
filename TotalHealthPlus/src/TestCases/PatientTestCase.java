package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Keywords.Constants;
import Keywords.Keywords;
import Utility.ReadExcelFile;
import Utility.writeExcelSheet;

@Listeners(Utility.ListenerUtils.class)
public class PatientTestCase {

	public static String patName, patEmail, patPassword, patAddress, patPhone, patSex, patBirth, patAge,
			patBlood = null;

	@BeforeTest
	public static void browserUrlLaunch() {
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
		Keywords.sleep();
		//ReadExcelFile RExcFile = new ReadExcelFile();
		//Constants.wb.createSheet("PatCred");
		//if(Constants.wb.i)
		//System.out.println("Sheet created ");
	}

	@AfterTest
	public static void closeBrowser() {
		Keywords.closeBrowser();
	}
	public static void adminLogin() {
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email", "emailtxt");
		Keywords.enterText("password", "passwordtxt");
		Keywords.clickButton("Login");
	}
	public static void logOut() {
		Keywords.clickButton("account");
		Keywords.clickButton("logout");
	}
	
  public static void fillPatientData(){
	  
	  Keywords.clickButton("patient_ad");
	  
	  for (int rowNum = 1; rowNum < 11; rowNum++) {
	  Keywords.clickButton("add_patient");
	  Keywords.enterTextFromExcel("patient_name", patName =
	  ReadExcelFile.getCellData("PatientData", rowNum, 0));
	  Keywords.enterTextFromExcel("patient_email", patEmail =
	  ReadExcelFile.getCellData("PatientData", rowNum, 1));
	  Keywords.enterTextFromExcel("patient_password", patPassword =
	  ReadExcelFile.getCellData("PatientData", rowNum, 2));
	  Keywords.enterTextFromExcel("patient_address", patAddress =
	  ReadExcelFile.getCellData("PatientData", rowNum, 3));
	  Keywords.enterTextFromExcel("patient_phone", patPhone =
	  ReadExcelFile.getCellData("PatientData", rowNum, 4));
	  Keywords.selectFromDropDown("patient_sex_dd", patSex =
	  ReadExcelFile.getCellData("PatientData", rowNum, 5));
	  Keywords.enterTextFromExcel("patient_birthdate", patBirth =
	  ReadExcelFile.getCellData("PatientData", rowNum, 6));
	  Keywords.clickButton("blank_space");
	  Keywords.enterTextFromExcel("patient_age", patAge =
	  ReadExcelFile.getCellData("PatientData", rowNum, 7));
	  Keywords.selectFromDropDown("patient_bloodgroup_dd", patBlood =
	  ReadExcelFile.getCellData("PatientData", rowNum, 8));
	  Keywords.clickButton("add_patient_button"); Keywords.sleep();
	  Keywords.clickButton("search_patient");
	  Keywords.enterTextFromExcel("patient_name", patName =
	  ReadExcelFile.getCellData("PatientData", rowNum, 0));
	  Keywords.sleep();
	 } 
	 }
	
	 
  public static void addVerifyFilledPatientData() {
		// adding data of patients
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email", "emailtxt");
		Keywords.enterText("password", "passwordtxt");
		Keywords.clickButton("Login");
		Keywords.clickButton("patient_ad");

		for (int rowNum = 1; rowNum < 11; rowNum++) {
			Keywords.clickButton("add_patient");
			Keywords.enterTextFromExcel("patient_name", patName = ReadExcelFile.getCellData("PatientData", rowNum, 0));
			Keywords.enterTextFromExcel("patient_email", patEmail = ReadExcelFile.getCellData("PatientData", rowNum, 1));
			Keywords.enterTextFromExcel("patient_password",
					patPassword = ReadExcelFile.getCellData("PatientData", rowNum, 2));
			Keywords.enterTextFromExcel("patient_address",
					patAddress = ReadExcelFile.getCellData("PatientData", rowNum, 3));
			Keywords.enterTextFromExcel("patient_phone", patPhone = ReadExcelFile.getCellData("PatientData", rowNum, 4));
			Keywords.selectFromDropDown("patient_sex_dd", patSex = ReadExcelFile.getCellData("PatientData", rowNum, 5));
			Keywords.enterTextFromExcel("patient_birthdate",
					patBirth = ReadExcelFile.getCellData("PatientData", rowNum, 6));
			Keywords.clickButton("blank_space");
			Keywords.enterTextFromExcel("patient_age", patAge = ReadExcelFile.getCellData("PatientData", rowNum, 7));
			Keywords.selectFromDropDown("patient_bloodgroup_dd",
					patBlood = ReadExcelFile.getCellData("PatientData", rowNum, 8));
			Keywords.clickButton("add_patient_button");
			Keywords.sleep( );
			// Keywords.clickButton("search_patient");
			Keywords.enterTextFromExcel("search_patient", patName = ReadExcelFile.getCellData("PatientData", rowNum, 0));
			Keywords.sleep( );
		}

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		// verifying data of patient

		 	}

 @Test	 	
  public static void verifyPatientLogIn1(){
	
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 1, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 1, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();
		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		boolean result = Constants.expectedTitle.equalsIgnoreCase(Constants.actualTitle);
		System.out.println("Assertion = "+ result);
		if (result = true)
		{
			 writeExcelSheet.setCellData("Patient Credentials", ReadExcelFile.getCellData("PatientData", 1, 1), 1, 0);
		     writeExcelSheet.setCellData("Patient Credentials", ReadExcelFile.getCellData("PatientData", 1, 2), 1, 1);
		}    
		
		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

  }
 
 @Test
 public static void verifyPatientLogIn11(){
	 
	 Keywords.selectFromDropDown("account_type", "patient");
	 Keywords.enterTextFromExcel("patient_email",
			 patEmail = ReadExcelFile.getCellData("PatientData", 10, 1));
	 Keywords.enterTextFromExcel("patient_password",
			 patPassword = ReadExcelFile.getCellData("PatientData", 1, 2));
	 Keywords.clickButton("Login");
	 Keywords.sleep( );
	 Keywords.getPageTitle();
	 
	 Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
	 System.out.println("Assertion sexiful");
	 boolean result = Constants.expectedTitle.equalsIgnoreCase(Constants.actualTitle);
	 System.out.println("Assertion = "+ result);
	 if (result = true)
	 {
		 writeExcelSheet.setCellData("Patient Credentials", ReadExcelFile.getCellData("PatientData", 10, 1), 2, 0);
		 writeExcelSheet.setCellData("Patient Credentials", ReadExcelFile.getCellData("PatientData", 1, 2), 2, 1);
	 }    
	 
	 Keywords.clickButton("account");
	 Keywords.clickButton("logout");
	 Keywords.sleep( );
	 
 }

  public static void verifyPatientLogIn2(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 2, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 2, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}
 
  
  public static void verifyPatientLogIn3(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 3, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 3, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}

  
  public static void verifyPatientLogIn4(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 4, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 4, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}
  
  
  public static void verifyPatientLogIn5(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 5, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 5, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}
  
  
  public static void verifyPatientLogIn6(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 6, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 6, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}

  
  public static void verifyPatientLogIn7(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 7, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 7, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}

  
  public static void verifyPatientLogIn8(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 8, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 8, 2));
		Keywords.clickButton("Login");
		Keywords.sleep( );
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep( );

}

  
  public static void verifyPatientLogIn9(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 9, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 9, 2));
		Keywords.clickButton("Login");
		Keywords.sleep();
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep();

}

  
  public static void verifyPatientLogIn10(){
		
	  	Keywords.selectFromDropDown("account_type", "patient");
		Keywords.enterTextFromExcel("patient_email",
				patEmail = ReadExcelFile.getCellData("PatientData", 10, 1));
		Keywords.enterTextFromExcel("patient_password",
				patPassword = ReadExcelFile.getCellData("PatientData", 10, 2));
		Keywords.clickButton("Login");
		Keywords.sleep();
		Keywords.getPageTitle();

		Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
		System.out.println("Assertion sexiful");

		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.sleep();

}

	 	
	 	
}

/*
  Keywords.browserLoad_EnterUrl_SelectLangEng(); 
  Keywords.adminLogin();
  
  Keywords.clickButton("patient_HMS"); Keywords.clickButton("add_patient");
  Keywords.enterText("patient_name","pat_name");
  Keywords.enterText("patient_email","pat_email");
  Keywords.enterText("patient__password","pat_password");
  Keywords.enterText("patient_password", "pat_password");
  
  Keywords.enterText("patient_address","pat_address");
  Keywords.enterText("patient_phone","pat_phone");
  Keywords.selectFromDropDown("patient_sex_dd", "male");
  Keywords.enterText("patient_birthdate", "pat_birthdate");
  
  Keywords.clickButton("blank_space");
  
  
  Keywords.enterText("patient_age", "pat_age");
  Keywords.selectFromDropDown("patient_bloodgroup_dd", "A+");
  Keywords.clickButton("add_patient_button");
  
  Keywords.sleep(0); Keywords.clickButton("account");
  Keywords.clickButton("logout");
  
  Keywords.selectFromDropDown("account_type", "patient");
  Keywords.enterText("patient_email", "pat_email");
  Keywords.enterText("patient_password", "pat_password");
  Keywords.clickButton("Login"); Keywords.sleep(0);
 */
