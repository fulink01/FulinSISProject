package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

	@FindBy(xpath = "//table[@id='topLogo']")
	public WebElement logo;
	
	@FindBy(xpath = "//table[@id='topLogo']/following-sibling::table/tbody/tr/td/table/tbody/tr/td/center")
	public WebElement text;
	
	@FindBy(id = "tUsername")
	public WebElement username;
	
	@FindBy(id = "tPassword" )
	public WebElement password;
	
	@FindBy(id = "dAcademicYear_list")
	public List<WebElement> academicYear;
	
	@FindBy(id = "bLogin")
	public WebElement login;
	
	
}
