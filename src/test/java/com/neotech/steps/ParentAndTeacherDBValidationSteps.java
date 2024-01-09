package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ParentAndTeacherDBValidationSteps extends CommonMethods {

	@Then("Admin validates parent table by sending a query into text box, writing password and clicking execute button")
	public void admin_validates_parent_table_by_sending_a_query_into_text_box_writing_password_and_clicking_execute_button() {

		String parentQuery = " * FROM Parent WHERE UserName='SenKulkara' AND Id= '1290' ";
		
		sendText(query.queryBox, parentQuery);
		wait(1);
		sendText(query.queryPassword,"ABCD");
		wait(1);
		click(query.queryExecuteLink);
		wait(1);
		
		takeScreenShot("ParentDB");
		wait(1);
	}

	@And("Admin validates teacher table by sending a query into text box, writing password and clicking execute button")
	public void admin_validates_teacher_table_by_sending_a_query_into_text_box_writing_password_and_clicking_execute_button() {
		
		String teacherQuery = "* FROM Staff WHERE UserName = 'ElWhite' AND Id = '1258'";
		
		query.queryBox.clear();
		wait(1);
		
		sendText(query.queryBox,teacherQuery);
		wait(1);
		sendText(query.queryPassword,"ABCD");
		wait(1);
		click(query.queryExecuteLink);
		wait(1);
		
		takeScreenShot("TeacherDB");
		
	}

}
