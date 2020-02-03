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
	By clientReportsTxt = By.xpath("//span[@id='lblreportLabelHeader']")
	By poswReportHeader = By.xpath("//span[@id='lblReportingTabHeader']")
	By reportNameCol = By.xpath("//th[contains(text(),'Report Name')]")
	By descNameCol = By.xpath("//th[contains(text(),'Description')]")
	
	
	@Keyword
	public void VerifyReportsPage() {
		try{
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("/Reporting/Dashboard.aspx"))
			{
				println ("Page URL is correct")
			}
			else
			{
				throw new Exception("Page URL is not correct")
			}
			Assert.assertTrue(action.IsDisplayed(divPOSWReports))
			Assert.assertTrue(action.IsDisplayed(clientReportsTxt))
			Assert.assertTrue(action.IsDisplayed(poswReportHeader))
			Assert.assertTrue(action.IsDisplayed(reportNameCol))
			Assert.assertTrue(action.IsDisplayed(descNameCol))
		}
		catch(Exception e) {
			
			Assert.fail("Verify Reports Page failed due to "+ e)
		}
	}
}
