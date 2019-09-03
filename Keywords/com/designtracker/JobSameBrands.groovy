package com.designtracker

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

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory

public class JobSameBrands {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By headerJobsSameBrands = By.xpath("//div[contains(text(),'Jobs With Matching Brands for Job')]")
	By firstColName = By.xpath("//div[text()='Original Job Line Name']")
	By secondColName = By.xpath("//div[text()='Matched Job ID']")

	@Keyword //Verifying job activity tracking page
	public boolean VerifyJobsSameBrandsReportFields(String jobId){

		try{

			WebUI.delay(8)
			String actualheader = action.GetText(headerJobsSameBrands)
			Assert.assertEquals("Jobs With Matching Brands for Job "+jobId, actualheader)

			Assert.assertTrue(action.IsDisplayed(firstColName),"Column is visible")
			Assert.assertTrue(action.IsDisplayed(secondColName), "Column is visible")

		}
		catch(Exception e){
			println("VerifyJobsSameBrandsReportFields failed due to :" + e)
		}
	}

}
