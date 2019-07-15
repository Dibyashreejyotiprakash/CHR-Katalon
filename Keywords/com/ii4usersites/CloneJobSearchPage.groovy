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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory	
import internal.GlobalVariable

public class CloneJobSearchPage {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	By searchbydtnumber = By.xpath("//*[@id='ctl00_Body_txtDtNumber']")
	By keywordsearch = By.xpath("//*[@id='ctl00_Body_txtKeywordSearch']")
	By accountname = By.xpath("//*[@id='Body_txtAccount']")
	By accountnumber = By.xpath("//*[@id='ctl00_Body_txtAccountNumber']")
	By clearbtn = By.xpath("//*[@id='ctl00_Body_btnClearSelection_input']")
	By formcalenderdate = By.xpath("")
	
	
}
