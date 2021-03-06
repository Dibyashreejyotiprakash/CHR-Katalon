package com.designtracker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

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

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement

import org.testng.Assert

public class SupplierBrandManagersPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corporationddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By salesPerson = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSupplierBMEdit_ddlSalesPerson']")
	By supplier = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSupplierBMEdit_ddlSupplier']")
	By addBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSupplierBMEdit_btnUpdateSupplierBM']")
	By successSubmitMsg = By.xpath("//li[contains(text(),'Supplier Brand Manager added.')]")
	By FailedMsgOnDup = By.xpath("//li[contains(text(),'This Supplier Brand Manager already exists.')]")
	By delLink = By.xpath("//a[contains(text(),'Delete')]")
	By DelMsg = By.xpath("//li[contains(text(),'Record Deleted!')]")


	@Keyword
	public void VerifySupplierBrandManagerPage() {
		try {
			action.VerifyCurrentPage("Administration/Market/SupplierBrandManagers.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Supplier Brand Manager Page Failed due to "+ e)
		}
	}



	@Keyword
	public void VerifyAllFieldsOnPage() {
		try {
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			boolean statusofmarketddn  =     action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
		}
		catch(Exception e) {
			Assert.fail("Verify All DropDown Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddingSupplierBrandManager() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salesPerson, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)
			if(action.IsDisplayed(delLink)) {
				action.Click(delLink)
				action.AcceptAlert()
				boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
				Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
				action.Click(addBtn)
			}
			else {
				action.Click(addBtn)
			}
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "successSubmitMsg is visible")
			action.Click(delLink)
			action.AcceptAlert()
			boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
			Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
		}
		catch(Exception e) {
			Assert.fail("VerifyAddingSupplierBrandManager Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddingMultipleSupplierBrandManagers() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salesPerson, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)
			if(action.IsDisplayed(delLink)) {
				action.Click(delLink)
				action.AcceptAlert()
				boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
				Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
				action.Click(addBtn)
			}
			else {
				action.Click(addBtn)
			}

			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "successSubmitMsg is visible")
			action.SelectByIndex(salesPerson, 1)
			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)
			Assert.assertTrue(action.IsElementDisplayed(successSubmitMsg), "successSubmitMsg is visible")

			List<WebElement> elements1 = driver.findElements(delLink);
			for (int i=0; i<elements1.size();i++){

				if(action.IsDisplayed(elements1[i])) {
					action.Click(elements1[i])
					action.AcceptAlert()
					boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
					Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
				}
				else {
					break
				}
			}
		}
		catch(Exception e) {
			println ("Verify Adding Multiple Supplier Brand Managers Failed due to "+ e)
			Assert.fail(e)
		}
	}


	@Keyword
	public void VerifyDeleteSupplierBrandManager() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salesPerson, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)
			if(action.IsDisplayed(delLink)) {
				action.Click(delLink)
				action.AcceptAlert()
				boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
				Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
				action.Click(addBtn)
			}
			else {
				action.Click(addBtn)
			}
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "successSubmitMsg is visible")
			action.Click(delLink)
			action.AcceptAlert()
			boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
			Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
		}
		catch(Exception e) {
			Assert.fail("VerifyAddingSupplierBrandManager Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyErrorOnAddingDupSupplierBrandManager() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salesPerson, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)
			if(action.IsDisplayed(delLink)) {
				action.Click(delLink)
				action.AcceptAlert()
				boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
				Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
				action.Click(addBtn)
			}
			else {
				action.Click(addBtn)
			}

			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "successSubmitMsg is visible")

			action.SelectByText(supplier, "Demo Dist. 1 QA")
			action.Click(addBtn)

			boolean statusofFailedMsg  =     action.IsElementDisplayed(FailedMsgOnDup)
			Assert.assertTrue(statusofFailedMsg, "statusofFailedMsg is visible")

			action.Click(delLink)
			action.AcceptAlert()
			boolean statusofDelMsg  =     action.IsElementDisplayed(DelMsg)
			Assert.assertTrue(statusofDelMsg, "statusofDelMsg is visible")
		}
		catch(Exception e) {
			println ("VerifyErrorOnAddingDupSupplierBrandManager Failed due to "+ e)
			Assert.fail(e)
		}
	}
}
