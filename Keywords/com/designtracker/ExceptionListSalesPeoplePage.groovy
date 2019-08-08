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


class ExceptionListSalesPeoplePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By corporationddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlCorporation")
	By marketddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlMarket")
	By salespersonddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlSalesPerson")
	By insertSelSalesPerBtn = By.xpath("//input[@value='Insert Selected Sales Person']")
	
	@Keyword
	public void VerifyAllDropDown() {
		try {
			action.WaitVisible(corporationddn)
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")

			action.WaitVisible(marketddn)
			boolean statusofmarketddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")

			action.WaitVisible(salespersonddn)
			boolean statusofsalespersonddn  =     action.IsElementDisplayed(salespersonddn)
			Assert.assertTrue(statusofsalespersonddn, "Sales Person dropdown visible")

		}
		catch(Exception e) {
			println ("Verify All DropDown Failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyInsertSalesPerson() {
		try {
			action.WaitVisible(corporationddn)
			action.SelectByText(corporationddn, "Demo Distributor(QA)")

			action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			action.WaitVisible(salespersonddn)
			action.SelectByText(salespersonddn, "ADMIN, ADMIN (demoqa@brandmuscle.com)")

			action.WaitVisible(insertSelSalesPerBtn)
			action.Click(insertSelSalesPerBtn)
		}
		catch(Exception e) {
			println ("Verify InsertSalesPerson Failed due to "+ e)
		}
	}
}