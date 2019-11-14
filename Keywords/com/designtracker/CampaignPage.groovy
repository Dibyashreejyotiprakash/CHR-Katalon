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

public class CampaignPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By marketcampaignheader = By.xpath("//*[text()='Market Campaigns']")
	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By distddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")

	By newcampaignlink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lbNewCampaign']")

	By newcampaigngrid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_pnlCampaignEdit']")

	By newcampaignname = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvCampaign_txtCampaignName']")
	By startdatetextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvCampaign_txtStartDate']")
	By enddatetextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvCampaign_txtEndDate']")
	By startdate = By.xpath("//*[@id='ui-datepicker-div']//td/a[text()='1']")
	By enddate = By.xpath("//*[@id='ui-datepicker-div']//td/a[text()='28']")

	By createbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvCampaign_btnNewCampaign']")

	@Keyword
	public void VerifyCampaignPage() {
		try {
			boolean statusofheader = action.IsElementDisplayed(marketcampaignheader)
			Assert.assertTrue(statusofheader)
		}
		catch(Exception e) {
			println ("Verify Campaign page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyStartNewCampaignLink() {
		try {

			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(distddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			boolean statusofnewcampaignlink = action.IsElementEnabled(newcampaignlink)
			Assert.assertTrue(statusofnewcampaignlink)
		}
		catch(Exception e) {
			println ("Verify Start New Campaign Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyNewCampignGridAfterCorpMarketSelection() {
		try {
			boolean statusofnewcampigngrid = action.IsElementDisplayed(newcampaigngrid)
			Assert.assertTrue(statusofnewcampigngrid)

			boolean statusofnewcampaigntext = action.IsElementDisplayed(newcampaignname)
			Assert.assertTrue(statusofnewcampaigntext)

			boolean statusofstartdate = action.IsElementDisplayed(startdatetextbox)
			Assert.assertTrue(statusofstartdate)

			boolean statusofenddate = action.IsElementDisplayed(enddatetextbox)
			Assert.assertTrue(statusofenddate)


			boolean statusofcreatebutton = action.IsElementDisplayed(createbtn)
			Assert.assertTrue(statusofcreatebutton)
		}
		catch(Exception e) {
			println ("Verify New Campign Grid After Corp Market Selection failed due to "+ e)
		}
	}


	@Keyword
	public void CreateNewCampaign() {

		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(distddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			action.Type(newcampaignname, "Test Campaign")
			action.Click(startdatetextbox)
			WebUI.delay(5)
			action.Click(startdate)
			WebUI.delay(5)
			action.Click(enddatetextbox)
			WebUI.delay(5)
			action.Click(enddate)
			action.Click(createbtn)
		}
		catch(Exception e) {
			println ("Create New Campaign failed due to "+ e)
		}
	}
}
