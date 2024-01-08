package com.neotech.steps;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentDBValidationSteps extends CommonMethods{

	@When("Admin clicks setting tab on the homepage")
	public void admin_clicks_setting_tab_on_the_homepage() {
		
	    for(WebElement tabs : homepage.homepageSubTabs) {
	    	
	    	if(tabs.getText().trim().contains("Settings")) {
	    		tabs.click();
	    		break;
	    	}
	    }
	    
	    wait(1);
	}
	
	@And("Admin clicks management sub tab and query analyzer link")
	public void admin_clicks_management_sub_tab() {
	    
		for(WebElement subTab : homepage.settingTabSubTabs) {
			
			if(subTab.getText().trim().contains("Management")) {
				subTab.click();
				break;
			}
		}
		
		wait(1);
		
		click(query.queryAnalyzerLink);
		wait(1);
		
		switchToWindow();
	}
	

	
	
	@Then("Admin validates by sending a query into text box, writing password and clicking execute button")
	public void admin_validates_by_sending_a_query_into_text_box_writing_password_and_clicking_execute_button() {
		
		String queryText = " * FROM Student WHERE UserName = 'FulinKulkara21' AND Id = '1155' ";
		
		sendText(query.queryBox, queryText);
		wait(1);
		
		sendText(query.queryPassword, "ABCD");
		wait(1);
		
		click(query.queryExecuteLink);
		wait(1);
		
		takeScreenShot("StudentDB");
	}

	
	
	
}
