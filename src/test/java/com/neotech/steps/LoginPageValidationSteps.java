package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageValidationSteps extends CommonMethods {

	@When("enter valid username")
	public void enter_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		
	}
	
	@When("enter valid password")
	public void enter_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}
	
	@When("select valid academic year")
	public void select_valid_academic_year() {
	    click(login.academicYearDropdown);
	    selectDropdown(login.academicYearDropdown, "2020-2021");
	}
	
	@When("click login button")
	public void click_login_button() {
	    click(login.login);
	    wait(3);
	}
	
	@Then("verify succesfully login")
	public void verify_succesfully_login() {
	   
		Assert.assertTrue(homepage.hpLogo.isDisplayed());
		Assert.assertTrue(homepage.announcementSection.getText().contains("Announcements"));
		Assert.assertTrue(driver.getCurrentUrl().contains("MainPage.aspx"));
		
	}
	
	@When("leave empty password box")
	public void leave_empty_password_box() {
		sendText(login.password, ConfigsReader.getProperty(""));
	    wait(2);
	}
	
	@Then("verify password box can not empty")
	public void verify_password_box_can_not_empty() {
	    
		Assert.assertTrue(getAlertText().equals("Please fill required fields"));
		wait(3);
		acceptAlert();
	}
	
	@When("enter invalid username")
	public void enter_invalid_username() {
	    
		sendText(login.username, ConfigsReader.getProperty("Admin1"));
	}
	
	@Then("verify that username does not match")
	public void verify_that_username_does_not_match() {
	   
		Assert.assertTrue(getAlertText().equals("Either username and password do not match or your account doesn't have  access for the selected Academic Year."));
		wait(3);
		acceptAlert();
	}
	
	
}
