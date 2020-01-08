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
import internal.GlobalVariable
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.testng.Assert


public class ConfirmationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By orderid = By.xpath("//*[@id='Body_lblInvoiceNumber']")
	By downloadpagelink = By.xpath("//a[contains(text(),'Click here to download your Template')]")
	By confirmationnumber = By.xpath("//span[@id='Body_lblInvoiceNumber']")


	@Keyword
	public String GetConfirmationId() {

		try {
			action.WaitVisible(orderid)
			String confirmationnumber = action.GetText(orderid)
			println ("*********"+confirmationnumber+"***********************")
			return confirmationnumber
		}
		catch(Exception e) {
			println ("Get confirmation number "+ e)
		}
	}


	@Keyword
	public void GetConfNumAndValidateOrderOnMyDownloads() {
		try {
			action.WaitVisible(confirmationnumber)
			String conf_num = action.GetText(confirmationnumber)
		}
		catch(Exception e) {
			Assert.fail("GetConfNumAndValidateOrderOnMyDownloads Failed due to "+e)
		}
	}
}
