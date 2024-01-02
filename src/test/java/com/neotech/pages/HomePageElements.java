package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class HomePageElements extends CommonMethods {

	@FindBy(xpath = "//table[@class='blockMid']/tbody/tr/td[1]/span")
	public WebElement announcementSection;
	
	@FindBy(xpath="//img[@id='Header1_imgSchoolLogo']")
	public WebElement hpLogo;
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
}
