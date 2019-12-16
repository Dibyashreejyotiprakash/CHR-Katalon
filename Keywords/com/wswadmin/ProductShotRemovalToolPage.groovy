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

public class ProductShotRemovalToolPage {

	By searchlabel = By.xpath("//*[text()='Search']")

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	@Keyword
	public void VerifyProductShotRemovalToolPage() {
		try{
			action.VerifyCurrentPage("ProductShotRemovalTool.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Product Shot Removal Tool Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifySearchLabelAndDropdowns() {
		try{
			boolean statusofsearchlable = action.IsElementDisplayed(searchlabel)
			Assert.assertTrue(statusofsearchlable)
		}
		catch(Exception e) {
			Assert.fail("Verify Search Label And Drop downs failed due to "+ e)
		}
	}
}
