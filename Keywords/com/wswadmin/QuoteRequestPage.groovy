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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class QuoteRequestPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By quoteidsearach = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CloneQuoteIDEditor']")
	By clonequotebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CloneQuoteButton_input']")

	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_CorporationEditor_Arrow']")
	By corptextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_CorporationEditor_Input']")
	By corptddnvalue = By.xpath("//*[text()='Instant Impact 4.0 Demo Corp (Dist.)']")
	By accontddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_AccountEditor_Arrow']")
	By accountddnvalue = By.xpath("//*[text()='CREDIT CARD TESTS']")
	By lockcorpbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_LockCorpMarketButton_input']")


	@Keyword
	public void VerifyQuoteRequestPage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("Default.aspx")) {
				println ("Login page is verified")
			}
			else{
				throw new Exception("Login page is not verified")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Quote Request Page failed due to "+ e)
		}
	}

	@Keyword
	public void CreateNewQuote() {
		try{
			action.Click(corpddn)
			//WebUI.delay(3)
			action.TypeAndClear(corptextbox, "Instant Impact 4.0 Demo Corp (Dist.)")
			//WebUI.delay(3)
			action.Click(corptddnvalue)
			//WebUI.delay(3)
			action.Click(accontddn)
			//WebUI.delay(3)
			action.Click(accountddnvalue)
			//WebUI.delay(3)
			action.Click(lockcorpbtn)
		}
		catch(Exception e) {
			Assert.fail("Create New Quote failed due to "+ e)
		}
	}
}
