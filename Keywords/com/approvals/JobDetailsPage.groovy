package com.approvals

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class JobDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By jobcreatedfor = By.xpath("//*[@id='ctl00_cphBody_fvDesignSummary_OrderedForLabel']")
	By jobstatus = By.xpath("//*[@id='ctl00_cphBody_fvDesignSummary_statusLabel']")
	By copyPreDesignSection = By.xpath("//h1[contains(text(),'(Pre-Design)')]")
	By itemName = By.xpath("//td[@xpath=1]")

	@Keyword
	public void VerifyJobCreatedForField() {
		try{
			boolean statusofjobcreatedforfield= action.IsElementDisplayed(jobcreatedfor)
			Assert.assertTrue(statusofjobcreatedforfield)
		}
		catch(Exception e) {
			println ("Verify job Created For field failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyJobStatusField() {
		try{
			boolean statusofjobstatusfield= action.IsElementDisplayed(jobstatus)
			Assert.assertTrue(statusofjobstatusfield)
		}
		catch(Exception e) {
			println ("Verify job status field failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void VerifyCopyPredesign() {
		try{
			action.ScrollToViewElement(copyPreDesignSection)
			Assert.assertTrue(action.IsElementDisplayed(copyPreDesignSection))
			//Assert.assertTrue(action.IsElementDisplayed(itemName))
		}
		catch(Exception e) {
			Assert.fail("VerifyCopyPredesign failed due to "+ e)
		}
	}
	
	
}
