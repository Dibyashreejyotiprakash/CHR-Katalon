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
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

public class JobNewPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By newjobheader = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_chNewJob_lblSectionHeader']")
	By corporationddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlCorporation")
	By marketddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlMarket")
	By salespersonddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlSalesPerson")
	By accountddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlAccount")
	By jobtypeddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlJobType")
	By createjobbtn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_btnCreateJob")
	By jobid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lvJobs_ctrl0_lblJobIDOutput']")



	@Keyword
	public void VerifyNewJobPage() {
		try {
			String newjobpageurl = action.GetCurrentURL()
			println ("Actual new job page url "+ newjobpageurl)
			boolean statusofnewjobheader = action.IsElementDisplayed(newjobheader)
			Assert.assertTrue(statusofnewjobheader, "New Job Header Present")
		}
		catch(Exception e) {
			println ("Verify New Job Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCreateJobBtnWithoutAnySelection() {
		try {

			boolean statusofceratejobbtn = action.IsElementEnabled(createjobbtn)
			Assert.assertTrue(statusofceratejobbtn, "Create New Job Button disabeled")
		}
		catch(Exception e) {
			println ("Verify Create Job Btn Without Any Selection Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAllDropDown() {
		try {
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")

			boolean statusofmarketddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")

			boolean statusofsalespersonddn  =     action.IsElementDisplayed(salespersonddn)
			Assert.assertTrue(statusofsalespersonddn, "Sales Person dropdown visible")

			boolean statusofaccountddn  =     action.IsElementDisplayed(accountddn)
			Assert.assertTrue(statusofsalespersonddn, "Account dropdown dropdown visible")

			boolean statusofjobtypeddn  =     action.IsElementDisplayed(jobtypeddn)
			Assert.assertTrue(statusofsalespersonddn, "Job  dropdown dropdown visible")
		}
		catch(Exception e) {
			println ("Verify All DropDown Failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyCreateBtnStatusWithAllSelection() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")

			action.WaitVisible(accountddn)
			action.SelectByIndex(accountddn, 1)

			action.WaitVisible(jobtypeddn)
			action.SelectByText(jobtypeddn, "Print Only")

			action.WaitVisible(createjobbtn)
			boolean statusofcreatejobbtn = action.IsElementEnabled(createjobbtn)
			Assert.assertTrue(statusofcreatejobbtn, "Cerate Job Button is enabled")
		}
		catch(Exception e) {
			println ("Verify Create Btn Status With All Selection Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyBackToHomePageFromNewJobsPage() {
		try {
			action.Back()
		}
		catch(Exception e) {
			println ("Verify Back To Home Page From NewJobs Page Failed due to "+ e)
		}
	}


	//This method will create job and will return job id
	@Keyword
	public String VerifyCreateNewJobs1() {
		String jobIdValue = null
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByIndex(accountddn, 1)
			action.SelectByText(jobtypeddn, "Print Only")
			action.Click(createjobbtn)
			action.WaitForPageToLoad()
			jobIdValue = action.GetText(jobid)
			return jobIdValue
		}
		catch(Exception e) {
			Assert.fail("Verify Create New Jobs Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCreatedNewJobType(String jobtype) {

		action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

		action.SelectByText(marketddn, "Chicago Beverage Systems")

		action.SelectByText(salespersonddn, "ADMIN1, TEST (testadmin1@brandmuscle.com)")

		action.SelectByIndex(accountddn, 1)

		WebElement wb = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlJobType']"))
		Select sc = new Select(wb);
		action.SelectByText(jobtypeddn, jobtype)
		action.Click(createjobbtn)

	}

	@Keyword
	public String CreateNewJob()
	{
		String jobIdValue = null
		try
		{
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			action.SelectByText(salespersonddn, "ADMIN1, TEST (testadmin1@brandmuscle.com)")
			action.SelectByIndex(accountddn, 1)
			action.SelectByText(jobtypeddn, "Print Only")
			action.Click(createjobbtn)
			action.WaitForPageToLoad()
			jobIdValue = action.GetText(jobid)
			return jobIdValue
		}
		catch(Exception e)
		{
			println ("Create a new job failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void CreateDDJob()
	{
		try
		{
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			action.SelectByText(marketddn, "Chicago Beverage Systems")

			action.SelectByText(salespersonddn, "ADMIN2, TEST (testadmin2@brandmuscle.com)")

			action.SelectByIndex(accountddn, 1)

			action.SelectByText(jobtypeddn, "Print Only")

			action.Click(createjobbtn)
		}
		catch(Exception e)
		{
			Assert.fail("CreateDDJob Failed due to "+e)
		}

	}
	
	
	@Keyword
	public String VerifyCreateNewJobs() {
		String jobIdValue = null
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByIndex(accountddn, 1)
			action.SelectByText(jobtypeddn, "Print Only")
			action.Click(createjobbtn)
			action.WaitForPageToLoad()
			jobIdValue = action.GetText(jobid)
			return jobIdValue
		}
		catch(Exception e) {
			Assert.fail("Verify Create New Jobs Failed due to "+ e)
		}
	}

}




