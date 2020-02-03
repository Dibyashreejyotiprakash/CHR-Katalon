package com.approvals

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class LoginPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By username = By.xpath("//*[@id='UserName']")
	By password = By.xpath("//*[@id='Password']")
	By submitbtn = By.xpath("//*[@id='ctl00_cphBody_loginPortal_LoginButton']")
	By forgotlink = By.xpath("//*[@id='ctl00_cphBody_loginPortal_lbtnForgotPassword']")

	By accountddn = By.xpath("//*[@id='ddlAvailableMarkets']")
	By accountvalue = By.xpath("//*[@id='ddlAvailableMarkets_DropDown']//li[text()='Chicago Beverage Systems']")
	By accountlogintbtn = By.xpath("//*[@id='ctl00_cphBody_btnMarketSelected']")


	@Keyword
	public void VerifyApprovalLoginPage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("login.aspx")) {
				println ("Page Verified")
			}
			else {
				throw new Exception("Verify Approval Login Page ")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Approval login page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAllFieldsInLoginPage() {
		try {
			boolean statusofusernametextbox = action.IsDisplayed(username)
			Assert.assertTrue(statusofusernametextbox)

			boolean statusofpasswordtextbox = action.IsDisplayed(password)
			Assert.assertTrue(statusofpasswordtextbox)

			boolean statusofloginbtn = action.IsDisplayed(submitbtn)
			Assert.assertTrue(statusofloginbtn)

			boolean statusofforgotlink = action.IsDisplayed(forgotlink)
			Assert.assertTrue(statusofforgotlink)
		}
		catch(Exception e) {
			Assert.fail ("Verify Approval login page failed due to "+ e)
		}
	}

	@Keyword
	public void ApprovalLogin(String un, String pwd) {
		try {
			action.Type(username,un )
			action.Type(password, pwd)
			action.Click(submitbtn)
			action.WaitForPageToLoad()
			action.Click(accountddn)
			action.Click(accountvalue)
			action.Click(accountlogintbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail ("Approval login page failed due to "+ e)
		}
	}
}
