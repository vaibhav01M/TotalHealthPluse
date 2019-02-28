package ExecutionEngine;

import org.testng.Assert;

import Keywords.Constants;
import Keywords.Keywords;
import Utility.ReadExcelFile;

public class ExecutionEngine {

	public static String patName, patEmail, patPassword, patAddress, patPhone, patSex, patBirth, patAge,
			patBlood = null;

	public static void main(String[] args) {
            
			
		Keywords.openBrowser("Browser");
		Keywords.enterUrl("Url");
		Keywords.sleep();
		Keywords.selectFromDropDown("account_type", "admin");
		Keywords.enterText("email", "emailtxt");
		Keywords.enterText("password", "passwordtxt");
		Keywords.clickButton("Login");
		Keywords.clickButton("patient_ad");

		for (int rowNum = 1; rowNum < 11; rowNum++) {
			Keywords.clickButton("add_patient");
			Keywords.enterTextFromExcel("patient_name", patName = ReadExcelFile.getCellData("PatientData", rowNum, 0));
			Keywords.enterTextFromExcel("patient_email",
					patEmail = ReadExcelFile.getCellData("PatientData", rowNum, 1));
			Keywords.enterTextFromExcel("patient_password",
					patPassword = ReadExcelFile.getCellData("PatientData", rowNum, 2));
			Keywords.enterTextFromExcel("patient_address",
					patAddress = ReadExcelFile.getCellData("PatientData", rowNum, 3));
			Keywords.enterTextFromExcel("patient_phone",
					patPhone = ReadExcelFile.getCellData("PatientData", rowNum, 4));
			Keywords.selectFromDropDown("patient_sex_dd", patSex = ReadExcelFile.getCellData("PatientData", rowNum, 5));
			Keywords.enterTextFromExcel("patient_birthdate",
					patBirth = ReadExcelFile.getCellData("PatientData", rowNum, 6));
			Keywords.clickButton("blank_space");
			Keywords.enterTextFromExcel("patient_age", patAge = ReadExcelFile.getCellData("PatientData", rowNum, 7));
			Keywords.selectFromDropDown("patient_bloodgroup_dd",
					patBlood = ReadExcelFile.getCellData("PatientData", rowNum, 8));
			Keywords.clickButton("add_patient_button");
			Keywords.sleep();
			Keywords.clickButton("search_patient");
			Keywords.enterTextFromExcel("patient_name", patName = ReadExcelFile.getCellData("PatientData", rowNum, 0));
			Keywords.sleep( );
		}

		Keywords.clickButton("account");
		Keywords.clickButton("logout");

		for (int rowNum = 1; rowNum < 11; rowNum++) {
			Keywords.selectFromDropDown("account_type", "patient");
			Keywords.enterTextFromExcel("patient_email",
					patEmail = ReadExcelFile.getCellData("PatientData", rowNum, 1));
			Keywords.enterTextFromExcel("patient_password",
					patPassword = ReadExcelFile.getCellData("PatientData", rowNum, 2));
			Keywords.clickButton("Login");
			Keywords.sleep();
			Keywords.getPageTitle();

			Assert.assertEquals(Constants.expectedTitle, Constants.actualTitle);
			System.out.println("Assertion sexiful");

			Keywords.clickButton("account");
			Keywords.clickButton("logout");
			Keywords.sleep();
		}

		/*
		 * Keywords.clickButton("doctor_ad");//
		 * Keywords.clickButton("add_doctor"); Keywords.enterText("name",
		 * "Viru_SahastraBuddhe"); Keywords.enterText("email",
		 * "Viru_SahastraBuddhe@gmail.com"); Keywords.enterText("password",
		 * "virus"); Keywords.enterText("address", "PES, New Delhi");
		 * Keywords.enterText("phone", "xxxxxxxxxxx");
		 * Keywords.clickButton("department");
		 * Keywords.clickButton("Physical_Therapy");
		 * Keywords.enterText("profile", "Physiotherapist");
		 * Keywords.clickButton("add_doctor_button");
		 * Keywords.clickButton("doctor_list");
		 * Keywords.enterText("Search_doctor", "Viru_SahastraBuddhe");
		 * Keywords.sleep(3000); Keywords.takeScreenShot();
		 * Keywords.sleep(3000);
		 */
		/* DepartmentTestCase.departmentTestCase(); */
		// DoctorTestCase.doctorTestCase();

		// Keywords.adminLogin();

		/*
		 * Keywords.windowResize(800, 800); Keywords.closeBrowser();
		 */

		/*
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin2();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin3();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin4();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin5(); // success test
		 * Keywords.closeBrowser();
		 */

		/*
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin6();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin7();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin8();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin9();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin10();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin11();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin12();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin13();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin14();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin15();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin16();
		 * Keywords.closeBrowser();
		 * 
		 * Keywords.openBrowser("Browser"); Keywords.enterUrl("Url");
		 * Keywords.sleep(); loginTestCase.adminLogin17();
		 */
	}

}
