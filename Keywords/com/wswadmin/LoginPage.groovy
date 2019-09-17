package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
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
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert
import internal.GlobalVariable

public class LoginPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By username = By.xpath("//*[@id='cphMain_LoginCentiv_UserName']")
	By password = By.xpath("//*[@id='cphMain_LoginCentiv_Password']")
	By loginbtn = By.xpath("//*[@id='cphMain_LoginCentiv_LoginButton']")

	@Keyword
	public void VerifyLoginPage() {
		try
		{
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("login.aspx")) {
				println ("Login page is verified")
			}
			else{
				throw new Exception("Login page is not verified")
			}
			
		}
		catch(Exception e)
		{
			println ("Verify Login Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void LoginToWSWAdmin(String un,String pwd) {
		try {
			action.Type(username, un)
			action.Type(password, pwd)
			action.Click(loginbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Login To WSWAdmin failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void WSWlogin(String name,String pass) {
		try {
			action.WaitVisible(username)
			action.Type(username, name)
			action.Type(password, pass)
			action.Click(loginbtn)
		}
		catch(Exception e) {
			Assert.fail("WSWlogin failed due to "+e)
		}
	}
}
