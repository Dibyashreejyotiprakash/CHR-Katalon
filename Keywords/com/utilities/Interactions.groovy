package com.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.event.ActionEvent as ActionEvent

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.interactions.Actions as Actions
import org.testng.Assert

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor as JavaScriptExecutor

import com.google.common.collect.FilteredEntryMultimap.Keys as Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.model.FailureHandling as FailureHandling

import com.kms.katalon.core.testcase.TestCase as TestCase

import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent

import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Alert
import org.openqa.selenium.By as By

public class Interactions {




	@Keyword
	def GetUrl(String BuName,String TestType, String EnvironmentName) {
		try {

			if(TestType.equalsIgnoreCase("SMOKE")) {
				if (BuName.equalsIgnoreCase("CONSOLIDATOR")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("https://admintool.v5qa.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://admintool.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("https://admintool.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://admintool.v5dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://designtracker.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://designtracker.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://designtracker.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://designtracker.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKERAPPROVALPORTAL")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if(BuName.equalsIgnoreCase("POSW")){
					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://csg.v5qa.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://csg.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://csg.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://csg.v5dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://ii4.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://ii4.v5stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://rel4.instantimpact.com")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://ii4.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://wswadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://wswadmin.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://wswadmin.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://iiadmin.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://iiadmin.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://iiadmin.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}


				else if (BuName.equalsIgnoreCase("PROOFGALLERY")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else{

					WebUI.closeBrowser()
					println ("Bu is not correct")
				}
			}

			else if(TestType.equalsIgnoreCase("REGRESSION")) {
				if (BuName.equalsIgnoreCase("CONSOLIDATOR")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
				}

				else if (BuName.equalsIgnoreCase("PROOFGALLERY")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://proofs.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://proofs.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://proofs.dev.brandmuscle.net/")
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://wswadmin.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://wswadmin.dev.brandmuscle.net")
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://iiadmin.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://iiadmin.dev.brandmuscle.net/")
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://designtracker.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://designtracker.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://designtracker.dev.brandmuscle.net/")
					}
				}
			}
			else{
				println ("Test type is not correct")
				WebUI.closeBrowser()
			}
		}

		catch (Exception e) {
			println ("GetUrl failed due to " + e);
		}
	}



	@Keyword
	def Wait() {
		WebUI.delay(300)
	}

	@Keyword
	def WaitVisible(TestObject object) {

		WebUI.waitForElementVisible(findTestObject(object), 300)
	}

	@Keyword
	def IsWaitVisible( TestObject object) {
		Boolean  stillExists = true;
		try {
			WebUI.waitForElementVisible(findTestObject(object), 300)
			return true;
		}
		catch(Exception e) {

			return false;
		}
	}

	@Keyword
	def WaitWhileNotVisible(TestObject object) {
		Boolean stillExists = true;
		while (stillExists) {
			try {
				WaitVisible(object, 1);
			}
			catch(Exception e) {
				stillExists = false;
			}
		}
	}

	@Keyword
	def WaitForPageToLoad() {

		WebUI.waitForPageLoad(300);
	}


	@Keyword
	def WaitForPageToLoad(int timeinsec) {

		WebUI.waitForPageLoad(timeinsec);
	}



	@Keyword
	def WaitUntilElementClickable(TestObject to, int timeoutinsec= 300) {
		WebUI.waitForElementClickable(to);
	}

	@Keyword
	def Type(TestObject to, int timeoutinsec = 300, String enterstringvalue){

		WebUI.waitForElementVisible(to,300)
		WebUI.sendKeys(to, enterstringvalue)
	}

	@Keyword
	def ClearAndType(TestObject to,int timeoutinsec = 300, String enterstringvalue ){

		WebUI.waitForElementVisible(to, 300)
		WebUI.clearText(to)
		WebUI.sendKeys(to, enterstringvalue)
	}



	@Keyword
	def AcceptAlert() {
		try {

			WebUI.acceptAlert()
			return true;
		}
		catch(Exception e) {

			return false;
		}
	}


	@Keyword
	def DismissAlert() {
		try {
			WebUI.dismissAlert()
			return true;
		}
		catch(Exception e) {

			return false;
		}
	}

	@Keyword
	def GetAlertText() {
		try {
			WebUI.getAlertText()
		}
		catch(Exception e) {
			return null
		}
	}

	@Keyword
	def IsChecked(TestObject to, int timeinsec=300) {
		WaitVisible(to)
		WebUI.verifyElementChecked(findTestObject)
	}


	@Keyword
	def UnCheck(TestObject to, int timeinsec=300) {
		WaitVisible(to)
		if(WebUI.verifyElementChecked(to, 300)) {
			WebUI.click(to)
		}
	}

	@Keyword
	def Click(TestObject to, int timeinsec= 300) {
		WaitVisible(to)
		WebUI.click(to)
	}

	@Keyword
	def DoubleClick(TestObject to, int timeinsec=300) {
		WaitVisible(to)
		WebUI.doubleClick(to)
	}

	@Keyword
	def ClickAndWaitForPageLoad(TestObject to, int timeinsec=300) {
		WaitVisible(to)
		WebUI.doubleClick(to)
		WaitForPageToLoad()
	}

	@Keyword
	def MouseHoverOnElement(TestObject to, int timeinsec=300) {
		WaitVisible(to)
		WebUI.mouseOver(to)
	}

	//Mouse hover on one element and click on another element
	@Keyword
	def MouseHoverAndClick(TestObject hoverelement,TestObject clickelement, int timeinsec=300)
	{
		WaitVisible(hoverelement)
		WebUI.mouseOverOffset(hoverelement, 300, 300)
		WaitVisible(clickelement)
		WebUI.mouseOver(clickelement)
		WebUI.click(clickelement)
	}

	//Mouse hover and click on same element
	@Keyword
	def MousehoverAndClick(TestObject to, int timeinsec=300)
	{
		WaitVisible(to)
		WebUI.mouseOver(to)
		WebUI.click(to)
	}

	@Keyword
	def IsElementEnabled(TestObject to, int timeinsec=300)
	{
		WaitVisible(to)
		WebUI.verifyElementClickable(to)
	}


	@Keyword
	def  GetText(TestObject to, int waittimeinsec=300)
	{
		WaitVisible(to)
		return WebUI.getText(to)
	}

	@Keyword
	def SwitchToChildWindow(String windowtitle)
	{
		WebUI.switchToWindowTitle(windowtitle)
	}

	@Keyword
	def SwitchToChildWindowAndClose(String windowtitle)
	{
		try
		{
			WebUI.switchToWindowTitle(windowtitle)
			WebUI.closeWindowTitle(windowtitle)
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@Keyword
	def SwitchToChildWindowAndSwitchToDefault(String windowtitle)
	{
		try
		{
			WebUI.switchToWindowTitle(windowtitle)
			WebUI.switchToDefaultContent()
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@Keyword
	def GoToUrl(String url)
	{
		WebUI.getUrl()
	}

	@Keyword
	def GetCurrentUrl()
	{
		return WebUI.getUrl()
	}

	@Keyword
	def Back()
	{
		WebUI.back()
	}

	@Keyword
	def Refresh()
	{
		WebUI.refresh()
	}

	@Keyword
	def Forword()
	{
		WebUI.forward()
	}

	@Keyword
	def ScrollToViewelement(TestObject to)
	{
		WebUI.scrollToElement(to, 300)
	}

	@Keyword
	def ScrollToTop()
	{
		WebUI.scrollToPosition(0, 0)
	}

	@Keyword
	def SelectByText(TestObject to,String text)
	{
		WebUI.selectOptionByLabel(to, text, false)
	}

	@Keyword
	def SelectByIndex(TestObject to, int index)
	{
		WebUI.selectOptionByIndex(to, index)
	}




	//-----------------II- USER SITE-------------------------------------------//

	// Login Page


	// Verify Login
	@Keyword
	def IIUSerSiteLogin(String username, String password) {


		WebUI.setText(findTestObject('Object Repository/II-USERSITE/LoginPage/UserName'), username)
		WebUI.setText(findTestObject('Object Repository/II-USERSITE/LoginPage/Password'), password)
		WebUI.click(findTestObject('Object Repository/II-USERSITE/LoginPage/LoginBtn'))
		WaitForPageToLoad()
	}

	// Home Page

	//Click on Pos on Demand
	@Keyword
	def ClickOnPosOnDemand(){

		WaitVisible(findTestObject("Object Repository/II-USERSITE/Home Page/POSOnDemand"))

		MouseHoverAndClick(findTestObject("Object Repository/II-USERSITE/Home Page/POSOnDemand"),findTestObject("Object Repository/II-USERSITE/Home Page/POSTemplates"))
		WaitForPageToLoad()

	}


	//-------------------II- ADMIN-----------------------------------------------------//




	//------------------














}
