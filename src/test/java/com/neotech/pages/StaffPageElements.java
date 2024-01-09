package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StaffPageElements extends CommonMethods{

	@FindBy(xpath = "//table[@id = 'Header1_tableHeader']//following-sibling::table[2]/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[@background= '../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> staffSubTab;
	
	@FindBy(id = "bAdd")
	public WebElement addStaff;
	
	@FindBy(id = "jPosAccLev")
	public WebElement jobPosition;
	
	@FindBy(id = "tStaffStateId")
	public WebElement staffStateId;
	
	@FindBy(id = "myTitle_list")
	public WebElement staffTitle;
	
	@FindBy(id = "tLastName")
	public WebElement staffLastName;
	
	@FindBy(id = "tFirstName")
	public WebElement staffFirstName;
	
	@FindBy(xpath = "//*[@id='tDateofBirth']")
	public WebElement staffBirthday;
	
	@FindBy(xpath = "//*[@id='tSSN']")
	public WebElement staffSSN;
	
	@FindBy(id = "dGender_list")
	public WebElement staffGender;
	
	@FindBy(id = "tPassword")
	public WebElement staffPassword;
	
	@FindBy(id = "tLicenseCertificationNo")
	public WebElement staffLicense;
	
	@FindBy(id = "tUsername")
	public WebElement staffUserName;
	
	@FindBy(id = "ddEthnicity_list")
	public WebElement staffEthnicity;
	
	@FindBy(xpath = "//button[@data-id='ddRaceNew']")
	public WebElement staffRaceList; 
	
	@FindBy(xpath = "//table[@class = 'default']/tbody/tr[18]/td[2]/div/div/ul/li[5]/a/span")
	public WebElement staffWhiteRace;
	
	@FindBy(id = "tJTitle")
	public WebElement staffJobTitle;
	
	@FindBy(id = "dDepartment_list")
	public WebElement staffDepartment;
	
	@FindBy(id = "dAdvisory")
	public WebElement staffAdvisorOf;
	
	@FindBy(id = "dHomeroom")
	public WebElement staffHomeroom;
	
	@FindBy(id = "dClassroom_list")
	public WebElement staffClassroom;
	
	@FindBy(id = "tAddress")
	public WebElement staffAddress;
	
	@FindBy(id = "tCity")
	public WebElement staffCity;
	
	@FindBy(id = "state_list")
	public WebElement staffState;
	
	@FindBy(id = "tZip")
	public WebElement staffZip;
	
	@FindBy(id = "tCellPhone")
	public WebElement staffPhone;
	
	@FindBy(id = "tSchoolEmail")
	public WebElement staffSchoolEmail;
	
	@FindBy(id = "tPersonalEmail")
	public WebElement staffPersonalEmail;
	
	@FindBy(id = "bSubmit")
	public WebElement submitButton;
	
	@FindBy(id = "photoChange")
	public WebElement addPhotoLink;
	
	@FindBy(id = "fileUpload")
	public WebElement choosePhoto;
	
	@FindBy(id = "bSubmit")
	public WebElement uploadPhoto;
	
	public StaffPageElements() {
		PageFactory.initElements(driver, this);
	}
}
