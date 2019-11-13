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


class ExceptionListBrandsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corporationddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By marketSupplierddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_ddlAllSuppliers']")
	By brandsddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_ddlBrands']")
	By insertSelBrandBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnInsertBrand']")
	By delSelBrandBtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnDeleteSelected']")
	By successInsertMsg = By.xpath("//li[contains(text(),'The selected brand has been saved successfully.')]")
	By checkBoxToBrand = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBrandsSafeList_ctl02_chkSelectedBrand']")
	By checkBoxToBrand2 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBrandsSafeList_ctl03_chkSelectedBrand']")
	By checkBoxToSelAllBrandName = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_gvBrandsSafeList_ctl01_chkDeleteAllHeader']")
	By successDelMsg = By.xpath("//li[contains(text(),'The selected brands have been deleted successfully')]")
	By ErrorMsgOnInsertingDuplidateBrand = By.xpath("//li[contains(text(),'The selected brand already exists in the exception')]")

	@Keyword
	public void VerifyAllDropDownInBrandExceptionList() {
		try {
			//WebUI.delay(2)
			boolean statusofcorpddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofcorpddn, "Corporation dropdown visible")
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")

			//WebUI.delay(10)
			boolean statusofmarketddn  =     action.IsElementDisplayed(corporationddn)
			Assert.assertTrue(statusofmarketddn, "Market dropdown visible")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
		}
		catch(Exception e) {
			println ("Verify All DropDown Failed due to "+ e)
			Assert.fail(e)
		}
	}

	@Keyword
	public void VerifyInsertBrandInExceptionList() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			//action.WaitVisible(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			////WebUI.delay(7)
			action.SelectByText(marketSupplierddn, "Demo Dist. 1 QA")

			////WebUI.delay(7)
			action.SelectByText(brandsddn, "TestBrand")

			////WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			////WebUI.delay(3)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			////WebUI.delay(2)
			action.Click(checkBoxToBrand)

			////WebUI.delay(2)
			action.Click(delSelBrandBtn)
		}
		catch(Exception e) {
			println ("Verify InsertBrand Failed due to "+ e)
			Assert.fail(e)
		}
	}

	@Keyword
	public void VerifyDeleteBrandFromExceptionList() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			//WebUI.delay(7)
			action.WaitVisibleDup(marketddn)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			//WebUI.delay(7)
			action.SelectByText(marketSupplierddn, "Demo Dist. 1 QA")

			//WebUI.delay(10)
			action.SelectByText(brandsddn, "TestBrand")

			//WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			//WebUI.delay(5)
			action.Click(checkBoxToBrand)

			//WebUI.delay(5)
			action.Click(delSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofDeleteMsg  =     action.IsElementDisplayed(successDelMsg)
			Assert.assertTrue(statusofDeleteMsg, "Success msg for delete is visible")
		}
		catch(Exception e) {
			println ("Verify DeleteBrands Failed due to "+ e)
			Assert.fail(e)
		}
	}

	@Keyword
	public void VerifyErrorOnInsertingDuplicateBrand() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			//WebUI.delay(7)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			//WebUI.delay(7)
			action.SelectByText(marketSupplierddn, "Demo Dist. 1 QA")
			//WebUI.delay(10)
			action.SelectByText(brandsddn, "TestBrand")

			//WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			//WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofErrorMsgOnInsertingDuplidate  =     action.IsElementDisplayed(ErrorMsgOnInsertingDuplidateBrand)
			Assert.assertTrue(statusofErrorMsgOnInsertingDuplidate, "Error msg for inserting duplicate is visible")

			//WebUI.delay(5)
			action.Click(checkBoxToBrand)

			//WebUI.delay(5)
			action.Click(delSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofDeleteMsg  =     action.IsElementDisplayed(successDelMsg)
			Assert.assertTrue(statusofDeleteMsg, "Success msg for delete is visible")
		}
		catch(Exception e) {
			println ("Verify ErrorOnInsertingDuplicateBrands Failed due to "+ e)
			Assert.fail(e)
		}
	}

	@Keyword
	public void VerifyInsertingTwoBrandsInList() {
		try {
			action.SelectByText(corporationddn, "Demo Distributor (QA)")

			//WebUI.delay(7)
			action.SelectByText(marketddn, "Demo Dist. 1 QA")

			//WebUI.delay(7)
			action.SelectByText(marketSupplierddn, "Demo Dist. 1 QA")

			//WebUI.delay(10)
			action.SelectByText(brandsddn, "TestBrand")

			//WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofSuccessMsg  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsg, "Success msg for insert is visible")

			//WebUI.delay(5)
			action.SelectByText(brandsddn, "TestBrand1")

			//WebUI.delay(5)
			action.Click(insertSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofSuccessMsgOnAddingBrand2  =     action.IsElementDisplayed(successInsertMsg)
			Assert.assertTrue(statusofSuccessMsgOnAddingBrand2, "Success msg for insert is visible")

			//WebUI.delay(5)
			action.Click(checkBoxToSelAllBrandName)

			//WebUI.delay(5)
			action.Click(delSelBrandBtn)

			//WebUI.delay(5)
			boolean statusofDeleteMsg  =     action.IsElementDisplayed(successDelMsg)
			Assert.assertTrue(statusofDeleteMsg, "Success msg for delete is visible")
		}
		catch(Exception e) {
			println ("Verify InsertingTwoBrandsInList Failed due to "+ e)
			Assert.fail(e)
		}
	}
}