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
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormPrintDetails2Page {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By backtoorderinfobtn = By.id("ctl00_Body_btnBack")
	By savequantityandpagechangesbtn = By.id("ctl00_Body_btnSave")
	By continuetoordersummarybtn = By.id("ctl00_Body_btnContinue")

	By iocodetextbox = By.id("ctl00_Body_txtIoCode")
	By glnumbertextbox = By.id("ctl00_Body_txtGlNumber")
	By ponumbertextbox = By.id("ctl00_Body_txtPoNumber")

	By ioberviage = By.xpath("//*[@id='Body_lblIOCodeVerbiage']")
	By glberviage = By.xpath("//*[@id='Body_lblGLNumberVerbiage']")
	By poverviage = By.xpath("//*[@id='Body_lblPONumberVerbiage']")


	@Keyword
	public void ClickOnContinueToOrderSummary() {
		try {
			action.ScrollToBottomOfPage()
			action.Click(continuetoordersummarybtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Continue To Order Summary failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyIOCodevisibilty() {
		try {
			boolean statusofiocode = action.IsElementDisplayed(iocodetextbox)
			Assert.assertTrue(statusofiocode)
		}
		catch(Exception e) {
			println ("Verify IO Code visibilty failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyIOVerviagevisibilty() {
		try {
			boolean statusofiocode = action.IsElementDisplayed(iocodetextbox)
			Assert.assertTrue(statusofiocode)
		}
		catch(Exception e) {
			println ("Verify IO Code visibilty failed due to "+ e)
		}
	}
	
	
	@Keyword
	public void VerifyIOBerviage()
	{
		try {
			boolean statusofioberviage = action.IsElementDisplayed(ioberviage)
			Assert.assertTrue(statusofioberviage)
		}
		catch(Exception e) {
			println ("Verify IO berviage visibilty failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyGLCodevisibilty() {
		try {
			boolean statusofglcode = action.IsElementDisplayed(glnumbertextbox)
			Assert.assertTrue(statusofglcode)
		}
		catch(Exception e) {
			println ("Verify GL Number visibilty failed due to "+ e)
		}
	}

	
	@Keyword
	public void VerifyGLBerviage()
	{
		try {
			boolean statusofglberviage = action.IsElementDisplayed(glberviage)
			Assert.assertTrue(statusofglberviage)
		}
		catch(Exception e) {
			println ("Verify GL berviage visibilty failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyPOCodevisibilty() {
		try {
			boolean statusofpocode = action.IsElementDisplayed(ponumbertextbox)
			Assert.assertTrue(statusofpocode)
		}
		catch(Exception e) {
			println ("Verify PO Number visibilty failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyPOBerviage()
	{
		try {
			boolean statusofpoberviage = action.IsElementDisplayed(poverviage)
			Assert.assertTrue(statusofpoberviage)
		}
		catch(Exception e) {
			println ("Verify PO berviage visibilty failed due to "+ e)
		}
	}
}
