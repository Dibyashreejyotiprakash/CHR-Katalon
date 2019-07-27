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

public class OrderFormOrderHederPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By newaccountname = By.xpath("//*[@id='ctl00_Body_rtbNewAccountName']")
	By jobtypeddn = By.xpath("//*[@id='ctl00_Body_rcbJobType_Arrow']")
	By jobtypeddnvalue = By.xpath("//*[text()='Accessories Only']")
	By continuetoitemsbtn = By.xpath("//*[@id='ctl00_Body_btnContinue']")


	@Keyword
	public void EnterValuesToFiledsInOrderPage() {
		try {
			action.WaitVisible(newaccountname)
			action.ScrollToViewElement(newaccountname)
			action.Type(newaccountname, "test")
			action.WaitVisible(jobtypeddn)
			action.Click(jobtypeddn)
			action.Click(jobtypeddnvalue)
			action.WaitVisible(continuetoitemsbtn)
			action.ScrollToBottomOfPage()
			action.Click(continuetoitemsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Enter Values To Fileds In Order Page failed due to "+ e)
		}
	}


	@Keyword
	public String EnterValuesToFiledsInOrderPageForIncopmleteOrder() {
		String accountname = null;
		try {
			action.WaitVisible(newaccountname)
			action.ScrollToViewElement(newaccountname)
			accountname = action.GenerateRandonString("Test")
			println ("*****************************"+accountname+"**********************")
			action.Type(newaccountname, accountname)
			action.WaitVisible(jobtypeddn)
			action.Click(jobtypeddn)
			action.Click(jobtypeddnvalue)
			action.WaitVisible(continuetoitemsbtn)
			action.ScrollToBottomOfPage()
			action.Click(continuetoitemsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Enter Values To Fileds In Order Page failed due to "+ e)
		}

		return accountname
	}
}
