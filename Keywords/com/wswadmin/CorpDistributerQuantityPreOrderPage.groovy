package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CorpDistributerQuantityPreOrderPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By header = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")
	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")
	By quantityconstraintddn = By.xpath("//*[@id='ctl00_cphMain_rcbQuantityConstraint_Input']")
	By preorderddn = By.xpath("//*[@id='ctl00_cphMain_rcbPreOrderDisplay_Input']")
	By updatebtn = By.xpath("//*[@id='cphMain_btnUpdateCorp']")
	By distributorgrid = By.xpath("//*[@id='cphMain_pnlDistributersGrid']")

	@Keyword
	public void VerifyCorpDistributerQuantityPreOrderPage() {
		try{
			action.VerifyCurrentPage("CorpDistributerQuantityPreOrder.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify CorpDistributerQuantityPreOrder Page failed due to "+ e)
		}
	}

	@Keyword
	public void verifyAllFields() {
		try{
			boolean statusofheader = action.IsElementDisplayed(header)
			Assert.assertTrue(statusofheader)

			boolean statusofcorpddn = action.IsElementDisplayed(corptextbox)
			Assert.assertTrue(statusofcorpddn)

			boolean statusofquantityconstraintddn = action.IsElementDisplayed(quantityconstraintddn)
			Assert.assertTrue(statusofquantityconstraintddn)

			boolean statusofdistributorddn = action.IsElementDisplayed(distributorgrid)
			Assert.assertTrue(statusofdistributorddn)
		}
		catch(Exception e) {
			Assert.fail("verify All Fields failed due to "+ e)
		}
	}
}
