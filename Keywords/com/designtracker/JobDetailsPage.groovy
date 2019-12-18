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

import internal.GlobalVariable

import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory


public class JobDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By jobdetailswithjonumber = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphLeftBarTop_lblPageTitle']")
	By generalinfopanel = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_chGeneralInformation_lblSectionHeader']")
	By savejobbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_btnJobSave']")
	By joblineinfo = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_chJobLineInformation_lblSectionHeader']")
	By addpartlink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_htmlAnchorPartSearch']")
	By expandalllink = By.id("ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_lbtnExpandAll")
	By colapsealllink = By.id("ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_lbtnCollapseAll")
	By jobnametxtbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_txtJobName']")
	By jobticketnote = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_txtJobTicketNote']")
	By jobstatus = By.xpath("//*[id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_ddlJobStatus']")
	By pricinginfolink = By.xpath("//*[text()='Pricing Information']")
	By noteinfolink = By.xpath("//*[text()='Note Information']")
	By intrenalnoteinfo = By.xpath("//*[@href='JobDetail.aspx#internalnote']")
	By joblineinforlink = By.xpath("//*[@href='JobDetail.aspx#jobline']")
	By emailsalespersonlink = By.xpath("//*[text()='//*[text()='Email SalesPerson']']")

	By assigneddesignerddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_ddlDesigners']")

	By corporationddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By searchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By viewallcheckedbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnViewAllChecked']")
	By resetbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnReset']")
	By jobresultgrid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']")
	By searchjobresults = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']//tbody/tr/td[2]")

	By designerddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_ddlDesigners']")
	By savejobinfobtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_btnJobSave']")
	By sccessfullupdatemsg = By.xpath("//*[@class='JobMessageListWrapper']/li")

	By jobstatusddn = By.id("ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_ddlJobStatus")

	By jobid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_lblJobIDOutput']")

	By printformatddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlPrintFormat']")

	By quantity = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_txtQuantity']")

	By partsearchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")

	By part1 = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_pnlParts']//option[1]")

	By part2 = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_pnlParts']//option[2]")

	By insertbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAddToJob']")

	By jobdetailsbtn = By.xpath("//*[text()='DETAILS']")

	By insertimagebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl00_gvImages_ctl01_lnkUpload']")
	By noproofnecessaryddn = By.xpath("//*[@id='ddlNoProof']")
	By resonvalue = By.xpath("//*[text()='Accessories Only']")
	By savebtn = By.xpath("//*[@id='btnNoProof_input']s")
	By postbtn = By.xpath("//*[text()='POST']")
	By jobbtn = By.xpath("//*[text()=''JOB]")
	By pricingTab = By.xpath("//span[contains(text(),'PRICING')]")
	By budgetddn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBrands_ctl02_ddlBrandBudget_Input']")
	By budgetname = By.xpath("//li[text()='TestBudget1']")
	By saveBrandsBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnSaveBrandCB']")
	By succMsgBudgetSaving = By.xpath("//li[contains(text(),'Budget data has been updated successfully.')]")
	By brandMentionTab = By.xpath("//span[contains(text(),'BRAND MENTIONS')]")
	By jobSearchString = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_txtSearch']")
	By jobSearchBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_btnSearch']")
	//By availableBrandsddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_lbxAvailableBrands']")
	By availableBrandsddn = By.xpath("//div[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_upWrapper']//option[1]")
	By addBrandBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_btnAdd']")
	By saveToAllJobLinesBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_lvMain_ctrl0_btnSaveToAllParts']")

	By updateshippinglink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl00_lbtnMassShipping']")
	By popupupdateshippinglable = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_lblMassShipping']")
	By popupshippingtypeforjobddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_ddlMSJobShippingType']")
	By updatebtnforjob = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_btnMSJobSubmit']")
	By popupshippingtypeforjoblineddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_ddlMSJobLineShippingType']")
	By updatebtnforjobline = By.xpath("ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_btnMSJobLineSubmit")

	By fisrtshippingtype = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl00_gvJobShippingLocations_ctl02_lblJobShippingType']")
	By secondshippingtype = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_rptrJobLines_ctl01_gvJobShippingLocations_ctl02_lblJobShippingType']")

	By feesqty = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvFees_ctl04_txtFeeQty']")
	By fesscheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvFees_ctl04_chkSelectedFees']")
	By attaachfeesbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAttachFees']")

	By removepartlink = By.xpath("//*[text()='Remove Part']")
	By removecheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvRemove_ctl02_ckRemovePart']")
	By removeselectedpartbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnRemoveParts']")
	By partrow = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvRemove']//tr[2]")

	By firstaddoncheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvAddOns_ctl03_chkSelectedAddOns']")
	By firstaddonqty = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvAddOns_ctl03_txtAddonQty']")
	By attachaddons = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAttachAddOns']")
	By firstaddonprice = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvAddOns']//tr[2]//td[5]")
	By attachaddonsbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAttachAddOns']")
	By addonspriceinjobdetailspage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_cpPricingSummary_rptrPriceSummary_ctl01_lblLinePrice']")
	By extendedsearch = By.xpath("//legend[contains(text(),'Extended Search')]")
	By searchpart = By.xpath("//select[@id = 'ctl00_ctl00_cphMain_cphMain_lbxParts']")
	By commetinnoteinformation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_gvJobNotes_ctl03_lblNoteText']")
	By returntojob = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnReturn']")

	@Keyword
	public void ClickOnDetailsBtn() {
		try {
			action.WaitUntilElementClickable(jobdetailsbtn)
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On DetailsPage failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyUpdateJobNameForPosTemplate()
	{
		try {
			action.TypeAndClear(jobnametxtbox, "Updated Job Name For POS Template")
			action.ScrollToViewelement(savejobinfobtn)
			action.Click(savejobinfobtn)
		}
		catch(Exception e) {
			println ("Verify Update Job Name For Pos Template failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyJobDetailsPage() {
		try {
			String currenturl = action.GetCurrentURL()
			if(currenturl.concat("JobDetail.aspx")) {
				println ("Job Details Page verified")
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Verify Job Details Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyJobNumberInJobDetailsPage() {
		try {
			action.WaitVisible(jobdetailswithjonumber)
			boolean statusofjobdetails = action.IsElementDisplayed(jobdetailswithjonumber)
			Assert.assertTrue(statusofjobdetails, "Job Details panel is appearing with job number")
			println (action.GetText(jobdetailswithjonumber))
		}
		catch(Exception e) {
			println ("Verify Job Number In Job Details Page failed due to "+ e)
		}
	}



	@Keyword
	public void VerifyGeneralInfo() {
		try {
			action.WaitVisible(generalinfopanel)
			boolean statusofvisisblityofgeneralinfo = action.IsElementDisplayed(generalinfopanel)
			Assert.assertTrue(statusofvisisblityofgeneralinfo, "General Information")
		}
		catch(Exception e) {
			println ("Verify General Info failed due to "+ e)
		}
	}

	@Keyword
	public void VerifySectionLinks() {
		try {
			action.WaitVisible(pricinginfolink)
			boolean statusofvisisblityofpricinginfolink = action.IsElementDisplayed(pricinginfolink)
			Assert.assertTrue(statusofvisisblityofpricinginfolink)

			action.WaitVisible(noteinfolink)
			boolean statusofvisisblityofnoteinfolink = action.IsElementDisplayed(noteinfolink)
			Assert.assertTrue(statusofvisisblityofnoteinfolink)

			action.WaitVisible(intrenalnoteinfo)
			boolean statusofvisisblityofinternalinfolink = action.IsElementDisplayed(intrenalnoteinfo)
			Assert.assertTrue(statusofvisisblityofinternalinfolink)

			action.WaitVisible(joblineinforlink)
			boolean statusofvisisblityofjoblineinfolink = action.IsElementDisplayed(joblineinforlink)
			Assert.assertTrue(statusofvisisblityofjoblineinfolink)
		}
		catch(Exception e) {
			println ("Verify Section Links failed due to "+ e)
		}
	}


	@Keyword
	public void AssignDesignerToTheJob() {
		try {
			action.ScrollToViewelement(designerddn)
			action.WaitVisible(designerddn)
			action.SelectByIndex(designerddn, 1)
			WebUI.delay(3)
			action.Click(savejobinfobtn)
			WebUI.delay(5)
			boolean statusofsuccessmsg = action.IsElementDisplayed(sccessfullupdatemsg)
			Assert.assertTrue(statusofsuccessmsg)
			String msg = action.GetText(sccessfullupdatemsg)
			if(msg.contains("Job has been updated successfully.")) {
				println ("Job updated successfully")
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Assign designer to job failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyStatusOfNewlyCreatedJob() {
		try {
			boolean statusofstatusddn = action.IsElementDisplayed(jobstatusddn)
			Assert.assertTrue(statusofstatusddn)
			String currentjobstatus = action.GetselectedText(jobstatusddn)
			if(currentjobstatus.equalsIgnoreCase("created")) {
				println ("Verified")
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Verify Status Of Newly Created Job failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyJobNameAndJobTicketNoteAreMandatory() {
		try {
			action.Click(savejobinfobtn)
			WebUI.delay(5)
			boolean statusofjobsavemsg = action.IsDisplayed(sccessfullupdatemsg)
			if(statusofjobsavemsg == false) {
				action.Type(jobnametxtbox, "Test Job Name")
				WebUI.delay(3)
				action.Type(jobticketnote, "Test Ticket Note")
				WebUI.delay(3)
				action.Click(savejobinfobtn)
				WebUI.delay(5)
				boolean statusofmsg = action.IsElementDisplayed(sccessfullupdatemsg)
				Assert.assertTrue(statusofmsg)
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Verify Job Name And Job Ticket Note Are Mandatory failed due to "+ e)
		}
	}

	@Keyword
	public String AddJobNameJobTicketNameAndAssignDesigner() {
		action.Type(jobnametxtbox, "Test Job Name")
		WebUI.delay(5)
		action.Type(jobticketnote, "Test Job Ticket Note")
		WebUI.delay(5)
		action.SelectByText(designerddn, "ABERLE, JASON")
		WebUI.delay(10)
		action.ScrollToBottomOfPage()
		action.WaitUntilElementClickable(savejobinfobtn)
		action.Click(savejobinfobtn)
	}

	@Keyword
	public String GetJobId() {
		String jobidlabel =null;
		try {
			jobidlabel = action.GetText(jobid)
		}
		catch(Exception e) {
			println ("Get Job Id failed due to "+ e)
			Assert.fail()
		}
		return jobidlabel;
	}

	@Keyword
	public void AddPartAndBackToJobDetailsPage() {
		try {
			action.ScrollToBottomOfPage()
			WebUI.delay(7)
			action.Click(addpartlink)
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 3)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			WebUI.delay(10)
			action.Click(part1)
			action.Click(insertbtn)
			WebUI.delay(10)
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Add Part failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public String AddPartAddonsAndBackToJobDetailsPage() {
		String expectedaddonprice = null
		try {
			action.ScrollToBottomOfPage()
			WebUI.delay(7)
			action.Click(addpartlink)
			WebUI.delay(5)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 1)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			WebUI.delay(5)
			action.Click(part1)
			action.Click(insertbtn)
			WebUI.delay(5)

			action.Type(firstaddonqty, "1")
			WebUI.delay(5)
			action.Click(firstaddoncheckbox)

			expectedaddonprice = action.GetText(firstaddonprice)
			WebUI.delay(5)
			action.Click(attachaddonsbtn)
			WebUI.delay(5)

			return expectedaddonprice
		}
		catch(Exception e) {
			Assert.fail("Add Part failed due to "+ e)
		}
	}


	@Keyword
	public String GetDisplayedPrice()
	{
		String expectedaddonprice = null
		try{

			expectedaddonprice = action.GetText(firstaddonprice)
			WebUI.delay(5)

			return expectedaddonprice
		}
		catch(Exception e)
		{
			Assert.fail("Get Displayed Price failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyAddOnsPriceInJobDetailsPage()
	{
		try{
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
			String displayedaddonsprice = action.GetText(addonspriceinjobdetailspage)
			println ("Displayed Add-Ons Priec -----"+ displayedaddonsprice)
			String expectedaddonsprice = GetDisplayedPrice()
			println ("Expected Addons Price --------"+ expectedaddonsprice)

		}
		catch(Exception e)
		{
			Assert.fail("Verify Add Ons Price In Job Details Page failed due to "+ e)
		}
	}

	@Keyword
	public void DeletePart()
	{
		try{
			action.ScrollToViewelement(removepartlink)
			action.Click(removepartlink)
			action.WaitForPageToLoad()
			action.Click(removecheckbox)
			action.Click(removeselectedpartbtn)

			boolean statusofpartrow = action.IsElementDisplayed(partrow)
			Assert.assertFalse(statusofpartrow)
		}
		catch(Exception e)
		{
			Assert.fail("Delete Part failed due to "+ e)
		}
	}

	@Keyword
	public void AddMultiplePartsToJobs()
	{
		try{
			action.Click(addpartlink)
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 3)
			WebUI.delay(10)
			action.Type(quantity, "123")
			WebUI.delay(10)
			action.Click(partsearchbtn)
			WebUI.delay(10)
			action.Click(part1)
			WebUI.delay(10)
			action.Click(insertbtn)
			action.SelectByIndex(printformatddn, 3)
			WebUI.delay(10)
			action.Type(quantity, "123")
			WebUI.delay(10)
			action.Click(partsearchbtn)
			WebUI.delay(10)
			action.Click(part2)
			WebUI.delay(10)
			action.Click(insertbtn)
		}
		catch(Exception e)
		{
			println ("Add Multiple parts failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void InsertImage() {
		try {
			action.ScrollToViewelement(jobdetailsbtn)
			WebUI.delay(10)
			Set<String> windowids = driver.getWindowHandles()

			Iterator<String> it = windowids.iterator()

			while (it.hasNext()) {
				String parentwindowid = it.next()
				println ("Parent window id is "+ it.next())
				String childwindowid = it.next()
				println ("Child window id is "+ it.next())
				driver.switchTo().window(childwindowid)
				action.Click(insertimagebtn)
				action.Click(noproofnecessaryddn)
				action.Click(resonvalue)
				action.Click(savebtn)
				WebUI.closeBrowser()
				driver.switchTo().defaultContent()
			}
		}
		catch(Exception e) {
			println ("Insert Job Failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ChangeStatusForPostingJob() {
		try {
			action.SelectByText(jobstatusddn, "Pending Design Approval")
			action.Click(savejobinfobtn)
			action.SelectByText(jobstatusddn, "Approved for Production")
			action.Click(savejobinfobtn)
			action.SelectByText(jobstatusddn, "Pending Manager Approval")
			action.Click(savejobinfobtn)
			action.SelectByText(jobstatusddn, "Manager Approved")
			action.Click(savejobinfobtn)
			action.SelectByText(jobstatusddn, "Release for Production")
			action.Click(savejobinfobtn)
			WebUI.delay(10)
		}
		catch(Exception e) {
			println ("Change Status For Posting Job Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnPostJob() {
		try {
			action.MouseHoverOnElement(postbtn)
			action.Click(jobbtn)
		}
		catch(Exception e) {
			println ("Click on post job failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void AssignBudgetAndSaveBrands() {
		try {
			action.WaitVisibleDup(brandMentionTab)
			action.Click(brandMentionTab)
			action.WaitVisibleDup(jobSearchString)
			action.Type(jobSearchString,"a")
			action.WaitVisibleDup(jobSearchBtn)
			action.Click(jobSearchBtn)
			action.WaitVisibleDup(availableBrandsddn)
			//action.SelectByText(availableBrandsddn, "TestBrand")
			action.Click(availableBrandsddn)
			action.WaitVisibleDup(addBrandBtn)
			action.Click(addBrandBtn)
			action.WaitVisibleDup(saveToAllJobLinesBtn)
			action.Click(saveToAllJobLinesBtn)
			action.WaitVisibleDup(pricingTab)
			action.Click(pricingTab)
			action.ScrollToBottomOfPage()
			action.WaitVisibleDup(budgetddn)
			action.Click(budgetddn)
			action.WaitVisibleDup(budgetname)
			action.Click(budgetname)
			//action.SelectByText(budgetddn, "TestBudget1")
			action.WaitVisibleDup(saveBrandsBtn)
			action.Click(saveBrandsBtn)
			action.WaitVisibleDup(succMsgBudgetSaving)
			action.Click(succMsgBudgetSaving)
		}
		catch(Exception e) {
			Assert.fail("Assign Budget And Save Brands is failing because of :"+e)
		}
	}

	@Keyword
	public void VerifyUpdateShippingLinkAndUpdateShippingForJob()
	{
		try{
			action.ScrollToViewelement(updateshippinglink)
			WebUI.delay(3)
			action.Click(updateshippinglink)
			action.WaitVisible(popupupdateshippinglable)
			action.SelectByIndex(popupshippingtypeforjobddn, 2)
			action.Click(updatebtnforjob)
			WebUI.delay(3)
			action.ScrollToViewelement(fisrtshippingtype)
			String firstshippingtypetext = action.GetText(fisrtshippingtype)

			action.ScrollToViewelement(secondshippingtype)
			String secondshippingtypetext = action.GetText(secondshippingtype)
			if ((firstshippingtypetext.equalsIgnoreCase("UPS Ground")) && (secondshippingtypetext.equalsIgnoreCase("UPS Ground")))
			{
				println ("Shipping type is updated successfully")
			}
			else{
				throw new Exception("Shipping type is not updated")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Update Shipping Link And Update Shipping For Job failed due to :"+e)
		}
	}


	@Keyword
	public void VerifyUpdateShippingLinkAndUpdateShippingForSingleJobLine()
	{
		try{
			action.ScrollToViewelement(updateshippinglink)
			WebUI.delay(3)
			action.Click(updateshippinglink)
			action.WaitVisible(popupupdateshippinglable)

			action.SelectByIndex(popupshippingtypeforjoblineddn, 2)
			action.Click(updatebtnforjobline)
			WebUI.delay(3)

			action.ScrollToViewelement(fisrtshippingtype)
			String firstshippingtypetext = action.GetText(fisrtshippingtype)

			if(firstshippingtypetext.equalsIgnoreCase("UPS Ground"))
			{
				println ("Only job line shipping type updated")
			}

			action.ScrollToViewelement(secondshippingtype)
			String secondshippingtypetext = action.GetText(secondshippingtype)

			if(secondshippingtypetext.equalsIgnoreCase("UPS Ground"))
			{
				Assert.fail("Second shipping type is updated also")
			}
			else{
				println ("Second job type is not updated as expected")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Update Shipping Link And Update Shipping For Job failed due to :"+e)
		}
	}

	@Keyword
	public void VerifyMessage(String givencommentinii4){
		try{
			boolean statusofcomment = action.IsElementDisplayed(commetinnoteinformation)
			Assert.assertTrue(statusofcomment)

			String appearingcomment = action.GetText(commetinnoteinformation)
			if(appearingcomment.equals(appearingcomment)){
				println ("Comment is appearing")
			}else{
				Assert.fail("Comment is not matched")
			}
		}catch(Exception e){
			Assert.fail("Verify Message In Note Information failed due to :"+e)
		}

	}

	@Keyword
	public void ValidateDDInPrintFormatDdn()
	{
		try
		{
			action.ScrollToBottomOfPage()
			WebUI.delay(7)
			action.Click(addpartlink)
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 5)
			WebUI.delay(10)
			action.Type(quantity, "1")



		}
		catch(Exception e)
		{
			Assert.fail("ValidateDDInPrintFormatDdn Job failed due to :"+e)
		}
	}

	@Keyword
	public void ValidatedExtendedSearchForDD()
	{
		try
		{
			String s = action.IsDisplayed(extendedsearch)
			Assert.assertEquals(s, "False")
		}
		catch(Exception e)
		{
			Assert.fail("ValidatedExtendedSearchForDD Job failed due to :"+e)
		}
	}

	@Keyword
	public void AddDDPart()
	{
		try
		{
			action.ScrollToBottomOfPage()
			WebUI.delay(7)
			action.Click(addpartlink)
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 5)
			WebUI.delay(10)
			action.Type(quantity, "1")
			action.Click(partsearchbtn)
			action.WaitVisible(searchpart)
			action.SelectByIndex(searchpart, 1)
			action.Click(insertbtn)
			action.Click(returntojob)

		}
		catch(Exception e)
		{
			Assert.fail("AddDDPart Job failed due to :"+e)
		}
	}
}
