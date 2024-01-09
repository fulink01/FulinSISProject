package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTeacherValidationSteps extends CommonMethods {

	@When("Admin clicks Staff\\/Faculty tab and add new button on the staff page")
	public void admin_clicks_staff_faculty_tab_and_add_new_button_on_the_staff_page() {
	    
		for(WebElement subTab : homepage.homepageSubTabs) {
			
			if(subTab.getText().trim().contains("Staff/Faculty")) {
				subTab.click();
				break;
			}
		}
		
		wait(1);
		
		click(staff.addStaff);
		wait(1);
	}
	
	@When("Admin enters teacher {string}, {string},{string},{string}, {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void admin_enters_teacher_and(String stateId, String lastName, String firstName, String birthday, String SSN, String license, String password, String jobtitle, String address, String city, String zipcode, String phone, String schoolEmail, String personalEmail) {
	    
		sendText(staff.staffStateId, stateId);
		wait(2);
		sendText(staff.staffLastName, lastName);
		wait(2);
		sendText(staff.staffFirstName, firstName);
		wait(2);
		
		
		sendText(staff.staffBirthday, birthday);
		wait(2);
		
		click(staff.staffZip);
		wait(2);
		
		
		sendText(staff.staffSSN, SSN);
		wait(2);
		
		click(staff.staffZip);
		wait(2);
		
		sendText(staff.staffLicense, license);
		wait(1);
		sendText(staff.staffPassword,password);
		wait(1);
		sendText(staff.staffJobTitle, jobtitle);
		wait(1);
		sendText(staff.staffAddress,address);
		wait(1);
		sendText(staff.staffCity, city);
		wait(1);
		sendText(staff.staffZip,zipcode);
		wait(1);
		sendText(staff.staffPhone,phone);
		wait(1);
		sendText(staff.staffSchoolEmail,schoolEmail);
		wait(1);
		sendText(staff.staffPersonalEmail,personalEmail);
		wait(1);
		
		
	}
	
	@When("Admin selects teacher {string},{string}, {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void admin_selects_teacher_and(String jobPosition, String title, String gender, String ethnic, String race, String department, String advisor, String homeroom, String classroom, String state) {
	    
		selectDropdown(staff.jobPosition,jobPosition);
		wait(1);
		selectDropdown(staff.staffTitle, title);
		wait(1);
		selectDropdown(staff.staffGender,gender);
		wait(1);
		selectDropdown(staff.staffEthnicity,ethnic);
		wait(1);
		
		click(staff.staffRaceList);
		click(staff.staffWhiteRace);
		wait(1);
		
		selectDropdown(staff.staffDepartment,department);
		wait(1);
		selectDropdown(staff.staffAdvisorOf,advisor);
		wait(1);
		selectDropdown(staff.staffHomeroom,homeroom);
		wait(1);
		selectDropdown(staff.staffClassroom,classroom);
		wait(1);
		selectDropdown(staff.staffState,state);
		wait(1);
	}
	
	@When("Admin clicks submit button and upload photo of teacher")
	public void admin_clicks_submit_button_and_upload_photo_of_teacher() {
	    
		click(staff.submitButton);
		wait(2);
		
		click(staff.addPhotoLink);
		wait(1);
		
		switchToWindow();
		driver.manage().window().maximize();
		
		String photo = System.getProperty("user.dir") + "/photo/teacher.jpg";
		
		sendText(staff.choosePhoto, photo);
		wait(1);
		
		click(staff.uploadPhoto);
		wait(1);
		
		Assert.assertTrue(getAlertText().equals("File Successfully Uploaded"));
		wait(1);
		acceptAlert();
		wait(1);
		
		switchToWindow();
		wait(1);
	}
	
	@Then("Admin validates the teacher added")
	public void admin_validates_the_teacher_added() {
	    
		Assert.assertNotNull(staff.staffUserName.getText());
		wait(1);
		
		takeScreenShot("TeacherUserName");
		
	}

}
