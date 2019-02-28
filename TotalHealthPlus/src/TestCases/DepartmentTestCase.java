package TestCases;

import Keywords.Keywords;

public class DepartmentTestCase {

	public static void departmentTestCase() {

		Keywords.browserLoad_EnterUrl_SelectLangEng(); 
		Keywords.adminLogin();
		
		Keywords.clickButton("department_HMS");
		Keywords.clickButton("add_department");
		Keywords.enterText("department_name", "department_name");
		Keywords.enterText("department_description", "department_name");
		Keywords.clickButton("add_department_button");
		
		Keywords.clickButton("account");
		Keywords.clickButton("logout");

	}

}
