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
	By budgetname = By.xpath("//*[text()='Test Budget 1']")
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
	By updatebtnforjobline = By.xpath("ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_btnMSJobLineSubmit")
	By updatebtnforalljobline = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_btnMSJobLineSubmit']")

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
	By addonspriceinjobdetailspage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_cpPricingSummary_rptrPriceSummary_ctl02_lblLinePrice']")
	By extendedsearch = By.xpath("//legend[contains(text(),'Extended Search')]")
	By searchpart = By.xpath("//select[@id = 'ctl00_ctl00_cphMain_cphMain_lbxParts']")
	By commetinnoteinformation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_gvJobNotes_ctl03_lblNoteText']")
	By returntojob = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnReturn']")

	By salespersonddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_ddlJobSalesPerson']")

	By shippingtypeforalljoblineddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_JobLine_ddlMSJobLineShippingType']")
	By deletedsuccessfullymsg = By.xpath("//*[text()='Selected parts have been successfully deleted']")

	@Keyword
	public void ClickOnDetailsBtn() {
		try {
			action.WaitUntilElementClickable(jobdetailsbtn)
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click On Details Btn failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyUpdateJobNameForPosTemplate()
	{
		try {
			action.TypeAndClear(jobnametxtbox, "Updated Job Name For POS Template")
			action.ScrollToViewElement(savejobinfobtn)
			action.Click(savejobinfobtn)
		}
		catch(Exception e) {
			Assert.fail ("Verify Update Job Name For Pos Template failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyJobDetailsPage() {
		try {
			action.VerifyCurrentPage("JobDetail.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Job Details Page failed due to "+ e)
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
			Assert.fail ("Verify Job Number In Job Details Page failed due to "+ e)
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
			Assert.fail ("Verify General Info failed due to "+ e)
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
			Assert.fail ("Verify Section Links failed due to "+ e)
		}
	}


	@Keyword
	public void AssignDesignerToTheJob() {
		try {
			action.ScrollToViewElement(designerddn)
			action.WaitVisible(designerddn)
			action.SelectByText(designerddn,"CROTTY, JEREMY")
			//WebUI.delay(3)
			action.Click(savejobinfobtn)
			//WebUI.delay(5)
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
			Assert.fail ("Assign designer to job failed due to "+ e)
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
			boolean statusofjobsavemsg = action.IsDisplayed(sccessfullupdatemsg)
			if(statusofjobsavemsg == false) {
				action.Type(jobnametxtbox, "Test Job Name")
				action.Type(jobticketnote, "Test Ticket Note")
				action.Click(savejobinfobtn)
				boolean statusofmsg = action.IsElementDisplayed(sccessfullupdatemsg)
				Assert.assertTrue(statusofmsg)
			}
			else {
				throw new Exception("Save Job msg is not appearing")
			}
		}
		catch(Exception e) {
			Assert.fail ("Verify Job Name And Job Ticket Note Are Mandatory failed due to "+ e)
		}
	}

	@Keyword
	public String AddJobNameJobTicketNameAndAssignDesigner() {
		String jobname = "Test Job Name"
		try{
			action.Type(jobnametxtbox, jobname)
			action.Type(jobticketnote, "Test Job Ticket Note")
			action.SelectByText(designerddn, "CROTTY, JEREMY")
			action.ScrollToBottomOfPage()
			action.WaitUntilElementClickable(savejobinfobtn)
			action.Click(savejobinfobtn)

			return jobname
		}
		catch(Exception e){
			Assert.fail("Add Job Name Job Ticket Name And Assign Designer failed due to "+ e)
		}
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
			action.Click(addpartlink)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 3)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			action.Click(part1)
			action.Click(insertbtn)
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail ("Add Part failed due to "+ e)
		}
	}


	@Keyword
	public String AddPartAddonsAndBackToJobDetailsPage() {
		String expectedaddonprice = null
		try {
			action.ScrollToBottomOfPage()
			action.Click(addpartlink)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 1)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			action.Click(part1)
			action.Click(insertbtn)
			action.Type(firstaddonqty, "1")
			action.Click(firstaddoncheckbox)
			expectedaddonprice = action.GetText(firstaddonprice)
			action.Click(attachaddonsbtn)
			WebUI.delay(10)
			action.WaitForPageToLoad()

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
			//WebUI.delay(5)

			return expectedaddonprice
		}
		catch(Exception e)
		{
			Assert.fail("Get Displayed Price failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyAddOnsPriceInJobDetailsPage(String expectedaddonprice)
	{
		try{
			action.Click(jobdetailsbtn)
			action.WaitForPageToLoad()
			String displayedaddonsprice = action.GetText(addonspriceinjobdetailspage)
			println ("Displayed Add On Price On Job Details Page---------------"+ displayedaddonsprice)
			if(expectedaddonprice.equals(displayedaddonsprice)){
				println ("Addon Price Matched")
			}else{
				throw new Exception("Addon Price is not matched")
			}
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
			action.ScrollToViewElement(removepartlink)
			action.Click(removepartlink)
			action.WaitForPageToLoad()
			action.Click(removeselectedpartbtn)
			action.AcceptAlert()

			boolean statusofdeletedpartmsg = action.IsElementDisplayed(deletedsuccessfullymsg)
			Assert.assertTrue(statusofdeletedpartmsg)
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
			action.Refresh()
			action.ScrollToBottomOfPage()
			action.Click(addpartlink)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 3)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			action.Click(part1)
			action.Click(insertbtn)
			action.SelectByIndex(printformatddn, 3)
			action.Type(quantity, "123")
			action.Click(partsearchbtn)
			action.Click(part2)
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
			action.ScrollToBottomOfPage()
			action.WaitVisible(insertimagebtn)
			action.Click(insertimagebtn)
			Set<String> windowids = driver.getWindowHandles()
			println ("Window ids are ----------"+ windowids)
			Iterator<String> it = windowids.iterator()

			while (it.hasNext()) {
				String parentwindowid = it.next()
				println ("Parent window id is ---------------------------------"+ it.next())
				String childwindowid = it.next()
				println ("Child window id is ----------------------------------"+ it.next())
				driver.switchTo().window(childwindowid)
				action.Click(noproofnecessaryddn)
				action.Click(resonvalue)
				action.Click(savebtn)
				WebUI.closeBrowser()
				driver.switchTo().defaultContent()
			}
		}
		catch(Exception e) {
			Assert.fail("Insert Job Failed due to "+ e)

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
		}
		catch(Exception e) {
			Assert.fail ("Change Status For Posting Job Failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnPostJob() {
		try {
			action.MouseHoverOnElement(postbtn)
			action.Click(jobbtn)
		}
		catch(Exception e) {
			Assert.fail ("Click on post job failed due to "+ e)
		}
	}

	@Keyword
	public void AssignBudgetAndSaveBrands() {
		try {
			action.Click(brandMentionTab)
			action.Click(jobSearchBtn)
			action.Click(availableBrandsddn)
			action.Click(addBrandBtn)
			action.Click(saveToAllJobLinesBtn)
			action.Click(pricingTab)
			action.ScrollToBottomOfPage()
			action.Click(budgetddn)
			action.Click(budgetname)
			action.Click(saveBrandsBtn)
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
			action.ScrollToViewElement(updateshippinglink)
			//WebUI.delay(3)
			action.Click(updateshippinglink)
			action.WaitVisible(popupupdateshippinglable)
			action.SelectByIndex(popupshippingtypeforjobddn, 2)
			action.Click(updatebtnforjob)
			//WebUI.delay(3)
			action.ScrollToViewElement(fisrtshippingtype)
			String firstshippingtypetext = action.GetText(fisrtshippingtype)

			action.ScrollToViewElement(secondshippingtype)
			String secondshippingtypetext = action.GetText(secondshippingtype)
			if(firstshippingtypetext.equals(secondshippingtypetext))
			{
				println ("Shipping type is updated successfully")
			}else{
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
			action.ScrollToViewElement(updateshippinglink)
			//WebUI.delay(3)
			action.Click(updateshippinglink)
			//action.WaitVisible(popupupdateshippinglable)

			action.SelectByIndex(shippingtypeforalljoblineddn, 2)
			action.Click(updatebtnforalljobline)
			//WebUI.delay(3)

			action.ScrollToViewElement(fisrtshippingtype)
			String firstshippingtypetext = action.GetText(fisrtshippingtype)

			/*if(firstshippingtypetext.equalsIgnoreCase("UPS Ground"))
			 {
			 println ("Only job line shipping type updated")
			 }
			 action.ScrollToViewElement(secondshippingtype)
			 String secondshippingtypetext = action.GetText(secondshippingtype)
			 if(secondshippingtypetext.equalsIgnoreCase("UPS Ground"))
			 {
			 Assert.fail("Second shipping type is updated also")
			 }
			 else{
			 throw new Exception ("Second job type is not updated as expected")
			 }*/
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
				throw new Exception("Comment is not matched")
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
			action.Click(addpartlink)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 5)
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
			Assert.assertEquals(s, "false")
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
			action.Click(addpartlink)
			action.WaitForPageToLoad()
			action.SelectByIndex(printformatddn, 5)
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


	@Keyword
	public String GetSelectedSalesPersonName(){
		String selectedsalespersonname = null
		try{
			selectedsalespersonname = action.GetselectedText(salespersonddn)
			return selectedsalespersonname
		}
		catch(Exception e){
			Assert.fail("Get Selected Sales Person Name failed due to :"+e)
		}
	}
}
