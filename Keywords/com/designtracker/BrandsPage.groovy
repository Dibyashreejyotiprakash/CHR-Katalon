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
import com.utilities.Interaction
import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class BrandsPage {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By brandsheader = By.xpath("//*[text()='Brands']")

	By corpddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation")
	By marketddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket")
	By supplierddn = By.id("ctl00_ctl00_cphMain_cphMain_ddlAllSuppliers")
	By brandtxtbx= By.id("ctl00_ctl00_cphMain_cphMain_txtBrandSearchText")
	By searchbtn = By.id("ctl00_ctl00_cphMain_cphMain_btnFindBrands")

	@Keyword
	public void VerifyBrandsPage() {
		try {
			action.WaitVisible(brandsheader)
			boolean statusofbrandsheader = action.IsElementDisplayed(brandsheader)
			Assert.assertTrue(statusofbrandsheader, "Brands Header is present")
		}
		catch(Exception e) {
			println ("Verify Brand page failed due to "+ e)
		}
	}
}
