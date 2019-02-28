package TestCases;

import Keywords.Keywords;

public class PharmacistTestCase {

	public static void pharmacistTestCase(){
		
		Keywords.browserLoad_EnterUrl_SelectLangEng();
		Keywords.adminLogin();

		Keywords.clickButton("pharmacist_HMS");
		Keywords.clickButton("add_pharmacist");
		Keywords.enterText("name", "pharma_name");
		Keywords.enterText("email", "pharma_email");
		Keywords.enterText("password", "pharma_password");
		Keywords.enterText("address", "pharma_address");
		Keywords.enterText("phone", "pharma_phone");
		Keywords.enterText("department", "pharma_phone");
		Keywords.enterText("profile", "pharma_profile");
        Keywords.clickButton("add_pharmacist_button");
        Keywords.sleep( );
		Keywords.clickButton("account");
		Keywords.clickButton("logout");

		Keywords.pharmacistLogin();
	}
}
