package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TeacherLoginValidationSteps extends CommonMethods{

	@Given("Teacher logged in succesfully with {string} and {string}")
	public void teacher_logged_in_succesfully_with_and(String userName, String password) {
	    
		sendText(login.username,userName);
		wait(1);
		
		sendText(login.password, password);
		wait(1);
		
		click(login.login);
		wait(1);
	}
	
	@Then("Teacher validates welcome message and personal informations with {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void teacher_validates_welcome_message_and_personal_informations_with_and(String message, String localId, String jobTitle, String birthday, String SSN, String phone, String schoolEmail, String personalEmail) {
	    
		String actualMessage = teacherLogin.welcomeMessage.getText();
		String expectedMessage = message;
		
		Assert.assertEquals(expectedMessage, actualMessage);
		wait(1);
		
		click(teacherLogin.showInformationButton);
		wait(1);
		
		List<String> teacherInformations = new ArrayList<>();
		
		for(WebElement information : teacherLogin.teacherInformations) {
			
			teacherInformations.add(information.getText().trim());
		}
		
		Assert.assertTrue(teacherInformations.contains(localId));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(jobTitle));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(birthday));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(SSN));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(phone));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(schoolEmail));
		wait(1);
		
		Assert.assertTrue(teacherInformations.contains(personalEmail));
		wait(1);
		
		takeScreenShot("TeacherLoginPage");
	}

}
