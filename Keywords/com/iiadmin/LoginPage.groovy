package com.iiadmin

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

	By username = By.xpath("//*[@id='ctl00_Body_LoginCentiv_UserName']")
	By password = By.xpath("//*[@id='ctl00_Body_LoginCentiv_Password']")
	By loginbtn = By.xpath("//*[@id='ctl00_Body_LoginCentiv_LoginButton']")


	@Keyword
	public void VerifyLoginPage() {
		try{
			action.VerifyCurrentPage("login.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Login Page failed due to "+ e)
		}
	}

	@Keyword
	public void LoginToIIAdmin(String iiadminusername, String iiadminpassword){
		try{
			action.Type(username, iiadminusername)
			action.Type(password, iiadminpassword)
			action.Click(loginbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Login To IIAdmin failed due to "+ e)
		}
	}
}
