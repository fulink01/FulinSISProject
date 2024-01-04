package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class HomePageElements extends CommonMethods {

	@FindBy(xpath = "//table[@class='blockMid']/tbody/tr/td[1]/span")
	public WebElement announcementSection;
	
	@FindBy(xpath = "//img[@id='Header1_imgSchoolLogo']")
	public WebElement hpLogo;
	
	@FindBy(xpath = "//*[@id='form1']/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[@background='../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> homepageSubTabs;
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
}
