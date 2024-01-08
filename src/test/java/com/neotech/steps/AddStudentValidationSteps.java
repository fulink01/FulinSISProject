package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStudentValidationSteps extends CommonMethods {

	@When("Admin clicks add new button")
	public void admin_clicks_add_new_button() {

		click(studentPage.sAddNewButton);
		wait(1);
	}

	@And("Admin enters student {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void admin_enters_student_and(String stateid, String lastname, String firstname, String SSN, String email,
			String birthday, String password, String businfo) {

		sendText(studentPage.sStateId, stateid);
		sendText(studentPage.sLastName, lastname);
		sendText(studentPage.sFirstName, firstname);
		sendText(studentPage.sSSN, SSN);
		sendText(studentPage.sEmail, email);
		sendText(studentPage.sBirthday, birthday);
		sendText(studentPage.sPassword, password);
		sendText(studentPage.sBusInfo, businfo);
		wait(2);

	}
	
	@And("Admin selects {string}, {string}, {string} and {string}")
	public void admin_selects_and(String gender, String lunch, String ethnic, String grade) {
	    
		selectDropdown(studentPage.sGenderList, gender);
		wait(2);

		
		selectDropdown(studentPage.sLunchType, lunch);
		wait(2);

		
		selectDropdown(studentPage.sEthnicity, ethnic);
		wait(2);
		
		click(studentPage.sRaceList);
		click(studentPage.sWhiteRace);
		wait(2);

		
		selectDropdown(studentPage.sGradeLevel, grade);
		wait(2);
	}

	@Then("Admin click Submit Changes button and validates that new student successfully added")
	public void admin_validates_that_new_student_successfully_added() {


		click(studentPage.sSubmitButton);
		wait(2);
		
		String expected = "Successfully Added";
		String actual = getAlertText().trim();
		
		Assert.assertEquals(expected, actual);
		acceptAlert();
		
		wait(2);
		
		takeScreenShot("StudentUsername");
	
	}
	
	@And("Admin adds picture of student")
	public void admins_adds_picture_of_student() {

		click(studentPage.sAddPhotoLink);
		wait(1);

		switchToWindow();
		driver.manage().window().maximize();
		wait(2);

		String photo = System.getProperty("user.dir") + "/photo/student.jpg";

		sendText(studentPage.sChoosePhoto, photo);
		wait(2);
		click(studentPage.sUploadPhoto);

		Assert.assertTrue(getAlertText().equals("File Successfully Uploaded"));
		wait(3);
		acceptAlert();
		wait(1);
		
		switchToWindow();

	}

	

}
