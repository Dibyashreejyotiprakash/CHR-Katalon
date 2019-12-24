package com.designtracker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

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
import com.utilities.Interaction

import internal.GlobalVariable

import com.kms.katalon.core.webui.driver.DriverFactory

import org.testng.Assert

public class JobPrintlinesPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By printLineInfoddn = By.xpath("//img[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl00_imgJobLineCopy']")
	By addEditPrintLineLink = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl00_lbtnCopyLine']")
	By addPrintLineNameTxtBox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvJobPrintLineDetail_NameTextBox']")
	By addDescriptionTxtBox = By.xpath("//textarea[@id='ctl00_ctl00_cphMain_cphMain_fvJobPrintLineDetail_txtDescription']")
	By addPrintLineNameInsertBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvJobPrintLineDetail_InsertButton']")
	By newRecordMsg = By.xpath("//li[contains(text(),'New Record Created!')]")



	@Keyword
	public void AddingPrintline() {
		try {
			action.ScrollToViewElement(printLineInfoddn)
			action.Click(printLineInfoddn)
			action.Click(addEditPrintLineLink)
			action.Type(addPrintLineNameTxtBox, "testPrintlinename"+action.GenerateRandomAplphabaticString(5))
			action.Type(addDescriptionTxtBox, "testPrintlinendesc"+action.GenerateRandomAplphabaticString(5))
			action.Click(addPrintLineNameInsertBtn)
			Assert.assertTrue(action.IsElementDisplayed(newRecordMsg))
		}
		catch(Exception e) {
			Assert.fail("Verify Job Details Page failed due to "+ e)
		}
	}
}
