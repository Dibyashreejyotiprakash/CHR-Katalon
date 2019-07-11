package com.ii3usersite

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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ii3FinishingDetailsPage {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewnotebtn = By.xpath("//*[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By addnewtextarea = By.xpath("//*[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_txtNotesTextArea']")
	By sabebtn = By.xpath("//*[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_btnUpdate_input']")
	By nextbtn = By.xpath("//*[@id='ctl00_Body_BrandMentionsButton']")

	@Keyword
	public void AddNewNote() {
		action.Click(addnewnotebtn)
		action.Type(addnewtextarea, "Test")
		action.Click(sabebtn)
		action.ScrollToBottomOfPage()
		action.Click(nextbtn)
		action.WaitForPageToLoad()
	}
}
