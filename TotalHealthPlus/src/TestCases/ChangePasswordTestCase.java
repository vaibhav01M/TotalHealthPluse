package TestCases;

import Keywords.Keywords;

public class ChangePasswordTestCase {

	public static void changePasswordTestcase(){
		// after login account
		
		Keywords.clickButton("manage_profile");
		Keywords.enterText("profile_password", "Dr_profile_password");
		Keywords.enterText("profile_new_password", "Dr_profile_new_password");
		Keywords.enterText("profile_confirm_new_password", "Dr_profile_confirm_new_password");
		Keywords.clickButton("profile_update_password");
	
	}
	
	
	
	
	
	
	
	
}
