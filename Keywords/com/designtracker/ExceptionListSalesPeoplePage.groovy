package com.designtracker
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.utilities.Interaction

import org.testng.Assert


class ExceptionListSalesPeoplePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corporationddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By salespersonddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlSalesPerson']")
	By insertSelSalesPerBtn = By.xpath("//input[@value='Insert Selected Sales Person']")
	By successInsertMsg = By.xpath("//li[contains(text(),'The selected sales person has been saved successfully')]")
	By checkBoxToSelSalesPerson = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvSalesPersonSafeList_ctl02_chkSelectedSalesPerson']")
	By delSelSalesPerBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnDeleteSelected']")
	By successDelMsg = By.xpath("//li[contains(text(),'The selected sales people have been deleted succes')]")
	By ErrorMsgOnInsertingDuplidateSalesPerson = By.xpath("//li[contains(.,'The selected sales person already exists in the exception list.')]")

	@Keyword
	public void VerifyAllDropDown() {
		try {
			WebUI.delay(2)
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			WebUI.delay(2)
			boolean statusofmarketddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
		}
		catch(Exception e) {
			println ("Verify All DropDown Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyInsertSalesPerson() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			WebUI.delay(3)
			action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			WebUI.delay(3)
			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "ADMIN, ADMIN (demoqa@brandmuscle.com)")

			WebUI.delay(3)
			action.WaitVisible(insertSelSalesPerBtn)
			action.Click(insertSelSalesPerBtn)

			WebUI.delay(3)
			action.WaitVisible(successInsertMsg)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			WebUI.delay(2)
			action.WaitVisible(checkBoxToSelSalesPerson)
			action.Click(checkBoxToSelSalesPerson)

			WebUI.delay(2)
			action.WaitVisible(delSelSalesPerBtn)
			action.Click(delSelSalesPerBtn)
		}
		catch(Exception e) {
			println ("Verify InsertSalesPerson Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyDeleteSalesPerson() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			WebUI.delay(3)
			action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			WebUI.delay(3)
			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "ADMIN, ADMIN (demoqa@brandmuscle.com)")

			WebUI.delay(3)
			action.WaitVisible(insertSelSalesPerBtn)
			action.Click(insertSelSalesPerBtn)

			WebUI.delay(3)
			action.WaitVisible(successInsertMsg)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			WebUI.delay(3)
			action.WaitVisible(checkBoxToSelSalesPerson)
			action.Click(checkBoxToSelSalesPerson)

			WebUI.delay(3)
			action.WaitVisible(delSelSalesPerBtn)
			action.Click(delSelSalesPerBtn)

			WebUI.delay(3)
			action.WaitVisible(successDelMsg)
			boolean statusofDeleteMsg  =     action.IsElementDisplayed(successDelMsg)
			Assert.assertTrue(statusofDeleteMsg, "Success msg for delete is visible")
		}
		catch(Exception e) {
			println ("Verify DeleteSalesPerson Failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyErrorOnInsertingDuplicateSalesPerson() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			WebUI.delay(3)
			action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			WebUI.delay(3)
			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "ADMIN, ADMIN (demoqa@brandmuscle.com)")

			WebUI.delay(3)
			action.WaitVisible(insertSelSalesPerBtn)
			action.Click(insertSelSalesPerBtn)

			WebUI.delay(3)
			action.WaitVisible(successInsertMsg)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			WebUI.delay(3)
			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "ADMIN, ADMIN (demoqa@brandmuscle.com)")

			WebUI.delay(3)
			action.WaitVisible(insertSelSalesPerBtn)
			action.Click(insertSelSalesPerBtn)

			WebUI.delay(3)
			action.WaitVisible(ErrorMsgOnInsertingDuplidateSalesPerson)
			boolean statusofErrorMsgOnInsertingDuplidateSalesPerson  =     action.IsElementDisplayed(ErrorMsgOnInsertingDuplidateSalesPerson)
			Assert.assertTrue(statusofErrorMsgOnInsertingDuplidateSalesPerson, "Error msg for InsertingDuplicateSalesPerson is visible")

			WebUI.delay(3)
			action.WaitVisible(checkBoxToSelSalesPerson)
			action.Click(checkBoxToSelSalesPerson)

			WebUI.delay(3)
			action.WaitVisible(delSelSalesPerBtn)
			action.Click(delSelSalesPerBtn)
		}
		catch(Exception e) {
			println ("Verify ErrorOnInsertingDuplicateSalesPerson Failed due to "+ e)
			Assert.fail()
		}
	}
}