package com.ii3usersite

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ii3OrderForItemDetails1Page {
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By smallprintbtn = By.xpath("//*[@href='Print/PrintDetails1.aspx?type=1']")
	By largeformatbtn = By.xpath("//*[@href='Print/PrintDetails1.aspx?type=2']")
	By menubook = By.xpath("//*[@href='BooksAccessories/Details.aspx?type=3']")
	By accesories = By.xpath("//*[@href='BooksAccessories/Details.aspx?type=4']")

	@Keyword
	public void ClickOnSmallPrintBtn() {
		try {
			action.Click(smallprintbtn)
		}
		catch(Exception e) {
			println ("Click On Small Print Btn failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnLargePrintBtn() {
		try {
			action.Click(largeformatbtn)
		}
		catch(Exception e) {
			println ("Click On Large Print Btn failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnMenuBookBtn() {
		try {
			action.Click(menubook)
		}
		catch(Exception e) {
			println ("Click On Menu Book Btn failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnAccesoriesBtn() {
		try {
			action.Click(accesories)
		}
		catch(Exception e) {
			println ("Click On Accesories Btn failed due to "+ e)
		}
	}
}
