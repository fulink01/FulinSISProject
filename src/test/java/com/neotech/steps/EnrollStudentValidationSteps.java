package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnrollStudentValidationSteps extends CommonMethods {

	@When("Admin searches new student in the list and click on it")
	public void admin_searches_new_student_in_the_list_and_click_on_it() {

		selectDropdown(studentPage.sStatusList, "New");
		wait(1);

		selectDropdown(studentPage.sStudentList, "Kulkara Fulin");
		wait(1);

	}

	@And("Admin clicks enroll link and changes the student status to enroll")
	public void admin_clicks_enroll_link_and_changes_the_student_status_to_enroll() {

		click(studentPage.sStatusChangeLink);
		wait(1);

		click(studentPage.sEnrollButton);
		wait(2);

		click(studentPage.sSubmitButton);
		wait(2);

		acceptAlert();
		wait(1);
	}

	@Then("Admin validates that the status change and finds the student in the enrollement sub tab")
	public void admin_validates_that_the_status_change_and_finds_the_student_in_the_enrollement_sub_tab() {

		Assert.assertTrue(studentPage.sStatus.getText().equals("Enrolled"));
		wait(2);

		selectDropdown(studentPage.sGradeList, "All Classes");
		wait(2);

		selectDropdown(studentPage.sStatusList, "Enrolled");
		wait(2);

		List<String> list = new ArrayList();
		
//		for(WebElement student : studentPage.sStudentListTable) {		
//			list.add(student.getText());
//		}

		studentPage.sStudentListTable.stream().forEach(s -> list.add(s.getText()));

		Assert.assertTrue(list.contains("Kulkara Fulin"));
		

		for (WebElement subTab : studentPage.studentsSubTabs) {

			if (subTab.getText().trim().equals("Enrollment")) {
				click(subTab);
				break;
			}
		}

		wait(1);

		List<String> studentList = new ArrayList<>();

		for (WebElement student : studentPage.sStudentListTable) {

			studentList.add(student.getText());
		}

		Assert.assertTrue(studentList.contains("Kulkara Fulin"));
	}
}
