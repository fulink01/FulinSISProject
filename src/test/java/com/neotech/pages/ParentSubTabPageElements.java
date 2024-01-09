package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ParentSubTabPageElements extends CommonMethods{

	@FindBy(id = "bAddNew")
	public WebElement addPrimaryParent;
	
	@FindBy(id = "ppTitle_list")
	public WebElement ppTitleList;
	
	@FindBy(id = "ppFirstName")
	public WebElement ppFirstName;
	
	@FindBy(id = "ppLastName")
	public WebElement ppLastName;
	
	@FindBy(id = "ppUsername")
	public WebElement ppUsername;
	
	@FindBy(id = "ppPassword")
	public WebElement ppPassword;
	
	@FindBy(id = "ppRelation_list")
	public WebElement ppRelationList;
	
	@FindBy(id = "ppAddress")
	public WebElement ppAddress;
	
	@FindBy(id = "ppCity")
	public WebElement ppCity;
	
	@FindBy(id = "ppState_list")
	public WebElement ppStateList;
	
	@FindBy(id = "ppZipCode")
	public WebElement ppZipCode;
	
	@FindBy(id = "ppCellPhone")
	public WebElement ppCellPhone;
	
	@FindBy(id = "ppEmail1")
	public WebElement ppEmail;
	
	@FindBy(id = "bSave")
	public WebElement ppSaveButton;
	
	@FindBy(id = "bAddNewSP")
	public WebElement addSecondaryParent;
	
	@FindBy(id = "spTitle_list")
	public WebElement spTitleList;
	
	@FindBy(id = "spFirstName")
	public WebElement spFirstName;
	
	@FindBy(id = "spLastName")
	public WebElement spLastName;
	
	@FindBy(id = "spUsername")
	public WebElement spUsername;
	
	@FindBy(id = "spPassword")
	public WebElement spPassword;
	
	@FindBy(id = "spRelation_list")
	public WebElement spRelationList;
	
	@FindBy(id = "spAddress")
	public WebElement spAddress;
	
	@FindBy(id = "spCity")
	public WebElement spCity;
	
	@FindBy(id = "spState_list")
	public WebElement spStateList;
	
	@FindBy(id = "spZipCode")
	public WebElement spZipCode;
	
	@FindBy(id = "spCellPhone")
	public WebElement spCellPhone;
	
	@FindBy(id = "spEmail1")
	public WebElement spEmail;
	
	@FindBy(id = "bSaveSP")
	public WebElement spSaveButton;
	
	
	
	public ParentSubTabPageElements() {
		PageFactory.initElements(driver, this);
	}
}
