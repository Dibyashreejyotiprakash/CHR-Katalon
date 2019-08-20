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
	By addpartlink = By.xpath("//*[@href='PartSearch.aspx']")
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

	By jobdetailsbtn = By.xpath("//*[text()='DETAILS']")


	@Keyword
	public void ClickOnDetailsBtn() {
		try {
			action.WaitUntilElementClickable(jobdetailsbtn)
			action.Click(jobdetailsbtn)
		}
		catch(Exception e) {
			println ("Click On DetailsPage failed due to "+ e)
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
	public void AddJobNameJobTicketNameAndAssignDesigner() {
		action.Type(jobnametxtbox, "Test Job Name")
		action.Type(jobticketnote, "Test Job Ticket Note")
		action.SelectByText(designerddn, "JYOTI, DIBYASHREE")
		WebUI.delay(10)
		String getselectedoption = action.GetselectedText(designerddn)
		action.ScrollToBottomOfPage()
		action.WaitUntilElementClickable(savejobinfobtn)
		action.Click(savejobinfobtn)
	}
}
