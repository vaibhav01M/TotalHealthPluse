package TestCases;

import Keywords.Keywords;

public class NurseTestCase {

	public static void nurseTestCase(){
		Keywords.browserLoad_EnterUrl_SelectLangEng();
		Keywords.adminLogin();

		Keywords.clickButton("nurse_HMS");
		Keywords.clickButton("add_nurse");
		Keywords.enterText("name", "nurse_name");
		Keywords.enterText("email", "nurse_email");
		Keywords.enterText("password", "nurse_password");
		Keywords.enterText("address", "nurse_address");
		Keywords.enterText("phone", "nurse_phone");
		Keywords.enterText("department", "nurse_department");
		Keywords.enterText("profile", "nurse_profile");
        Keywords.clickButton("add_nurse_button");
        Keywords.sleep( );
		Keywords.clickButton("account");
		Keywords.clickButton("logout");

		Keywords.nurseLogin();
	}
}
