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
	public void VerifyExceptionListSalesPeoplePage(){
		try{
			action.VerifyCurrentPage("VerifyExceptioListSalesPeoplePage")
		}
		catch(Exception e){
			Assert.fail ("Verify Exception List Sales People Page Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAllDropDown() {
		try {
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			boolean statusofmarketddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
		}
		catch(Exception e) {
			Assert.fail ("Verify All DropDown Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyInsertSalesPerson() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.Click(insertSelSalesPerBtn)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")
			action.Click(checkBoxToSelSalesPerson)
			action.Click(delSelSalesPerBtn)
		}
		catch(Exception e) {
			Assert.fail ("Verify InsertSalesPerson Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyDeleteSalesPerson() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.Click(insertSelSalesPerBtn)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")
			action.Click(checkBoxToSelSalesPerson)
			action.Click(delSelSalesPerBtn)
			boolean statusofDeleteMsg  =     action.IsElementDisplayed(successDelMsg)
			Assert.assertTrue(statusofDeleteMsg, "Success msg for delete is visible")
		}
		catch(Exception e) {
			Assert.fail ("Verify DeleteSalesPerson Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyErrorOnInsertingDuplicateSalesPerson() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")
			action.SelectByText(marketddn, "Demo Dist. 1 QA")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.Click(insertSelSalesPerBtn)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")
			action.SelectByText(salespersonddn, "TESTADMIN, TESTADMIN (demoqa@brandmuscle.com)")
			action.Click(insertSelSalesPerBtn)
			boolean statusofErrorMsgOnInsertingDuplidateSalesPerson  =     action.IsElementDisplayed(ErrorMsgOnInsertingDuplidateSalesPerson)
			Assert.assertTrue(statusofErrorMsgOnInsertingDuplidateSalesPerson, "Error msg for InsertingDuplicateSalesPerson is visible")
			action.Click(checkBoxToSelSalesPerson)
			action.Click(delSelSalesPerBtn)
		}
		catch(Exception e) {
			Assert.fail ("Verify ErrorOnInsertingDuplicateSalesPerson Failed due to "+ e)
		}
	}
}