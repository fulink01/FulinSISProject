package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

	@FindBy(xpath = "//table[@id='topLogo']")
	public WebElement logo;
	
	@FindBy(xpath = "//table[@id='topLogo']/following-sibling::table/tbody/tr/td/table/tbody/tr/td/center")
	public WebElement text;
	
	
}
