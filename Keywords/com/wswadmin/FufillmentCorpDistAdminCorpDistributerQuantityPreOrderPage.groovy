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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class FufillmentCorpDistAdminPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By fulfillmentcorpdistadminheader = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")
	By corpddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Arrow']")
	By corpddntextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")
	By corpddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_DropDown']//li[279]")


	@Keyword
	public void VerifyFufillmentCorpDistAdminPage() {
		try{
			action.VerifyCurrentPage("CorpDistributerQuantityPreOrder.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fufillment CorpDist Admin Page failed due to "+ e)
		}
	}

	@Keyword
	public void SelectDemoCorp() {
		action.Click(corpddn)
		action.Type(corpddn, "339")
		action.WaitVisible(corpddnvalue)
		action.Click(corpddnvalue)
		WebUI.delay(10)
	}
}
