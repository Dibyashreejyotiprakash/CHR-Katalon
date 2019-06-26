package com.iiusersites

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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormItemDetails2Page {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewnotebtn = By.id("ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl00_AddNewRecordButton")
	By addnewnotetextbox = By.id("ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_txtNotesTextArea")
	By savebtn = By.id("ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_btnUpdate_input")
	By previoubtn = By.id("ctl00_Body_btnPrevious")
	By myitemsbtn = By.id("ctl00_Body_btnItems")
	By nextbtn = By.id("ctl00_Body_btnNext")

	@Keyword
	public void AddNewNoteAndClickOnNextBtn() {
		try {

			action.ScrollToViewelement(addnewnotebtn)
			action.Click(addnewnotebtn)
			action.Type(addnewnotetextbox, "test")
			action.WaitVisible(savebtn)
			action.Click(savebtn)
			action.ScrollToBottomOfPage()
			action.Click(nextbtn)
		}
		catch(Exception e) {
			println ("Add New Note And Click On NextBtn failed due to "+ e)
		}
	}
}
