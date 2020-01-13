package com.wswadmin

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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
public class ProductUnitDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Arrow']")
	By productname = By.xpath("//*[@id='ctl00_cphMain_radProductName']")
	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By savebtn = By.xpath("//*[@id='cphMain_btnSave']")


	@Keyword
	public void VerifyProductUnitDetailsPage() {
		try{
			action.VerifyCurrentPage("ProductUnitDetails.aspx?mode=Insert")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Details Page failed due to "+ e)
		}
	}

	@Keyword
	public void CreateProductUnit() {
		try{
			action.Click(corpddn)
			//WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(corptextbox)
			action.ScrollToBottomOfPage()
			action.Click(savebtn)
			action.ScrollToTopOgPage()
			action.Type(productname, "Test Product")
			action.ScrollToBottomOfPage()
			action.Click(savebtn)
		}
		catch(Exception e) {
			Assert.fail("Create Product Unit failed due to "+ e)
		}
	}
}
