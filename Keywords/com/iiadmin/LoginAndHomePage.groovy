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
import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Date
import java.time.LocalDateTime
import java.util.Calendar

public class LoginAndHomePage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By username = By.xpath("//input[@id='ctl00_Body_LoginCentiv_UserName']")
	By password = By.xpath("//input[@id='ctl00_Body_LoginCentiv_Password']")
	By login = By.xpath("//input[@id='ctl00_Body_LoginCentiv_LoginButton']")
	By header1 = By.xpath("//span[contains(text(),'Graphics Maintenance')]")
	By corpname = By.xpath("//a[contains(text(),'Corporation Name')]")


	@Keyword
	public void LoginToIiadmin(String usrname,String pswrd) {
		try {
			action.WaitVisible(username)
			action.WaitVisible(password)

			action.Type(username, usrname)
			action.Type(password, pswrd)
			action.Click(login)
			action.WaitVisible(header1)
			action.WaitVisible(corpname)
		}
		catch(Exception e) {
			Assert.fail("LoginToIiadmin Failed due to "+e)
		}
	}
}
