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
import org.openqa.selenium.WebElement
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
	By brands = By.xpath("//*[text()='BRANDS']")
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
	By amrketddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket")

	By corporationddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By searchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By viewallcheckedbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnViewAllChecked']")
	By resetbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnReset']")
	By jobresultgrid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']")
	By searchjobresults = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']//tbody/tr/td[2]")

	By searchallbtn = By.id("ctl00_ctl00_cphMain_cphMain_btnSearch")

	By appadmin = By.xpath("//*[@title='Application Administration']")



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
	public void DTLogOut() {
		try {
			action.WaitVisible(logoutlink)
			action.Click(logoutlink)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("DT LogOut failed due to "+ e)
		}
	}

	@Keyword
	public void  ClickOnJobSearch() {
		try {
			action.WaitVisible(jobsbtn);
			action.MouseHoverOnElement(jobsbtn);
			action.WaitVisible(searchbtn)
			action.MouseHoverAndClick(searchbtn);
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
			action.MouseHoverAndClick(jobcheckin)
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

	@Keyword
	public void ClickOnAccounts() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			action.WaitVisible(accounts)
			action.MouseHoverAndClick(accounts)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On accounts  failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnBrands(){
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			action.WaitVisible(brands)
			action.MouseHoverAndClick(brands)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Brands Summary failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnCampaign() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			action.WaitVisible(campaign)
			action.MouseHoverAndClick(campaign)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Campaign failed due to "+ e)
		}
	}



	@Keyword
	public void ClickOnAccountType() {
		try {
			action.WaitVisible(applicationadmin)
			action.MouseHoverOnElement(applicationadmin)
			action.WaitVisible(accounttype)
			action.MouseHoverAndClick(accounttype)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Campaign failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnSiteUsers() {
		try {
			action.WaitVisible(applicationadmin)
			action.MouseHoverOnElement(applicationadmin)
			action.WaitVisible(siteusers)
			action.MouseHoverAndClick(siteusers)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Campaign failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyResetButton() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.ScrollToViewelement(searchbtn)
			action.WaitUntilElementClickable(searchbtn)
			action.Click(searchbtn)
			WebUI.delay(10)
			action.WaitUntilElementClickable(resetbtn)
			action.Click(resetbtn)
			action.WaitVisible(corporationddn)
			String selectedvalue = action.GetselectedText(corporationddn)
			Assert.assertEquals(selectedvalue,"Please select a Corporation" )
		}
		catch(Exception e) {
		}
	}


	@Keyword
	public void VerifyExistingJobSearch() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			action.WaitUntilElementClickable(searchbtn)
			action.Click(searchbtn)

			boolean statusofjobsearchresult = action.IsElementDisplayed(searchjobresults)
			Assert.assertTrue(statusofjobsearchresult)

			List<WebElement> alljobs = action.GetElements(searchjobresults)
			for(int i=0;i< alljobs.size();i++) {
				alljobs.get(i).click()
				action.WaitForPageToLoad()
				break
			}
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify existing job search failed due to "+ e)
		}
	}



	@Keyword
	public void VerifyNewlyCreatedJobSearchInDT(String jobnumber) {
		try {
			action.Click(confirmationradiobtn)
			action.WaitVisible(searchtxtfield)
			action.Type(searchallbtn, jobnumber)
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			action.WaitUntilElementClickable(searchbtn)
			action.Click(searchbtn)

			boolean statusofjobsearchresult = action.IsElementDisplayed(searchjobresults)
			Assert.assertTrue(statusofjobsearchresult)

			List<WebElement> alljobs = action.GetElements(searchjobresults)
			for(int i=0;i< alljobs.size();i++) {
				alljobs.get(i).click()
				action.WaitForPageToLoad()
				break
			}
			action.WaitForPageToLoad()
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Verify existing job search failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnCompetitors() {
		try {
			action.MouseHoverOnElement(siteadmin)
			action.Click(competitors)
		}
		catch(Exception e) {
			println ("Click On Competitors failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnExcptionListSalesPeople() {
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(5)
			action.Click(exceptionlistsalespeople)
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Click on exception list sales people failed due to "+ e)
		}
	}
}
