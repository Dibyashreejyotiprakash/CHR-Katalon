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

//import internal.GlobalVariable
import java.security.Timestamp
import java.time.LocalTime
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Keys


public class CategoryItemMaintenancePage {



	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By metatagingcategoryitemlable = By.xpath("(//*[text()='Meta Tagging Category Item Maintenance'])[2]")

	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Arrow']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_DropDown']//li[279]")
	By corporationddntxtbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By externalitemtypeddn = By.xpath("//*[@id='ctl00_cphMain_radCombExteranlItemType_Input']")
	By externalitemtypeddnvalue = By.xpath("//*[@id='ctl00_cphMain_radCombExteranlItemType_DropDown']//li[text()='Accolades']")
	By descriptiontxtbox = By.xpath("//*[@id='ctl00_cphMain_itemDescription']")
	By savebtn = By.xpath("//*[@id='cphMain_btnSave']")
	By addexternaltypemsg = By.xpath("//*[@id='cphMain_lblMessage']")
	By savebtnerrormsgwithoutanyselection = By.xpath("//*[@id='cphMain_lblMessage']")


	@Keyword
	public void VerifyCategoryItemMaintenancePage() {
		try {
			action.WaitVisible(metatagingcategoryitemlable)
			boolean statusofmetataglabel = action.IsElementDisplayed(metatagingcategoryitemlable)
			Assert.assertTrue(statusofmetataglabel)
		}
		catch(Exception e) {
			println ("Verify Category Item Maintenance Page failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void CreateNewExternalType() {

		try {
			action.WaitVisible(corporationddn)
			action.Click(corporationddn)
			WebUI.delay(2)
			action.Type(corporationddntxtbox,"339")
			WebUI.delay(2)
			action.Click(corporationddnvalue)
			WebUI.delay(2)
			action.Click(externalitemtypeddn)
			WebUI.delay(2)
			action.Click(externalitemtypeddnvalue)
			WebUI.delay(2)
			String description = action.GenerateRandonString("Test")
			action.Type(descriptiontxtbox, description)
			action.Click(savebtn)
		}
		catch(Exception e) {
			println ("Create external item type failed due to "+ e)
			throw e
		}
	}


	@Keyword
	public void VerifyAddExternalItemTypeMsg() {
		try {
			action.WaitVisible(addexternaltypemsg)
			boolean statusofmsgvisibity=    action.IsElementDisplayed(addexternaltypemsg)
			Assert.assertTrue(statusofmsgvisibity)
		}
		catch(Exception e) {
			println ("Verify Add External Item Type Msg failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void VerifyAllFileds() {
		try {
			boolean corpddnstatus = action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(corpddnstatus)

			boolean externalitemtypeddn = action.IsElementDisplayed(externalitemtypeddn)
			Assert.assertTrue(externalitemtypeddn)

			boolean descriptiontxtbox = action.IsElementDisplayed(descriptiontxtbox)
			Assert.assertTrue(descriptiontxtbox)
		}
		catch(Exception e) {
			println ("Verify All Fileds failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void VerifySaveBtnErrorMessageWitoutAnySelection() {
		try {
			action.Click(savebtn)
			boolean statusoferrormsg = action.IsElementDisplayed(savebtnerrormsgwithoutanyselection)
			Assert.assertTrue(statusoferrormsg)
		}
		catch(Exception e) {
			println ("Verify Save Btn Error Message Witout Any Selection failed due to "+ e)
			throw e
		}
	}
}
