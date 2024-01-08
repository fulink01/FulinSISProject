package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class QueryPageElements extends CommonMethods{

	@FindBy(id = "hQueryAnalyzer")
	public WebElement queryAnalyzerLink;
	
	@FindBy(id = "tQuery")
	public WebElement queryBox;
	
	@FindBy(id = "tPassword")
	public WebElement queryPassword;
	
	@FindBy(id = "bExecute")
	public WebElement queryExecuteLink;
	
	
	public QueryPageElements() {
		PageFactory.initElements(driver, this);
	}
}
