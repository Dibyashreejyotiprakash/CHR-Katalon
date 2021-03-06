package com.ii4usersites

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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormOrderSumaryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By completeorderbtn = By.xpath("//*[@id='ctl00_Body_btnContinue']")
	By paymentsection = By.xpath("//*[text()='Payment']")
	By priceDisclaimerMsg = By.xpath("//*[@id='ctl00_Body_rlvOrderSummary_ctrl0_ucOST_lblPriceDisclaimer']")


	@Keyword
	public boolean VerifyPriceDisclaimerMsg(String Disclaimer) {
		try {
			Boolean IsDisclaimerVerify = false
			if (Disclaimer.equalsIgnoreCase("Enable")) {

				String PriceDisclaimerMsg =	 action.GetText(priceDisclaimerMsg)
				println("********** Price disclaimer enable -->" + PriceDisclaimerMsg + "**************")
				return IsDisclaimerVerify = true
			}
			else {
				println("********** Price disclaimer set to Disable **************")
				IsDisclaimerVerify = false
			}
		}
		catch(Exception e) {
			Assert.fail("VerifyPriceDisclaimerMsg method failed due to : "+ e)
		}
	}


	@Keyword
	public void PlaceOrder() {
		action.ScrollToBottomOfPage()
		////WebUI.delay(10)
		action.WaitUntilElementClickable(completeorderbtn)
		////WebUI.delay(10)
		action.Click(completeorderbtn)
		action.WaitForPageToLoad()
	}
}
