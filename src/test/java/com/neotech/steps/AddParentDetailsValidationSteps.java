package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddParentDetailsValidationSteps extends CommonMethods {

	@And("Admin finds the student on the list")
	public void admin_finds_the_student_on_the_list() {

		selectDropdown(studentPage.sStudentList, "Kulkara Fulin");
		wait(1);
	}

	@When("Admin clicks Parental sub tab and Admin clicks Add New button for primary parent")
	public void admin_clicks_parental_sub_tab_and_admin_clicks_add_new_button_for_primary_parent() {

		for (WebElement subTab : studentPage.studentsSubTabs) {

			if (subTab.getText().trim().contains("Parental")) {
				subTab.click();
				break;
			}
		}

		wait(1);

		click(parents.addPrimaryParent);
		wait(1);

	}

	@And("Admin enters primary parents {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void admin_enters_primary_parents_and(String ppFirstname, String ppLastname, String ppPassword,
			String ppAddress, String ppCity, String ppZipcode, String ppCellphone, String ppEmail) {

		sendText(parents.ppFirstName, ppFirstname);
		wait(1);
		sendText(parents.ppLastName, ppLastname);
		wait(1);
		sendText(parents.ppPassword, ppPassword);
		wait(1);
		sendText(parents.ppAddress, ppAddress);
		wait(1);
		sendText(parents.ppCity, ppCity);
		wait(1);
		sendText(parents.ppZipCode, ppZipcode);
		wait(1);
		sendText(parents.ppCellPhone, ppCellphone);
		wait(1);
		sendText(parents.ppEmail, ppEmail);
		wait(1);
	}

	@And("Admin selects primary parent {string}, {string} and {string}")
	public void admin_selects_primary_parent_and(String ppTitle, String ppRelation, String ppState) {

		selectDropdown(parents.ppTitleList, ppTitle);
		wait(1);
		selectDropdown(parents.ppRelationList, ppRelation);
		wait(1);
		selectDropdown(parents.ppStateList, ppState);
		wait(1);

		click(parents.ppSaveButton);
		wait(1);
	}

	@Then("Admin validates primary parent added")
	public void admin_validates_primary_parent_added() {

		takeScreenShot("PrimaryParentUserName");
		wait(1);

		Assert.assertNotNull(parents.ppUsername.getText());
		wait(1);
	}

	@When("Admin clicks Parental sub tab and Admin clicks Add New button for secondary parent")
	public void admin_clicks_parental_sub_tab_and_admin_clicks_add_new_button_for_secondary_parent() {

		for (WebElement subTab : studentPage.studentsSubTabs) {

			if (subTab.getText().trim().contains("Parental")) {
				subTab.click();
				break;
			}
		}

		wait(1);

		click(parents.addSecondaryParent);
		wait(1);

	}

	@And("Admin enters secondary parent {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void admin_enters_secondary_parent_and(String spFirstname, String spLastname, String spPassword,
			String spAddress, String spCity, String spZipcode, String spCellphone, String spEmail) {

		sendText(parents.spFirstName, spFirstname);
		wait(1);
		sendText(parents.spLastName, spLastname);
		wait(1);
		sendText(parents.spPassword, spPassword);
		wait(1);
		sendText(parents.spAddress, spAddress);
		wait(1);
		sendText(parents.spCity, spCity);
		wait(1);
		sendText(parents.spZipCode, spZipcode);
		wait(1);
		sendText(parents.spCellPhone, spCellphone);
		wait(1);
		sendText(parents.spEmail, spEmail);
		wait(1);

	}

	@And("Admin selects secondary parent {string}, {string} and {string}")
	public void admin_selects_secondary_parent_and(String spTitle, String spRelation, String spState) {

		selectDropdown(parents.spTitleList, spTitle);
		wait(1);
		selectDropdown(parents.spRelationList, spRelation);
		wait(1);
		selectDropdown(parents.spStateList, spState);
		wait(1);

		click(parents.spSaveButton);
		wait(1);
	}

	@Then("Admin validates secondary parent added")
	public void admin_validates_secondary_parent_added() {

		takeScreenShot("SecondaryParentUserName");
		wait(1);

		Assert.assertNotNull(parents.spUsername.getText());
		wait(1);
	}

}
