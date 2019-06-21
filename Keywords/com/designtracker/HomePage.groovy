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
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory

public class HomePage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By welcomeheader = By.xpath("//*[contains(text(),'Welcome')]")
	By logoutlink = By.xpath("//*[text()='Logout']")
	By jobsbtn = By.xpath("//*[text()='JOBS']")
	By newbtn = By.xpath("//*[text()='NEW']")
	By searchbtn = By.xpath("//*[text()='SEARCH']")
	By shipreceivebtn = By.xpath("//*[text()='SHIP/RECEIVE']")
	By jobcheckin = By.xpath("//*[text()='JOB CHECK-IN']")
	By reports = By.xpath("//*[text()='REPORTS']")
	By jobactivitytracking = By.xpath("//*[text()='JOB ACTIVITY TRACKING']")
	By jobdiagnostic = By.xpath("//*[text()='JOB DIAGNOSTIC']")
	By jobefficiency = By.xpath("//*[text()='JOB EFFICIENCY']")
	By jobstatus = By.xpath("//*[text()='JOB STATUS']")
	By jobsamebrand = By.xpath("//*[text()='JOBS SAME BRANDS ']")
	By profitloss = By.xpath("//*[text()='PROFIT LOSS']")
	By statussummary = By.xpath("//*[text()='STATUS SUMMARY']")
	By gexorderstatus = By.xpath("//*[text()='GEX ORDER STATUS']")
	By siteadmin = By.xpath("//*[text()='SITE']")
	By accounts = By.xpath("//*[text()='ACCOUNTS']")
	By barnds = By.xpath("//*[text()='BRANDS']")
	By campaign = By.xpath("//*[text()='CAMPAIGNS']")
	By competitors  = By.xpath("//*[text()='COMPETITORS']")
	By distributorbudgetmigration = By.xpath("//*[text()='DISTRIBUTOR BUDGET MIGRATION']")
	By exceptionlistbrands = By.xpath("//*[text()='EXCEPTION LIST - BRANDS']")
	By exceptionlistsalespeople = By.xpath("//*[text()='EXCEPTION LIST - SALES PEOPLE']")
	By highrarchy = By.xpath("//*[text()='HIERARCHY']")
	By jobclosing = By.xpath("//*[text()='JOB CLOSING']")
	By joblinestratification = By.xpath("//*[text()='JOB LINE STRATIFICATION']")
	By peeraccountnotify = By.xpath("//*[text()='PEER ACCOUNT NOTIFY']")
	By applicationadmin = By.xpath("//*[text()='APPLICATION']")
	By accounttype = By.xpath("//*[text()='ACCOUNT TYPE']")
	By markettype = By.xpath("//*[text()='MARKET']")
	By marketregion = By.xpath("//*[text()='MARKET REGION']")
	By notetype = By.xpath("//*[text()='NOTE TYPE']")
	By siteusers = By.xpath("//*[text()='SITE USERS']")
	By stataustype = By.xpath("//*[text()='STATUS TYPES']")
	By notificationgroups = By.xpath("//*[text()='NOTIFICATION GROUPS']")
	By budgetnotify = By.xpath("//*[text()='BUDGET NOTIFY']")
	By jobnotify = By.xpath("//*[text()='JOB NOTE NOTIFY']")
	By jobstatusnotify = By.xpath("//*[text()='JOB STATUS NOTIFY']")

	By jobradiobtn = By.xpath("//*[text()='Job #']/preceding-sibling::input")
	By confirmationradiobtn = By.xpath("//*[text()='Confirmation #']/preceding-sibling::input")
	By searchtxtfield = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_txtJobKey']")
	By corporationddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation")
	By amrketddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket")

	By searchallbtn = By.id("ctl00_ctl00_cphMain_cphMain_btnSearch")

	@Keyword
	public void VerifyHomePage() {
		try {

			action.WaitVisible(welcomeheader)
			boolean statusofwelcomeheader = action.IsElementDisplayed(welcomeheader)
			Assert.assertTrue(statusofwelcomeheader, "Status of Welcome header on Home Page")
		}
		catch(Exception e) {
			println ("Verify Home Page failed due to "+ e)
		}
	}
	
	@Keyword
	public void DTLogOut()
	{
		try
		{
			action.Click(logoutlink)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("DT LogOut failed due to "+ e)
		}
	}

	@Keyword
	public void  ClickOnJobSearch() {
		try {
			action.WaitVisible(jobsbtn);
			action.MouseHoverOnElement(jobsbtn);
			action.MouseHoverAndClick(newbtn);
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Navigate to job search page failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnNewJob() {
		try {
			action.WaitVisible(jobsbtn);
			action.MouseHoverOnElement(jobsbtn)
			action.MouseHoverAndClick(newbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On New Job failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnJobsCheckIn() {
		try{
			action.MouseHoverOnElement(shipreceivebtn)
			action.MouseHoverAndClick(shipreceivebtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Jobs Check In failed due to "+ e)
		}
	}


	@Keyword
	public void CLickOnProfitAndLoss() {
		try {
			action.WaitVisible(reports)
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobsamebrand)
			action.MouseHoverAndClick(jobsamebrand)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("CLick On Profit And Loss failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnProfitLoss() {
		try {
			action.WaitVisible(reports)
			action.MouseHoverOnElement(reports)
			action.WaitVisible(profitloss)
			action.MouseHoverAndClick(profitloss)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On ProfitLoss button failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnStatusSummary() {
		try {
			action.WaitVisible(reports)
			action.MouseHoverOnElement(reports)
			action.WaitVisible(gexorderstatus)
			action.MouseHoverAndClick(gexorderstatus)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Status Summary failed due to "+ e)
		}
	}
}
