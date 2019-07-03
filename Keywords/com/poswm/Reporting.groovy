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

public class Reporting {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By subMenuReports = By.xpath("//*[text()='Reports']")
	By werehouseSubMenuList = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']")
	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By divPOSWReports = By.xpath("//*[@id='reportlabelsholderDiv']")








	@Keyword
	public void VerifyReportsPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Reporting/Dashboard.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Reporting/Dashboard.aspx"
		String expectedPRODUrl = "https://csg.brandmuscle.net/Reporting/Dashboard.aspx";

		action.MouseHoverOnElement(menuWarehouse)
		action.WaitVisible(werehouseSubMenuList)
		action.WaitTime(2)

		action.Click(subMenuReports)
		action.WaitForPageToLoad()
		action.WaitVisible(divPOSWReports)

		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("stage")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("prod")) {
			Assert.assertEquals(expectedPRODUrl, actualUrl)
		}
		else {
			println (Assert.fail())
		}
	}
}
