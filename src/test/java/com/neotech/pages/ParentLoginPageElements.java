package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ParentLoginPageElements extends CommonMethods{

	@FindBy(xpath = "//table[@id = 'Header1_tableHeader']//following-sibling::table//following-sibling::td[@background = '../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> parentLoginTabs;
	
	@FindBy(xpath = "//*[@id='form1']/table[3]/tbody/tr/td[2]/table/tbody/tr/td[@style='width: 258px; height: 20px']")
	public List<WebElement> validateParentInformations;
	
	@FindBy(xpath = "//*[@id='GridStudents']/tbody/tr[2]/td/table/tbody/tr/td[@style='width: 140px; height: 20px']")
	public List<WebElement> validateStudentInformations;
	
	public ParentLoginPageElements() {
		PageFactory.initElements(driver, this);
	}
}
