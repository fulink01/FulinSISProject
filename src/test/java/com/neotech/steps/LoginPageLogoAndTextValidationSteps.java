package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageLogoAndTextValidationSteps extends CommonMethods {

	@Then("validate the NeoTech Academy logo is visible")
	public void validate_the_neo_tech_academy_logo_is_visible() {
	   Assert.assertTrue("Logo is not displayed", login.logo.isDisplayed());
	    
	}
	@And("validate text is visible")
	public void validate_text_is_visible() {
	   Assert.assertTrue(login.text.getText().contains("Student Information System"));
	}
	@And("validate username box is visible")
	public void validate_username_box_is_visible() {
		 Assert.assertTrue(login.username.isDisplayed());
	}
	@And("validate password box is visible")
	public void validate_password_box_is_visible() {
	    Assert.assertTrue(login.password.isDisplayed());
	}
	@And("validate academic year dropdown is visible")
	public void validate_academic_year_dropdown_is_visible() {
	    Assert.assertTrue(login.academicYearDropdown.isDisplayed());
	}
	@And("validate login button is visible")
	public void validate_login_button_is_visible() {
	    Assert.assertTrue(login.login.isDisplayed());
	}
	
	

}
