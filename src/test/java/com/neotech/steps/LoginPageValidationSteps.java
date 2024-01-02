package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageValidationSteps extends CommonMethods {

	@Then("validate the NeoTech Academy logo is visible")
	public void validate_the_neo_tech_academy_logo_is_visible() {
	   Assert.assertTrue("Logo is not displayed", login.logo.isDisplayed());
	    
	}
	@And("validate text is visible")
	public void validate_text_is_visible() {
	   Assert.assertTrue("The text does not contains Student Information System",login.text.getText().contains("Student Information System"));
	}
	@And("validate username box is visible")
	public void validate_username_box_is_visible() {
		 Assert.assertTrue("Username box is not visible", login.username.isDisplayed());
	}
	@And("validate password box is visible")
	public void validate_password_box_is_visible() {
	    Assert.assertTrue("Password box is not visible", login.password.isDisplayed());
	}
	@And("validate academic year dropdown is visible")
	public void validate_academic_year_dropdown_is_visible() {
	    Assert.assertTrue("Academic year dropdown is not visible", login.academicYearDropdown.isDisplayed());
	}
	@And("validate login button is visible")
	public void validate_login_button_is_visible() {
	    Assert.assertTrue("Login button is not visible", login.login.isDisplayed());
	}
	
	

}
