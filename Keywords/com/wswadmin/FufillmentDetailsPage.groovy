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

public class FufillmentDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By updatebtn = By.xpath("//*[@id='cphMain_btnUpdate']")
	By updatemsg = By.xpath("//*[@id='cphMain_lblMainMessage']")
	By lowstockamounttextbox = By.xpath("//*[@id='ctl00_cphMain_LowStockAmountContainer']")

	@Keyword
	public void VerifyFulfillmentDetailsPage() {
		try{
			action.VerifyCurrentPage("FulfillmentDetails.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Details Page failed due to "+ e)
		}
	}

	@Keyword
	public void UpdateItem() {
		try{
			action.ScrollToBottomOfPage()
			action.Click(updatebtn)

			boolean statusofmsg = action.IsElementDisplayed(updatemsg)
			Assert.assertTrue(statusofmsg)
		}
		catch(Exception e) {
			Assert.fail("Update Item failed due to "+ e)
		}
	}

	@Keyword
	public void SetLowStockAmount() {
		try{
			action.ScrollToBottomOfPage()
			action.Type(lowstockamounttextbox, "1")
			action.Click(updatebtn)

			boolean statusofmsg = action.IsElementDisplayed(updatemsg)
			Assert.assertTrue(statusofmsg)
		}
		catch(Exception e) {
			Assert.fail("Set Low Stock Amount failed due to "+ e)
		}
	}
}
