package com.ii4usersites

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
import java.awt.Robot
import java.awt.event.KeyEvent

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormItemDetails2Page {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewnotebtn = By.xpath("//a[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl00_InitInsertButton']")
	By addnewnotetextbox = By.xpath("//*[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_txtNotesTextArea']")
	By savebtn = By.xpath("//*[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_btnUpdate_input']")
	By previousbtn = By.id("ctl00_Body_btnPrevious")
	By myitemsbtn = By.id("ctl00_Body_btnItems")
	By nextbtn = By.xpath("//*[@id='ctl00_Body_btnNext']")
	By quantityTxtBox = By.xpath("//input[@id='ctl00_Body_txtQuantity']")
	By quantityTxtEditor = By.xpath("//input[@id='ctl00_Body_QuantityEditor']")

	@Keyword
	public void AddNewNoteAndClickOnNextBtn() {
		try {
			action.ScrollToViewElement(quantityTxtBox)
			action.WaitUntilElementClickable(addnewnotebtn)
			action.Click(addnewnotebtn)
			////WebUI.delay(10)
			action.Click(addnewnotetextbox)
			action.Type(addnewnotetextbox, "Test")
			////WebUI.delay(10)
			action.ScrollToViewElement(addnewnotetextbox)
			action.WaitVisible(savebtn)
			action.WaitUntilElementClickable(savebtn)
			action.Click(savebtn)
			////WebUI.delay(10)
			action.ScrollToViewElement(nextbtn)
			action.WaitUntilElementClickable(nextbtn)
			////WebUI.delay(10)
			action.Click(nextbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Add New Note And Click On NextBtn failed due to "+ e)
		}
	}

	@Keyword
	public void AddNewNoteAndClickOnNextBtn1() {
		try {
			action.ScrollToViewElement(quantityTxtEditor)
			action.WaitUntilElementClickable(addnewnotebtn)
			action.Click(addnewnotebtn)
			////WebUI.delay(10)
			action.Click(addnewnotetextbox)
			action.Type(addnewnotetextbox, "Test")
			////WebUI.delay(10)
			action.ScrollToViewElement(addnewnotetextbox)
			action.WaitVisible(savebtn)
			action.WaitUntilElementClickable(savebtn)
			action.Click(savebtn)
			////WebUI.delay(10)
			//action.ScrollToViewElement(nextbtn)
			//action.WaitUntilElementClickable(nextbtn)
			////WebUI.delay(10)
			action.Click(nextbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Add New Note And Click On NextBtn failed due to "+ e)
		}
	}
}
