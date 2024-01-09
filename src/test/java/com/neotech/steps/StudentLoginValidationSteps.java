package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
;

public class StudentLoginValidationSteps extends CommonMethods {

	@Given("Student logins with {string} and {string}")
	public void student_logins_with_and(String sUsername, String sPassword) {
	    
		sendText(login.username,sUsername);
		sendText(login.password, sPassword);
		click(login.login);
		wait(2);
		
		
		
	}
	
	@Then("Student validates {string}, {string}, {string}, and {string}")
	public void student_validates_and(String sUsername, String studentName,  String studentId ,String studentGrade) {
	    
		String actualUsername = studentLogin.studentUsername.getText();
		String expectedUserName = sUsername;
		
		Assert.assertEquals(expectedUserName, actualUsername);
		wait(1);
		
		String actualName = studentLogin.studentName.getText();
		String expectedName = studentName;
		
		Assert.assertEquals(expectedName, actualName);
		wait(1);
		
		
		String actualId = studentLogin.studentId.getText();
		String expectedId = studentId;
		
		Assert.assertEquals(expectedId, actualId);
		wait(1);
		
		
		String actualGrade = studentLogin.studentGrade.getText();
		String expectedGrade = studentGrade;
		
		Assert.assertEquals(expectedGrade, actualGrade);
		wait(1);
		
		takeScreenShot("StudentLogin");
		
	}


}
