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
import org.eclipse.core.runtime.AssertionFailedException
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
	By searchbtnmenu = By.xpath("//*[text()='SEARCH']")
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
	By distributorbudgetmigration = By.xpath("//span[contains(text(),'DISTRIBUTOR BUDGET MIGRATION')]")
	By supplierBrandManagers = By.xpath("//span[contains(text(),'SUPPLIER BRAND MANAGER')]")
	By exceptionlistbrands = By.xpath("//*[text()='EXCEPTION LIST - BRANDS']")
	By exceptionlistsalespeople = By.xpath("//*[text()='EXCEPTION LIST - SALES PEOPLE']")
	By highrarchy = By.xpath("//*[text()='HIERARCHY']")
	By jobclosing = By.xpath("//*[text()='JOB CLOSING']")
	By jobTypes = By.xpath("//*[text()='JOB TYPES']")
	//By suppliers = By.xpath("//*[text()='SUPPLIERS']")
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
	By jobActivityTracking = By.xpath("//*[text()='JOB ACTIVITY TRACKING']")
	By jobDiagnostic = By.xpath("//*[text()='JOB DIAGNOSTIC']")
	By jobEfficiency = By.xpath("//*[text()='JOB EFFICIENCY']")
	By jobStatus = By.xpath("//*[text()='JOB STATUS']")
	By jobSSameBrands = By.xpath("//*[text()='JOBS SAME BRANDS']")
	By profitLoss = By.xpath("//*[text()='PROFIT LOSS']")
	By statusSummary = By.xpath("//*[text()='STATUS SUMMARY']")
	By gexOrderStatus = By.xpath("//*[text()='GEX ORDER STATUS']")
	By ddlCorporation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By ddlMarcket = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By jobSearchButton = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By SearchJobResultDiv = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']//following-sibling::tbody")
	By jobIds = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']//following-sibling::tbody/tr/td[5]")
	By appadmin = By.xpath("//*[@title='Application Administration']")
	By jobtypes = By.xpath("//*[text()='JOB TYPES']")
	By salespeopleviewtransferjob = By.xpath("//*[text()='SALES PEOPLE JOBS VIEW/TRANSFER']")
	By suppliers = By.xpath("//*[text()='SUPPLIERS']")
	By salespeople = By.xpath("//*[text()='SALES PEOPLE']")

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
	public boolean VerifyREPORTSTab() {
		try {
			boolean status = action.IsElementDisplayed(reports)
			return status;
		}
		catch(Exception e) {
			println ("VerifyREPORTSTab method failed due to :" + e)
		}
	}

	@Keyword
	public void MouseHoverOnREPORTS(){
		try{
			action.WaitVisible(reports)
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobactivitytracking)
		}
		catch(Exception e) {
			println ("MouseHoverOnREPORTS method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnJobActivityTracking(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobActivityTracking)
			action.Click(jobactivitytracking)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnJobActivityTracking method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnJobDaignostic(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobdiagnostic)
			action.Click(jobdiagnostic)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnJobDaignostic method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnJobEfficiency(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobEfficiency)
			action.Click(jobEfficiency)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnJobEfficiency method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnJobStatus(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobstatus)
			action.Click(jobstatus)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnJobStatus method failed due to :" + e)
		}
	}


	@Keyword
	public void ClickOnJobsSameBrands(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(jobsamebrand)
			action.Click(jobsamebrand)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnJobsSameBrands method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnProfitLoss(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(profitLoss)
			action.Click(profitLoss)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnProfirLoss method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnStatusSummary(){
		try{
			action.ScrollToTopOgPage()
			action.MouseHoverOnElement(reports)
			action.WaitVisible(statussummary)
			action.Click(statussummary)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnStatusSummary method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnGEXOrderStatus(){
		try{
			action.WaitVisible(gexorderstatus)
			action.Click(gexorderstatus)
			action.WaitForPageToLoad(300)
			WebUI.delay(6)
		}
		catch(Exception e) {
			println ("ClickOnGEXOrderStatus method failed due to :" + e)
		}
	}

	//window handling
	@Keyword
	public void WindowHandle(){
		try{
			Set<String> set =  driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext())
			{
				String parentwidowid = it.next()
				println ("Parent Window id is"+ parentwidowid)

				String childwindowid = it.next()
				println ("Child Window id is"+ childwindowid)

				driver.switchTo().window(childwindowid)
			}


		}
		catch(Exception e){
			println ("WindowHandle method failed due to :"+ e)

		}
	}


	//Select Corporation and market
	@Keyword
	public void SelectCorporationAndMarcket(){
		try{
			action.WaitVisible(ddlCorporation)
			action.Click(ddlCorporation)
			action.SelectByText(ddlCorporation, "Instant Impact 4.0 Demo Corp (Dist.)")
			//action.SelectByIndex(ddlCorporation, 300)
			WebUI.delay(5)
			action.Click(ddlMarcket)
			action.SelectByText(ddlMarcket, "Chicago Beverage Systems")
			//action.SelectByIndex(ddlMarcket, 296)
			WebUI.delay(5)
			action.ScrollToViewElement(jobSearchButton)
			action.Click(jobSearchButton)
			action.WaitVisible(SearchJobResultDiv)
			//WebUI.delay(5)
		}
		catch(Exception e){
			println("SelectCorporationAndMarcket method failed due to "+ e)

		}
	}

	//Select first job id
	@Keyword
	public String SelectFirstJobID(){
		try{
			String getjobid = null;
			List<WebElement> lst =	action.GetElements(jobIds)

			for(int i=0; i<=lst.size();i++){

				String jobID = lst[i].getText()
				println("-------------------->>>>>>>>" +jobID)
				getjobid = jobID;
				break;





			}
			return getjobid
		}
		catch(Exception e){
			println("SelectFirstJobID failed due to :"+ e)

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
			//action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			//WebUI.delay(5)
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
	public void ClickOnExceptionlistsalespeople() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			//action.WaitVisible(exceptionlistsalespeople)
			WebUI.delay(3)
			action.Click(exceptionlistsalespeople)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On exceptionlistsalespeople failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnhighrarchy() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			action.WaitVisible(highrarchy)
			WebUI.delay(3)
			action.MouseHoverAndClick(highrarchy)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On highrarchy failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnjobclosing() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			//action.WaitVisible(jobclosing)
			WebUI.delay(3)
			action.Click(jobclosing)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On highrarchy failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnjoblinestratification() {
		try {
			action.WaitVisible(siteadmin)
			action.MouseHoverOnElement(siteadmin)
			action.WaitVisible(joblinestratification)
			WebUI.delay(3)
			action.MouseHoverAndClick(joblinestratification)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On joblinestratification failed due to "+ e)
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
	public void ClickOnJobTypes() {
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(5)
			action.Click(jobtypes)
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Click on Job Types failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnSuppliers() {
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(5)
			action.Click(suppliers)
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Click on Suppliers failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnExceptionlistBrands() {
		try {
			action.MouseHoverOnElement(siteadmin)
			//WebUI.delay(3)
			action.Click(exceptionlistbrands)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On exceptionlistbrands failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnSalesPeopleViewTransferButton()
	{
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(3)
			action.Click(salespeopleviewtransferjob)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Sales People View Transfer Button failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnDistrBudgetMigration()
	{
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(3)
			action.Click(distributorbudgetmigration)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("ClickOnDistrBudgetMigration failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnSupplierBrandManagers()
	{
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(3)
			action.Click(supplierBrandManagers)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("ClickOnSupplierBrandManagers failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnSalesPeople() {
		try {
			action.MouseHoverOnElement(siteadmin)
			WebUI.delay(3)
			action.Click(salespeople)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On ClickOnSalesPeople failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnOLOFII4Configuration()
	{
		try
		{

		}
		catch(Exception e)
		{
			println ("Click On OLOF II4 Configuration failed due to "+ e)
			Assert.fail()
		}
	}
}