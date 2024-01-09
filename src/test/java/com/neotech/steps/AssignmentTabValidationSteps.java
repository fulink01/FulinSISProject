package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentTabValidationSteps extends CommonMethods {

	@Given("Admin clicks Staff\\/Faculty tab on the main page")
	public void admin_clicks_staff_faculty_tab_on_the_main_page() {

		for (WebElement tabs : homepage.homepageSubTabs) {

			if (tabs.getText().trim().contains("Staff/Faculty")) {

				tabs.click();
				break;
			}

		}

		wait(1);

	}

	@When("Admin clicks Assignment sub tab")
	public void admin_clicks_assignment_sub_tab() {

		for (WebElement subTab : staff.staffSubTab) {

			if (subTab.getText().trim().contains("Assignments")) {
				subTab.click();
				break;

			}
		}

		wait(2);
	}

	@Then("Admin validates that reaching the assignment tab")
	public void admin_validates_that_reaching_the_assignment_tab() {
		
		takeScreenShot("AssigmentTabError");
		wait(1);
		
		Assert.assertTrue(!driver.getTitle().contains("Error"));
		
	}

}
