package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentsPageValidationSteps extends CommonMethods {

	@Given("Admin logged in succesfully")
	public void admin_loged_in_succesfully() {

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.login);
		wait(1);

	}

	@When("Admin clicks Student tab")
	public void admin_clicks_student_tab() {

		for(WebElement subTab : homepage.homepageSubTabs) {
			if(subTab.getText().trim().equals("Students")) {
				click(subTab);
				break;
			}
		}
		
	}

	@Then("Admin validates the all sub tabs are visible on the students page")
	public void admin_validates_the_all_sub_tabs_are_visible(DataTable dataTable) {

		List<String> expected = dataTable.asList();
		
		List<String> actual = new ArrayList<>();
		
		for(WebElement subTabs : studentPage.studentsSubTabs) {
			
			actual.add(subTabs.getText().trim());
		}
		
		wait(1);
		
		Assert.assertEquals(expected, actual);
		
		
		
	}

}
