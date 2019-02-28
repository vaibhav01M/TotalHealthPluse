package TestCases;

import Keywords.Keywords;

public class LaboratoristeoTestCase {

	public static void laboratoristeoTestCase(){
		
		Keywords.browserLoad_EnterUrl_SelectLangEng();
		Keywords.adminLogin();

		Keywords.clickButton("laboratorist,eo_HMS");
		Keywords.clickButton("add_laboratorist,eo");
		Keywords.enterText("name", "lab_name");
		Keywords.enterText("email", "lab_email");
		Keywords.enterText("password", "lab_password");
		Keywords.enterText("address", "lab_address");
		Keywords.enterText("phone", "lab_phone");
		Keywords.enterText("department", "lab_department");
		Keywords.enterText("profile", "lab_profile");
        Keywords.clickButton("add_laboratorist,eo_button");
        Keywords.sleep( );
		Keywords.clickButton("account");
		Keywords.clickButton("logout");

		Keywords.laboratoristeoLogin();
	}
}
