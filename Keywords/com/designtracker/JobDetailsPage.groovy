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

import internal.GlobalVariable
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory


public class JobDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By jobdetailswithjonumber = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphLeftBarTop_lblPageTitle']")

	@Keyword
	public void VerifyJobNumberInJobDetailsPage() {
		try {
			action.WaitVisible(jobdetailswithjonumber)
			boolean statusofjobdetails = action.IsElementDisplayed(jobdetailswithjonumber)
			Assert.assertTrue(statusofjobdetails, "Job Details panel is appearing with job number")
			println (action.GetText(jobdetailswithjonumber))
		}
		catch(Exception e) {
			println ("Verify Job Number In Job Details Page failed due to "+ e)
		}
	}
}
