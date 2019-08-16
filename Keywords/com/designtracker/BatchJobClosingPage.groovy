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

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.junit.After
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

import com.utilities.Interaction

import org.testng.Assert

import internal.GlobalVariable

public class BatchJobClosingPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By enterJobIdTxtBox = By.xpath("//textarea[@id='ctl00_ctl00_cphMain_cphMain_txtJobIDs']")
	By validateJobBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnValidateJobIds']")
	By closeJobBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnCloseJobs']")
	By successMsgJobValidate = By.xpath("//li[contains(text(),'Job(s) successfully validated. Click the')]")
	By errorMsgForJobClose = By.xpath("//li[contains(text(),'The following jobs cannot be closed because they c')]")
	By errorMsgOnClosingInvalidJob = By.xpath("//li[contains(text(),'There are no jobs that need to be closed.')]")
	By successMsgJobClose = By.xpath("//li[contains(text(),'The job(s) have been closed successfully.')]")

	@Keyword
	public void VerifyAllFieldsOnPage() {
		try {
			WebUI.delay(2)
			Assert.assertTrue(action.IsElementDisplayed(enterJobIdTxtBox), "enter JobId TxtBox visible")
			Assert.assertTrue(action.IsElementDisplayed(validateJobBtn), "validate Job Btn visible")
		}
		catch(Exception e) {
			println ("Verify FieldsOnPage Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyJobNotEligibleForClose(String jobId) {
		try {
			WebUI.delay(2)
			action.WaitVisible(enterJobIdTxtBox)
			action.Type(enterJobIdTxtBox, jobId)

			WebUI.delay(2)
			action.WaitVisible(validateJobBtn)
			action.Click(validateJobBtn)

			//Error is not coming on while closing, looks like application issue
			WebUI.delay(2)
			action.WaitVisible(errorMsgForJobClose)
			boolean statusofErrMsg  =     action.IsElementDisplayed(errorMsgForJobClose)
			Assert.assertTrue(statusofErrMsg, "ErrorMsg is visible for created job close")
		}
		catch(Exception e) {
			println ("Verify JobNotEligibleForClose Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyClosingValidJob(String jobId) {
		try {
			WebUI.delay(2)
			action.WaitVisible(enterJobIdTxtBox)
			action.Type(enterJobIdTxtBox, jobId)

			WebUI.delay(2)
			action.WaitVisible(validateJobBtn)
			action.Click(validateJobBtn)

			WebUI.delay(2)
			action.WaitVisible(successMsgJobValidate)
			boolean statusofSuccMsgVal  =     action.IsElementDisplayed(successMsgJobValidate)
			Assert.assertTrue(statusofSuccMsgVal, "SuccessMsg is visible for validating job")

			WebUI.delay(2)
			action.WaitVisible(closeJobBtn)
			action.Click(closeJobBtn)

			WebUI.delay(2)
			action.WaitVisible(successMsgJobClose)
			boolean statusofSuccMsgCls  =     action.IsElementDisplayed(successMsgJobClose)
			Assert.assertTrue(statusofSuccMsgCls, "SuccessMsg is visible for Closing job")
		}
		catch(Exception e) {
			println ("Verify ClosingJob Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyClosingTwoJobs(String jobId1,String jobId2) {
		try {
			WebUI.delay(2)
			action.WaitVisible(enterJobIdTxtBox)
			action.Type(enterJobIdTxtBox, jobId1)
			action.Enter(enterJobIdTxtBox)
			action.Type(enterJobIdTxtBox, jobId2)

			WebUI.delay(2)
			action.WaitVisible(validateJobBtn)
			action.Click(validateJobBtn)

			WebUI.delay(2)
			action.WaitVisible(successMsgJobValidate)
			boolean statusofSuccMsgVal  =     action.IsElementDisplayed(successMsgJobValidate)
			Assert.assertTrue(statusofSuccMsgVal, "SuccessMsg is visible for validating job")

			WebUI.delay(2)
			action.WaitVisible(closeJobBtn)
			action.Click(closeJobBtn)

			WebUI.delay(2)
			action.WaitVisible(successMsgJobClose)
			boolean statusofSuccMsgCls  =     action.IsElementDisplayed(successMsgJobClose)
			Assert.assertTrue(statusofSuccMsgCls, "SuccessMsg is visible for Closing job")
		}
		catch(Exception e) {
			println ("Verify ClosingTwoJobs Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyErrorOnClosingInvalidJob() {
		try {
			WebUI.delay(2)
			action.WaitVisible(enterJobIdTxtBox)
			action.Type(enterJobIdTxtBox, "123456")

			WebUI.delay(2)
			action.WaitVisible(validateJobBtn)
			action.Click(validateJobBtn)

			WebUI.delay(2)
			action.WaitVisible(errorMsgOnClosingInvalidJob)
			boolean statusofErrMsg  =     action.IsElementDisplayed(errorMsgOnClosingInvalidJob)
			Assert.assertTrue(statusofErrMsg, "ErrorMsg is visible for closing invalid job")
		}
		catch(Exception e) {
			println ("Verify InvalidJobClose Failed due to "+ e)
			Assert.fail()
		}
	}
}
