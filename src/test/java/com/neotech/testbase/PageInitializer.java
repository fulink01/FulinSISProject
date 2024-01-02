package com.neotech.testbase;

import com.neotech.pages.HomePageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.ParentLoginPageElements;
import com.neotech.pages.ParentSubTabPageElements;
import com.neotech.pages.StaffPageElements;
import com.neotech.pages.StudentLoginPageElements;
import com.neotech.pages.StudentPageElements;
import com.neotech.pages.TeacherLoginPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static HomePageElements homepage;
	public static StudentPageElements studentPage;
	public static StaffPageElements staff;
	public static ParentSubTabPageElements parents;
	public static StudentLoginPageElements studentLogin;
	public static TeacherLoginPageElements teacherLogin;
	public static ParentLoginPageElements parentLogin;

	public static void initialize() {

		login = new LoginPageElements();
		homepage = new HomePageElements();
		studentPage = new StudentPageElements();
		staff = new StaffPageElements();
		parents = new ParentSubTabPageElements();
		studentLogin = new StudentLoginPageElements();
		teacherLogin = new TeacherLoginPageElements();
		parentLogin = new ParentLoginPageElements();
	}

}
