package com.iiadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

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
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CorporationSetUppage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corptextbox = By.xpath("//*[@id='ctl00_Body_fvAccounts_corporationnameTextBox']")
	By eintextbox = By.xpath("//*[@id='ctl00_Body_fvAccounts_EINTextBox']")
	By sagecustomerid = By.xpath("//*[@id='ctl00_Body_fvAccounts_sageCustIDTextBox']")
	By insertbtn = By.xpath("//*[@id='ctl00_Body_fvAccounts_rfvSageCustID']")

	@Keyword
	public void VerifyAddNewCopPage(){
		try{
			action.VerifyCurrentPage("NewAccountSetup.aspx?Mode=Add")
		}
		catch(Exception e) {
			Assert.fail("Verify Add New Corp page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifymajorFields() {
		try{
			boolean statusofcorporationname = action.IsElementDisplayed(corptextbox)
			Assert.assertTrue(statusofcorporationname)

			boolean statusofein = action.IsElementDisplayed(eintextbox)
			Assert.assertTrue(statusofein)

			boolean statusofsagecustomerid = action.IsElementDisplayed(sagecustomerid)
			Assert.assertTrue(statusofsagecustomerid)
		}
		catch(Exception e) {
			Assert.fail("Verify major Fields failed due to "+ e)
		}
	}
}
