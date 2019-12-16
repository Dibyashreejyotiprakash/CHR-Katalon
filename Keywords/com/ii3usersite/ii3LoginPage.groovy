package com.ii3usersite

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
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

public class ii3LoginPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By username = By.id("UserName")
	By password = By.id("ContentMain_LoginControl_Password")
	By loginbtn = By.id("ContentMain_LoginControl_LoginButton")
	By corporationddn = By.id("ContentMain_LoginControl_ddlCorporation")
	By distrddn = By.id("ContentMain_LoginControl_ddlDistributor")

	@Keyword
	public void LoginToii3(String txtusername, String txtpassword) {
		action.Type(username, txtusername)
		action.Type(password, txtpassword)
		action.Click(loginbtn)
		action.WaitForPageToLoad()
		action.SelectByText(corporationddn, "Glazer's Family of Companies")
		action.SelectByText(distrddn,"Southern Glazer's Wine & Spirits - TX")
		action.WaitForPageToLoad()
	}
}
