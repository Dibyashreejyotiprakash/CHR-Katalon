package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.testng.Assert
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

public class AssignCorpMarketSupplierPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By addcorpbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAddCorporation_input']")
	By addmarketbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAddMarket_input']")
	By addsupplierbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnAddSuppliers_input']")

	@Keyword
	public void VerifyAssignCorpMarketSupplierPage(){
		try{
			action.VerifyCurrentPage("AssignSuppliersMarkets.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Assign Corp Market Supplier Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddCorpMarketSupplierBtns() {
		try{
			boolean statusofaddcorpbtn = action.IsElementEnabled(addcorpbtn)
			Assert.assertTrue(statusofaddcorpbtn)

			boolean statusofmarketbtn = action.IsElementEnabled(addmarketbtn)
			Assert.assertTrue(statusofmarketbtn)

			boolean statusofaddsupplierbtn = action.IsElementEnabled(addsupplierbtn)
			Assert.assertTrue(statusofaddsupplierbtn)
		}
		catch(Exception e){
			Assert.fail("Verify Add CorpMarketSupplier Btns failed due to "+ e)
		}
	}
}

