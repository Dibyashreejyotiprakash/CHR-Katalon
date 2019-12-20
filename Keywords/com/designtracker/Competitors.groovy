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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.testng.Assert

public class Competitors {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By marketcompetitorsheader = By.xpath("//*[text()='Market Competitor']")
	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By distddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")

	By newcompetotorslink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lbNewMarketJobType']")

	By newcompetitorsgrid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_pnlMarketCompetitorEdit']")

	By competitorstextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvMarketCompetitor_txtCompetitorName']")

	By createbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvMarketCompetitor_btnNewJobType']")


	@Keyword
	public void VerifyCompetitorsPage() {
		try {

			boolean statusofheader = action.IsElementDisplayed(marketcompetitorsheader)
			Assert.assertTrue(statusofheader)
		}
		catch(Exception e) {
			println ("Verify Campaign page failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyStartNewCompetitorLink() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(distddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			boolean statusofnewcompetitorslink = action.IsElementEnabled(newcompetotorslink)
			Assert.assertTrue(statusofnewcompetitorslink)
		}
		catch(Exception e) {
			println ("Verify Start New Campaign Link failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyNewCampignGridAfterCorpMarketSelection() {
		try {
			boolean statusofnewcompetitorsgrid = action.IsElementDisplayed(newcompetitorsgrid)
			Assert.assertTrue(statusofnewcompetitorsgrid)

			boolean statusofcompetirostextbox = action.IsElementDisplayed(competitorstextbox)

			boolean statusofcreatebutton = action.IsElementDisplayed(createbtn)
			Assert.assertTrue(statusofcreatebutton)
		}
		catch(Exception e) {
			println ("Verify New Campign Grid After Corp Market Selection failed due to "+ e)
		}
	}


	@Keyword
	public void CreateNewCompetitors() {

		try {

			action.Type(competitorstextbox, "Test Competitor")
			action.Click(createbtn)
		}
		catch(Exception e) {
			println ("Create New Campaign failed due to "+ e)
		}
	}
}
