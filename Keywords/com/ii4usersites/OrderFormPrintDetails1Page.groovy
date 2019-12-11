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
import org.openqa.selenium.Keys
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormPrintDetails1Page {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By allitemsddn = By.xpath("//*[@id='ctl00_Body_ddlItems_Arrow']")
	By allitemsvalue = By.xpath("//*[@id='ctl00_Body_ddlItems_DropDown']//li[2]")
	By sizeddn = By.xpath("//*[@id='ctl00_Body_ddlSize_Arrow']")
	By sizevalue = By.xpath("//*[@id='ctl00_Body_ddlSize_DropDown']//li[2]")
	By paperddn = By.xpath("//*[@id='ctl00_Body_ddlMedia_Arrow']")
	By paperddnvalue = By.xpath("//*[@id='ctl00_Body_ddlMedia_DropDown']//li[2]")
	By accesoriesddn = By.id("ctl00_Body_ddlAccessory_Input")
	By accesoriesddnvalue = By.xpath("//*[text()='Scored']")
	By nextbtn = By.xpath("//*[@id='ctl00_Body_btnNext']")
	By myitemsbtn = By.xpath("//*[text()='My Items']")
	By previousbtn = By.xpath("//*[text()='Previous']")
	By allitemslabel = By.xpath("//*[text()='All Items']")

	@Keyword
	public void EnterAllVauesInPrintDetails1Page() {
		try {
			WebUI.scrollToPosition(500, 500)
			action.WaitVisible(allitemsddn)
			WebUI.delay(5)
			action.Click(allitemsddn)
			WebUI.delay(5)
			action.WaitVisible(allitemsvalue)
			WebUI.delay(5)
			action.Click(allitemsvalue)
			WebUI.delay(5)
			action.WaitUntilElementClickable(sizeddn)
			action.Click(sizeddn)
			WebUI.delay(10)
			action.WaitUntilElementClickable(sizevalue)
			action.WaitVisible(sizevalue)
			WebUI.delay(10)
			action.Click(sizevalue)
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			action.WaitUntilElementClickable(paperddn)
			WebUI.delay(10)
			action.Click(paperddn)
			WebUI.delay(10)
			action.WaitUntilElementClickable(paperddnvalue)
			WebUI.delay(10)
			action.Click(paperddnvalue)
			WebUI.delay(10)
			WebUI.delay(10)
			action.Click(accesoriesddn)
			WebUI.delay(10)
			action.Click(accesoriesddnvalue)
			WebUI.delay(10)
			action.Click(nextbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Enter All Vaues In Print Details1 Page failed due to "+ e)
		}
	}

	@Keyword
	public void ValidateAutoPopulationOfFieldsWithOneValueInDdn() {

		try {
		}
		catch(Exception e) {
		}
	}
}
