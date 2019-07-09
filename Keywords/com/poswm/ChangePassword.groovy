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

public class ChangePassword {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By levelChangePassword = By.xpath("//*[@id='MainContent_lblChangePassword']")




	@Keyword
	public void VerifyChangePasswordPage() {

		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/MyAccount/ChangePassword.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/MyAccount/ChangePassword.aspx"
		String expectedPRODUrl = "https://csg.brandmuscle.net/MyAccount/ChangePassword.aspx";
		String expectedHeader = "Change Password"



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
			//String actualHeaderChangePass = action.GetText(levelChangePassword)
			boolean status= action.IsElementDisplayed(levelChangePassword)
			Assert.assertTrue(status)

		}
		else if(env.equalsIgnoreCase("stage")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
			boolean status= action.IsElementDisplayed(levelChangePassword)
			Assert.assertTrue(status)
		}
		else if(env.equalsIgnoreCase("prod")) {
			Assert.assertEquals(expectedPRODUrl, actualUrl)
			boolean status= action.IsElementDisplayed(levelChangePassword)
			Assert.assertTrue(status)
		}
		else {
			println (Assert.fail())
		}
	}
}
