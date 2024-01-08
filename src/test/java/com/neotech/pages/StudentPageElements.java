package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='form1']/script[12]/following-sibling::table//td[@background='../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> studentsSubTabs;
	
	@FindBy(id = "bAdd")
	public WebElement sAddNewButton;
	
	@FindBy(id = "tLocalId")
	public WebElement sLocalId;
	
	@FindBy(id = "tStateId")
	public WebElement sStateId;
	
	@FindBy(id = "tLastName")
	public WebElement sLastName;
	
	@FindBy(id = "tFirstName")
	public WebElement sFirstName;
	
	@FindBy(id = "tMiddleName")
	public WebElement sMiddleName;
	
	@FindBy(id = "tSuffix")
	public WebElement sSuffix;
	
	@FindBy(id = "tSSN")
	public WebElement sSSN;
	
	@FindBy(id = "tEmail")
	public WebElement sEmail;
	
	@FindBy(id = "tBirthDay")
	public WebElement sBirthday;
	
	@FindBy(id = "gender_list")
	public WebElement sGenderList;
	
	@FindBy(id = "lunchType")
	public WebElement sLunchType;
	
	@FindBy(id = "ddEthnicity_list")
	public WebElement sEthnicity;
	
	@FindBy(id = "ddRaceNew")
	public WebElement sRace;
	
	@FindBy(xpath = "//button[@data-id='ddRaceNew']")
	public WebElement sRaceList; 
	
	@FindBy(xpath = "//table[@class = 'textSmall blockSmall']/tbody/tr[14]/td[3]/div/div/ul/li[5]")
	public WebElement sWhiteRace;
	
	@FindBy(id = "cGradeLevel_list")
	public WebElement sGradeLevel;
	
	@FindBy(id = "tUsername")
	public WebElement sUsername;
	
	@FindBy(id = "tPassword")
	public WebElement sPassword;
	
	@FindBy(id = "tBusInfo")
	public WebElement sBusInfo;
	
	@FindBy(id = "bSubmit")
	public WebElement sSubmitButton;
	
	@FindBy(id = "photoChange")
	public WebElement sAddPhotoLink;
	
	@FindBy(id = "fileUpload")
	public WebElement sChoosePhoto;
	
	@FindBy(id = "bSubmit")
	public WebElement sUploadPhoto;
	
	@FindBy(id = "gradeSections_list")
	public WebElement sGradeList;
	
	@FindBy(id = "studentStatus_list")
	public WebElement sStatusList;
	
	@FindBy(id = "students_students")
	public WebElement sStudentList;
	
	@FindBy(xpath = "//*[@id='form1']/table[3]/tbody/tr/td[2]/table/tbody/tr[5]/td/table/tbody/tr[2]/td/select/option")
	public List<WebElement> sStudentListTable;
	
	@FindBy(id = "bStatusChange")
	public WebElement sStatusChangeLink;
	
	@FindBy(id = "bEnroll")
	public WebElement sEnrollButton;
	
	@FindBy(id = "lStatus")
	public WebElement sStatus;
	
	
	
	
	public StudentPageElements() {
		PageFactory.initElements(driver, this);
	}
}
