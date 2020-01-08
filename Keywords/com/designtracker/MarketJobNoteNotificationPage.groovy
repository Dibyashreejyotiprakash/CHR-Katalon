package com.designtracker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

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

public class MarketJobNoteNotificationPage {


	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By insertlink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvJobNotesNotification_ctl01_lbtnInsert']")
	By userddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvJobNotesNotification_ctl01_ddlUsers']")

	@Keyword
	public void VerifyJobNoteNotifyPage() {
		try{
			action.VerifyCurrentPage("MarketJobNoteNotification.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Job Note Notify Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFields() {
		try{
			boolean statusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(statusofcorpddn)

			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			boolean statusofmarketddn = action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofmarketddn)

			action.SelectByText(marketddn, "Chicago Beverage Systems")

			/*boolean statusofinsertlink = action.IsElementDisplayed(insertlink)
			 Assert.assertTrue(statusofinsertlink)
			 boolean statusofuserddn = action.IsElementDisplayed(userddn)
			 Assert.assertTrue(statusofuserddn)*/
		}
		catch(Exception e) {
			Assert.fail("Verify Fields failed due to "+ e)
		}
	}
}
