package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='form1']/script[12]/following-sibling::table//td[@background='../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> studentsSubTabs;

	public StudentPageElements() {
		PageFactory.initElements(driver, this);
	}
}
