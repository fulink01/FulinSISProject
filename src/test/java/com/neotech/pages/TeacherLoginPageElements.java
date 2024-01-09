package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class TeacherLoginPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='form1']/table[2]/tbody/tr[2]/td")
	public WebElement welcomeMessage;
	
	@FindBy(id = "linkShow")
	public WebElement showInformationButton;
	
	@FindBy(xpath = "//*[@id='tablePersonalInfoShow']/tbody/tr/td[2]")
	public List<WebElement> teacherInformations;
	
	public TeacherLoginPageElements() {
		PageFactory.initElements(driver, this);
	}
}
