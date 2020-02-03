package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
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

public class AssociateProductUnitPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By corpoddnarrow = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Arrow']")
	By corpddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_DropDown']//li[text()='300 - Instant Impact 4.0 Demo Corp (Dist.)']")
	By productunitarrow = By.xpath("//*[@id='ctl00_cphMain_rcbProductUnit_Arrow']")
	By productunittextbox = By.xpath("//*[@id='ctl00_cphMain_rcbProductUnit_Input']")
	By updatebtn = By.xpath("//*[@id='cphMain_btnUpdateFul']")

	@Keyword
	public void VerifyAssociateProductUnitPage() {
		try{
			action.VerifyCurrentPage("AssociateFulfillmentItems.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Associate Product Unit Page failed due to "+ e)
		}
	}

	@Keyword
	public void AssociateItemToProductUnit() {
		try{
			action.Click(corpoddnarrow)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(updatebtn)
			action.ScrollToTopOgPage()
			//WebUI.delay(3)
			action.Type(productunittextbox, "Test Product")
			//WebUI.delay(3)
			action.ScrollToBottomOfPage()
			//WebUI.delay(3)
			action.Click(updatebtn)
		}
		catch(Exception e) {
			Assert.fail("Associate Item To Product Unit failed due to "+ e)
		}
	}
}
