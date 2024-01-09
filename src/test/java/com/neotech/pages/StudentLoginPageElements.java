package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentLoginPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='lStudentID']")
	public WebElement studentId;
	
	@FindBy(xpath = "//*[@id='lStdName']")
	public WebElement studentName;
	
	@FindBy(xpath = "//*[@id='lGrdSec']")
	public WebElement studentGrade;
	
	@FindBy(xpath = "//*[@id='lUserName']")
	public WebElement studentUsername;
	
	public StudentLoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}
