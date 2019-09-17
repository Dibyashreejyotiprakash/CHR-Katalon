package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class DashboardMessage {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()





	@Keyword
	public void VerifyWelcomeMessagePage() {

		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/DashboardMessage.aspx";
		String expectedSTAGEUrl ="https://csg.v5qa.brandmuscle.net/Warehouse/Admin/DashboardMessage.aspx"
		String expectedPRODUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/DashboardMessage.aspx";



		String env = GlobalVariable.environment
		WebUI.delay(5)
		String actualUrl = action.GetCurrentURL()
		WebUI.delay(5)

		if(env.equalsIgnoreCase("uat")) {
			WebUI.delay(5)
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("staging")) {
			WebUI.delay(5)
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("prod")) {
			WebUI.delay(5)
			Assert.assertEquals(expectedPRODUrl, actualUrl)
		}
		else {
			println (Assert.fail())
		}
	}
}
