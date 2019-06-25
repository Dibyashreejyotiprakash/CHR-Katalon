package com.iiusersites

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
import internal.GlobalVariable
import org.openqa.selenium.By

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By lstPrimaryMenu = By.xpath("//div[@id='ctl00_RadMenu1']/ul/li/a/span[1]")
	By lstSubMenu = By.xpath("//div[@id='ctl00_RadMenu1']/ul/li/div/ul/li/a/span")
	By imgPOSTemplates = By.xpath("//a[(@target='_self') and contains(text(),'POS Templates')]")
	By logout = By.xpath("//*[@id='lbLogout']")
	By lstMenu = By.xpath("//div[@id='ctl00_RadMenu1']/ul/li")
	By orderform = By.xpath("(//*[@href='/OnlineOrderForm/default.aspx'])[2]")
	By accountlink = By.xpath("//*[text()='Account']")
	By projects = By.xpath("//*[text()='Projects']")



	@Keyword
	public boolean VerifyHomePage() {
		try {
			boolean IsHomePageVerify = false;
			String expectedUrl = "http://ii4.uat.brandmuscle.net/";
			String actualUrl = driver.getCurrentUrl()
			if (actualUrl.equals(expectedUrl)) {
				return IsHomePageVerify = true;
			}
			return IsHomePageVerify;
		}
		catch (Exception e) {
			println ("VerifyHomePage method failed due to :"+ e);
			throw e;
		}
	}

	@Keyword
	public void ClickOnPosTemplate() {
		action.ScrollToBottomOfPage()
		action.WaitVisible(imgPOSTemplates)
		action.Click(imgPOSTemplates)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnOrderForm() {
		try {
			action.ScrollToBottomOfPage()
			action.WaitVisible(orderform)
			action.Click(orderform)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On OrderForm failed due to :"+ e);
			throw e;
		}
	}

	@Keyword
	public void ClickOnAccount() {
		try {
			action.WaitVisible(logout)
			action.Click(logout)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Account failed due to :"+ e);
			throw e;
		}
	}

	@Keyword
	public void ClickOnProjects() {
		try {
			action.WaitVisible(projects)
			action.Click(projects)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Projects failed due to :"+ e);
			throw e;
		}
	}
}
