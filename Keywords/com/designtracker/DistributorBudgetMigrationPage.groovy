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

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.utilities.Interaction
import internal.GlobalVariable
import org.testng.Assert

public class DistributorBudgetMigrationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corporationddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By fromBudget = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_ddlBudgetsMigrateFrom']")
	By toBudget = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_ddlBudgetsMigrateTo']")
	By checkBoxFirstJobId = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBudgetJobs_ctl02_chkSelectedJob']")
	By checkBoxAllJobId = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBudgetJobs_ctl01_chkDeleteAllHeader']")
	By submitBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnBatchSubmit']")
	By successSubmitMsg = By.xpath("//li[contains(text(),'The selected brand has been saved successfully.')]")
	By FailedSubmitMsg = By.xpath("//li[contains(text(),'could not be migrated.')]")


	@Keyword
	public void VerifyAllDropDownInBudgetMigrationPage() {
		try {
			WebUI.delay(2)
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			WebUI.delay(10)
			boolean statusofmarketddn  =     action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
		}
		catch(Exception e) {
			println ("Verify All DropDown Failed due to "+ e)
			Assert.fail(e)
		}
	}

	@Keyword
	public void VerifyBudgetMigrationForOneJob() {
		try {
			
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			WebUI.delay(10)
			action.SelectByText(marketddn, "Chicago Beverage Systems")

			WebUI.delay(10)
			action.SelectByIndex(fromBudget, 1)

			WebUI.delay(5)
			action.Click(checkBoxFirstJobId)

			WebUI.delay(10)
			action.SelectByIndex(toBudget, 2)

			WebUI.delay(2)
			action.Click(submitBtn)

			WebUI.delay(3)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(FailedSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "FailedSubmitMsg is visible")
		}
		catch(Exception e) {
			println ("Verify InsertBrand Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyBudgetMigrationForMultipleJobs() {
		try {
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			WebUI.delay(10)
			action.SelectByText(marketddn, "Chicago Beverage Systems")

			WebUI.delay(10)
			action.SelectByIndex(fromBudget, 1)

			WebUI.delay(5)
			action.Click(checkBoxFirstJobId)

			WebUI.delay(10)
			action.SelectByIndex(toBudget, 2)

			WebUI.delay(2)
			action.Click(submitBtn)

			WebUI.delay(3)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")
		}
		catch(Exception e) {
			println ("Verify InsertBrand Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyBudgetMigrationFailureCase() {
		try {
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			WebUI.delay(10)
			action.SelectByText(marketddn, "Chicago Beverage Systems")

			WebUI.delay(10)
			action.SelectByIndex(fromBudget, 1)

			WebUI.delay(5)
			action.Click(checkBoxFirstJobId)

			WebUI.delay(10)
			action.SelectByIndex(toBudget, 2)

			WebUI.delay(2)
			action.Click(submitBtn)

			WebUI.delay(3)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(FailedSubmitMsg)
			Assert.assertTrue(statusofSuccessMsg, "FailedSubmitMsg is visible")
		}
		catch(Exception e) {
			println ("VerifyBudgetMigrationFailureCase Failed due to "+ e)
			Assert.fail()
		}
	}
}