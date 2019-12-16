package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.testng.Assert

public class CategoryItemMaintenancePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddntextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By externalitemtypeddn = By.xpath("//*[@id='ctl00_cphMain_radCombExteranlItemType_Arrow']")
	By externalitemtypeddnvalue = By.xpath("//*[@id='ctl00_cphMain_radCombExteranlItemType_DropDown']//li[contains(text(),'11-A')]")
	By description = By.xpath("//*[@id='ctl00_cphMain_itemDescription']")
	By savebtn = By.xpath("//*[@id='cphMain_btnSave']")
	By metataggingcategoryitemmaintenancelabel = By.xpath("//*[text()='Meta Tagging Category Item Maintenance']")

	@Keyword
	public void VerifyCategryMaintenancePage() {
		try{
			action.VerifyCurrentPage("CategoryItemMaintenance.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Categry Maintenance Page failed due "+ e)
		}
	}

	@Keyword
	public String CreateMetatag() {
		String newmetatag =null
		try{
			action.Type(corpddntextbox, "339 - Demo Distributor (QA)")
			action.Enter(corpddntextbox)
			action.Click(externalitemtypeddn)
			action.Click(externalitemtypeddn)
			action.Click(externalitemtypeddnvalue)
			newmetatag = "Test Metatag "+ action.GenerateRandomAplphabaticString(9)
			action.Type(description, newmetatag)
			action.Click(savebtn)

			return newmetatag
		}
		catch(Exception e) {
			Assert.fail("Create Metatag failed due "+ e)
		}
	}
}
