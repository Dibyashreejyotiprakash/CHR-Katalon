package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory


public class WarehouseOrderInventoryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewitembtn = By.cssSelector(".RadMenu_Office2010Silver .rmFirst .rmText")
	By supplierfiletr = By.xpath("")
	

	@Keyword
	public void VerifyOrderInventoryPage() {
		action.WaitVisible(addnewitembtn)
		boolean statusofaddnewitembtn = action.IsElementDisplayed(addnewitembtn)
		Assert.assertTrue(statusofaddnewitembtn)
		boolean statusofenablecreateneworderbtn = action.IsElementEnabled(addnewitembtn)
		Assert.assertTrue(statusofenablecreateneworderbtn)
	}
}
