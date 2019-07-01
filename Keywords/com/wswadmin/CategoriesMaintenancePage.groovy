package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Keys

public class CategoriesMaintenancePage {
	
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();
	
	By createexternalitemtype = By.xpath("//*[text()='Create External Item Type']")
	By createexternalitemcorpseting = By.xpath("//*[text()='Create External Item Corp Settings']")
	By descriptiontxtbx = By.xpath("//*[@id='ctl00_cphMain_rtbDescription']")
	By savebtn = By.xpath("//*[@id='cphMain_btnSave']")
	By clearbtn = By.xpath("//*[@id='cphMain_btnClear']")
	
	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Arrow']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_DropDown']//li[242]")
	By corporationtxtbx = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Input']")
	By clearallfilters = By.xpath("//*[@id='ctl00_cphMain_btnClearFilters_input']")
	
	
	By addnewcorporatesetting = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By externalitemtypeddn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radExternalItemID_Input']")
	By desriptionoveride = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDescription']")
	By exteritemtypeddnvalue = By.xpath("(//*[text()='Accolades'])[1]")
	By distributorddn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDistributerID_Input']")
	By trueradiobtn = By.xpath("//*[text()='True']/preceding-sibling::input")
	By falseradiobtn = By.xpath("//*[text()='False']/preceding-sibling::input")
	
	By insertbtn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_btnSave_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_btnCancel_input']")
	
	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']//a[text()='Edit']")
	By firstdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']//a[text()='Delete']")
	
	@Keyword
	public void ClickOnCreateExternalItemCorpSettting()
	{
		action.Click(createexternalitemcorpseting)
	}
	
	@Keyword
	public void SelectCorporation()
	{
		action.Click(corporationddn)
		action.Type(corporationtxtbx, "300")
		WebUI.delay(5)
		action.Click(corporationddnvalue)
		WebUI.delay(5)
	}
	
	@Keyword
	public void AddNewCorpoateSetting()
	{
		action.Click(addnewcorporatesetting)
		WebUI.delay(5)
		action.Click(externalitemtypeddn)
		action.Click(exteritemtypeddnvalue)
		action.Type(desriptionoveride, "test")
		action.Click(insertbtn)
	}
	
	@Keyword
	public void VerifyEditLink()
	{
		action.WaitVisible(addnewcorporatesetting)
		boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditlink)
		if(statusoffirsteditlink == true)
		{
			action.WaitUntilElementClickable(firsteditlink)
			action.Click(firsteditlink)
		}
		
	}
	
	@Keyword
	public void VerifyDeleteLink()
	{
		action.WaitVisible(addnewcorporatesetting)
		boolean statusoffirstdeletelink = action.IsElementDisplayed(firstdeletelink)
		if(statusoffirstdeletelink == true)
		{
			action.WaitUntilElementClickable(firstdeletelink)
			action.Click(firstdeletelink)
		}
		action.DismissAlert()
	}
	
	@Keyword
	public void ClickOnCreateExternalItemType()
	{
		action.Type(descriptiontxtbx, "Test")
	}
	
	
	
	
	
	
	
	
	
}
