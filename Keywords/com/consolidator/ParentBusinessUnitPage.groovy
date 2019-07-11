package com.consolidator

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
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ParentBusinessUnitPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By ParentBuDropDown = By.xpath("//*[@id='MainContent_MainContent_drpBusinessUnit']")

	By SubmitBtn = By.xpath("//*[@id='MainContent_MainContent_btnSubmit']")

	@Keyword
	public void SelectParentBusinessUnit() {
		try {
			action.WaitVisible(ParentBuDropDown);
			action.SelectByText(ParentBuDropDown,"Red Bull North America");
			action.WaitVisible(SubmitBtn);
			action.Click(SubmitBtn);
			action.WaitForPageToLoad();
		}
		catch(Exception e) {
			println ("Select Parent Bu failed due to " + e);
			throw e;
		}
	}
}
