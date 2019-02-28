package TestCases;

import Keywords.Keywords;

public class ManageProfileTestCase {

	public static void drChangePasswordTestcase(){
		// after login account
		
		Keywords.clickButton("manage_profile");
		Keywords.enterText("profile_name", "Dr_profile_password");
		Keywords.enterText("profile_email", "Dr_profile_new_password");
		Keywords.enterText("profile_phone", "Dr_profile_confirm_new_password");
		Keywords.enterText("profile_address", "Dr_profile_address");
		Keywords.clickButton("profile_update_profile_button");
	
	}
}
