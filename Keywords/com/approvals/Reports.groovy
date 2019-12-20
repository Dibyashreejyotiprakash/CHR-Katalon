package com.approvals

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
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

public class Reports {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By reportsddn = By.xpath("//*[@id='ctl00_cphBody_ddlPortalReports']")

	@Keyword
	public void VerifyReportsPage() {
		try{
			action.VerifyCurrentPage("/Reports.aspx")
		}
		catch(Exception e) {
			println ("Verify Reports Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAvailableReport() {
		try{
			action.SelectByIndex(reportsddn, 1)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
		}
	}
}
