package com.poswm

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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class LoginPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By username = By.id("MainContent_LoginCentiv_UserName")
	By password = By.id("MainContent_LoginCentiv_Password")
	By loginbtn = By.id("MainContent_LoginCentiv_btnLogin")
	By forgotpassword = By.id("MainContent_LoginCentiv_lbForgotPassword")
	By BUselectionDropdown = By.xpath("//*[@id='MainContent_ddlBusinessUnit']")





























	@Keyword
	public void VerifyPoswLoginPage() {
		try{
			action.VerifyCurrentPage("Login.aspx")
		}
		catch(Exception e) {
			println ("Verify Posw Login Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void PoswLogin(String posusername,String pospassword) {
		try{
			action.WaitVisible(username)
			action.Type(username, posusername)
			action.WaitVisible(password)
			action.Type(password, pospassword)
			action.WaitVisible(loginbtn)
			action.Click(loginbtn)
			action.WaitForPageToLoad()
			
			SelectEmpireMerchantBU()
		}
		catch(Exception e) {
			println ("Posw login failed ue to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void SelectEmpireMerchantBU() {
		try {
			//action.Click(BUselectionDropdown)
			action.SelectByText(BUselectionDropdown, "EMPIRE MERCHANTS")
			WebUI.delay(7)

		}
		catch(Exception e) {
			Assert.fail("SelectEmpireMarchentBU method failed due to :" + e)
		}
	}
}
