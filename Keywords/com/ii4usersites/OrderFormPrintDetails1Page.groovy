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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormPrintDetails1Page {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By allitemsddn = By.xpath("//*[@id='ctl00_Body_ddlItems_Arrow']")
	By allitemsvalue = By.xpath("//*[text()='Case Tucker']")
	By sizeddn = By.xpath("//*[@id='ctl00_Body_ddlSize_Arrow']")
	By sizevalue = By.xpath("//*[text()='10.000 X 15.000']")
	By paperddn = By.xpath("//*[@id='ctl00_Body_ddlMedia_Input']")
	By paperddnvalue = By.xpath("//*[text()='10pt Card Stock']")
	By accesoriesddn = By.id("ctl00_Body_ddlAccessory_Input")
	By accesoriesddnvalue = By.xpath("//*[text()='Scored']")
	By nextbtn = By.xpath("//*[text()='Next']")
	By myitemsbtn = By.xpath("//*[text()='My Items']")
	By previousbtn = By.xpath("//*[text()='Previous']")
	By allitemslabel = By.xpath("//*[text()='All Items']")

	@Keyword
	public void EnterAllVauesInPrintDetails1Page() {
		try {
			WebUI.scrollToPosition(500, 500)
			action.WaitVisible(allitemsddn)
			action.Click(allitemsddn)
			action.WaitVisible(allitemsvalue)
			action.Click(allitemsvalue)
			action.Click(sizeddn)
			action.Click(sizeddn)
			action.WaitVisible(sizevalue)
			action.Click(sizevalue)
			action.Click(paperddn)
			action.Click(paperddnvalue)
			action.ScrollToBottomOfPage()
			action.Click(accesoriesddn)
			action.Click(accesoriesddnvalue)
			action.Click(nextbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Enter All Vaues In Print Details1 Page failed due to "+ e)
		}
	}
}
