package TestCases;

import Keywords.Keywords;

public class DoctorTestCase {

	public static void doctorTestCase() {
		Keywords.browserLoad_EnterUrl_SelectLangEng();
		Keywords.adminLogin();

		Keywords.clickButton("doctor_HMS");
		Keywords.clickButton("add_doctor");
		Keywords.enterText("name", "Dr_name");
		Keywords.enterText("email", "Dr_email");
		Keywords.enterText("password", "Dr_password");
		Keywords.enterText("address", "Dr_address");
		Keywords.enterText("phone", "Dr_phone");
		Keywords.enterText("department", "Dr_department");
		Keywords.enterText("profile", "Dr_profile");
        Keywords.clickButton("add_doctor");
        Keywords.sleep( );
		Keywords.clickButton("account");
		Keywords.clickButton("logout");
		Keywords.closeBrowser();
		
		
		Keywords.browserLoad_EnterUrl_SelectLangEng();
		Keywords.doctorLogin();

	}

}
