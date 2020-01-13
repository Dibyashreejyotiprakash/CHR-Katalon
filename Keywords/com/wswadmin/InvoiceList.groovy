package com.wswadmin

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
//import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

public class InvoiceList
{

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()

	By allfromlast3days = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_LastFewDaysFilterButton_input']")
	By designTrackerLast10days = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_DesignTrackerFilterButton_input']")
	By instantImpactLast10days = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_InstantImpactFilterButton_input']")
	By consolidatorlast30days = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_ConsolidatorFilterButton_input']")
	By dtJobNumber = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_DTNumberFilterButton_input']")
	By invoiceNumber = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_InvoiceNumberFilterButton_input']")
	By filterExplanation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_ExplanationControl_FilterExplanationButton_input']")
	By gridExplanation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_ExplanationControl_GridExplanationButton_input']")
	By exportExplanation = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_ExplanationControl_ExportExplanationButton_input']")
	By applyBtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_InvoiceResults_InvoiceFilter_ApplyButton']")







	@Keyword
	public void VerifyAllFromLast3Days()
	{
		try
		{
			boolean statusallfromlast3days = action.IsElementEnabled(allfromlast3days)
			println ("statusallfromlast3days --------------"+ statusallfromlast3days)
			Assert.assertTrue(statusallfromlast3days)
			println ("*************** All from last 3 days btn Verified successfully ***********")


		}
		catch(Exception e)
		{
			Assert.fail("VerifyAllFromLast3Days Failed due to" +e)
		}
	}


	@Keyword
	public void VerifyDesignTrackerLast10Daysbtn()
	{
		try
		{

			boolean  designTrackerLast10days = action.IsElementEnabled(designTrackerLast10days)
			println ("designTrackerLast10days --------------"+ designTrackerLast10days)
			Assert.assertTrue(designTrackerLast10days)
			println ("*************** Design Tracker- Last 10 days btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyAllFromLast3Days Failed due to" +e)
		}
	}

	@Keyword
	public void VerifyInstantImpactLast10Daysbtn()
	{
		try
		{

			boolean instantImpactLast10days = action.IsElementEnabled(instantImpactLast10days)
			println ("instantImpactLast10days --------------"+ instantImpactLast10days)
			Assert.assertTrue(instantImpactLast10days)
			println ("*************** Instant Impact  last 10 days btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyInstantImpactLast10Daysbtn Failed due to" +e)
		}
	}

	@Keyword
	public void VerifyConsolidatorLast30Daysbtn()
	{
		try
		{

			boolean consolidatorlast30days = action.IsElementEnabled(consolidatorlast30days)
			Assert.assertTrue(consolidatorlast30days)
			println ("*************** Consolidator- Last 30 days   btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyConsolidatorLast30Daysbtn Failed due to" +e)
		}
	}


	@Keyword
	public void VerifyDTJobNumberbtn()
	{
		try
		{

			boolean dtJobNumber = action.IsElementEnabled(dtJobNumber)
			Assert.assertTrue(dtJobNumber)
			println ("*************** DT job number  btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyDTJobNumberbtn Failed due to" +e)
		}
	}


	@Keyword
	public void VerifyInvoiceNumberbtn()
	{
		try
		{

			boolean statusinvoiceNumber = action.IsElementEnabled(invoiceNumber)
			Assert.assertTrue(statusinvoiceNumber)
			println ("*************** Invoice Number btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyDTJobNumberbtn Failed due to" +e)
		}
	}














	@Keyword
	public void VerifyFilterExplanationbtn()
	{
		try
		{
			boolean statusfilterExplanation = action.IsElementEnabled(filterExplanation)
			Assert.assertTrue(statusfilterExplanation)
			println ("*************** Filter Explanation btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyFilterExplanationbtn Failed due to" +e)
		}
	}

	@Keyword
	public void VerifyGridExplanationbtn()
	{
		try
		{
			boolean statusfilterExplanation = action.IsElementEnabled(filterExplanation)
			Assert.assertTrue(statusfilterExplanation)
			println ("*************** Filter Explanation btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyFilterExplanationbtn Failed due to" +e)
		}
	}

	@Keyword
	public void VerifyExportExplanationbtn()
	{
		try
		{
			boolean statusExportExplanation = action.IsElementEnabled(exportExplanation)
			Assert.assertTrue(statusExportExplanation)
			println ("*************** Export Explanation btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyExportExplanationbtn Failed due to" +e)
		}
	}


	@Keyword
	public void VerifyApplybtn()
	{
		try
		{
			boolean statusapplyBtn = action.IsElementEnabled(applyBtn)
			Assert.assertTrue(statusapplyBtn)
			println ("***************  Apply btn Verified successfully ***********")
			//WebUI.delay(3)
		}
		catch(Exception e)
		{
			Assert.fail("VerifyApplybtn Failed due to" +e)
		}
	}


















}
