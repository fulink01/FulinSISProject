package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(xpath = "//table[@id='topLogo']")
	public WebElement logo;
	
	@FindBy(xpath = "//table[@id='topLogo']/following-sibling::table/tbody/tr/td/table/tbody/tr/td/center")
	public WebElement text;
	
	@FindBy(id = "tUsername")
	public WebElement username;
	
	@FindBy(id = "tPassword" )
	public WebElement password;
	
	@FindBy(id = "dAcademicYear_list")
	public WebElement academicYearDropdown;
	
	@FindBy(id = "bLogin")
	public WebElement login;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
}
