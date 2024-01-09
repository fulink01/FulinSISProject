package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ParentLoginValidationSteps extends CommonMethods {

	@Given("Primary\\/Secondary parent logged in successfully with {string} and {string}")
	public void primary_secondary_parent_logged_in_successfully_with_and(String userName, String password) {

		sendText(login.username, userName);
		wait(1);

		sendText(login.password, password);
		wait(1);

		click(login.login);
		wait(1);
	}

	@Then("Primary\\/Secondary parent validates all sub tabs are visible")
	public void primary_secondary_parent_validates_all_sub_tabs_are_visible(io.cucumber.datatable.DataTable dataTable) {

		List<String> expected = dataTable.asList();

		List<String> actual = new ArrayList<>();

		for (WebElement subTabs : parentLogin.parentLoginTabs) {

			actual.add(subTabs.getText().trim());
		}

		wait(1);

		Assert.assertEquals(expected, actual);

	}

	@And("Primary\\/Secondary parent validates {string}, {string},{string},{string},{string},{string} and {string}")
	public void primary_secondary_parent_validates_and(String fullName, String address, String phone, String email,
			String studentId, String studentName, String gradeLevel) {

		List<String> parentInformation = new ArrayList<>();

		for (WebElement informations : parentLogin.validateParentInformations) {

			parentInformation.add(informations.getText().trim());
		}

		Assert.assertTrue(parentInformation.contains(fullName));
		wait(1);

		Assert.assertTrue(parentInformation.contains(address));
		wait(1);

		Assert.assertTrue(parentInformation.contains(phone));
		wait(1);

		Assert.assertTrue(parentInformation.contains(email));
		wait(1);
		

		List<String> studentInformation = new ArrayList<>();

		for (WebElement informations : parentLogin.validateStudentInformations) {

			studentInformation.add(informations.getText().trim());
		}

		Assert.assertTrue(studentInformation.contains(studentId));
		wait(1);

		Assert.assertTrue(studentInformation.contains(studentName));
		wait(1);

		Assert.assertTrue(studentInformation.contains(gradeLevel));
		wait(1);

		takeScreenShot("ParentLoginPage");

	}

}
