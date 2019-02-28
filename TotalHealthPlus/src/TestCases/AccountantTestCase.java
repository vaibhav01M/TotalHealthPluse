package TestCases;

import Keywords.Keywords;

public class AccountantTestCase {

	public static void accountantTestCase(){
	Keywords.browserLoad_EnterUrl_SelectLangEng();
	Keywords.adminLogin();

	Keywords.clickButton("accountant_HMS");
	Keywords.clickButton("add_accountant");
	Keywords.enterText("name", "acc_name");
	Keywords.enterText("email", "acc_email");
	Keywords.enterText("password", "acc__password");
	Keywords.enterText("address", "acc_address");
	Keywords.enterText("phone", "acc_phone");
	Keywords.enterText("department", "acc_department");
	Keywords.enterText("profile", "acc_profile");
    Keywords.clickButton("add_doctor");
    Keywords.sleep( );
	Keywords.clickButton("account");
	Keywords.clickButton("logout");

	Keywords.accountantLogin();
	
	}	
	
}
