package com.ii3usersite

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

public class ii3HomePage {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By orderformbtn = By.xpath("//*[text()='Online Order Form']")
	By logoutlink = By.xpath("//*[text()='Log Out']")
	By homebutton = By.xpath("//*[text()='Home']")

	@Keyword
	public void VerifyHomePage() {
		boolean statusofhomebtn = action.IsElementDisplayed(homebutton)
		Assert.assertTrue(statusofhomebtn)
	}

	@Keyword
	public void Logoutii3() {
		action.Click(logoutlink)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnOnlineOrderForm() {
		action.Click(orderformbtn)
		action.WaitForPageToLoad()
	}
}
