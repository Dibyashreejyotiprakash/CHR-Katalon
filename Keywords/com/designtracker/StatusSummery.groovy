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

public class StatusSummery {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By corporationddn = By.xpath("//select[@id='CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//select[@id='CorpsAndMarkets_ddlMarket']")
	By statusddn = By.xpath("//select[@id='CorpsAndMarkets_ddlJobStatus']")
	By btnViewReport = By.xpath("//*[@id='btnSubmit']")
	By colMarketName = By.xpath("//div[text()='Market Name']")
	By colJobId = By.xpath("//div[text()='Job Id']")

	@Keyword //Verifying job activity tracking page
	public void VerifyStatusSummeryPage(){

		String currentenvironment = GlobalVariable.environment
		try{
			try{
				if(currentenvironment.equalsIgnoreCase("UAT")){
					driver.quit()
				}
				else if(currentenvironment.equalsIgnoreCase("STAGING"))
				{
					driver.quit()
				}
				else{
					println ("****************************************Executing For Production******************************")
					action.SelectByText(corporationddn, "Demo Distributor (QA)")
					action.SelectByText(marketddn, "Demo Dist. 1 QA")
					action.SelectByText(statusddn, "Created")
					action.Click(btnViewReport)
					Assert.assertTrue(action.IsDisplayed(colMarketName),"colMarketName Column is visible")
					Assert.assertTrue(action.IsDisplayed(colJobId), "colJobId Column is visible")

				}
				
			}
			catch(Exception e1){
				throw new Exception("Excetion Terminated")
			}
		}
		catch(Exception e){
			Assert.fail("VerifyStatusSummeryPage failed due to :" + e)
		}
	}

}
