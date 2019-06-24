package com.designtracker

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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory



public class JobCheckIn {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By jobcheckinheader = By.id("ctl00_ctl00_cphMain_cphMain_chAccountType_lblSectionHeader")
	By submititembtn = By.id("ctl00_ctl00_cphMain_cphMain_btnFindJob")
	By idtextfield = By.id("ctl00_ctl00_cphMain_cphMain_txtJobID")
	By jobidradiobtn = By.xpath("//*[text()='Job ID']/preceding-sibling::input")
	By lineitemidradiobtn = By.xpath("//*[text()='Line Item ID (Bar Code)']/preceding-sibling::input")

	@Keyword
	public void VerifyJobCheckInPage() {
		try {

			action.WaitVisible(jobcheckinheader)
			boolean statusofcheckinheader = action.IsElementDisplayed(jobcheckinheader)
			Assert.assertTrue(statusofcheckinheader, "Status of Job Checkin Header")
		}
		catch(Exception e) {
			println ("Verify Job Checkin Page failed due to "+ e)
		}
	}
}
