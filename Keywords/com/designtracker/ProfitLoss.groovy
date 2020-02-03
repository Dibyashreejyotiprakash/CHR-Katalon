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

public class ProfitLoss {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By ProfitLossHeader = By.xpath("//div[contains(text(),'Profit/Loss Statement')]")
	By OrderedItemHeader = By.xpath("//div[text() = 'Ordered Items']")
	By SupplierChargeHeader = By.xpath("//div[text() = 'Supplier Charge Backs']")
	By BrandMentionsHeader = By.xpath("//div[text() = 'Brand Mentions']")
	By ItemCopyHeader = By.xpath("//div[text() = 'Item(s) Copy ']")
	By LastThreeJobsHeader = By.xpath("//div[text() = 'Last Three Jobs']")

	@Keyword //Verifying job activity tracking page
	public boolean VerifyProfitLossReportPage(){
		String currentenvironment = GlobalVariable.environment
		try{
			try{
				if(currentenvironment.equals("UAT")){
					driver.quit()
				}
				else if(currentenvironment.equals("STAGE")) {
					driver.quit()
				}
				else{
					Assert.assertTrue(action.IsDisplayed(ProfitLossHeader),"ProfitLossHeader is visible")
					Assert.assertTrue(action.IsDisplayed(OrderedItemHeader),"OrderedItemHeader is visible")
					Assert.assertTrue(action.IsDisplayed(SupplierChargeHeader),"SupplierChargeHeader is visible")
					Assert.assertTrue(action.IsDisplayed(BrandMentionsHeader),"BrandMentionsHeader is visible")
					Assert.assertTrue(action.IsDisplayed(ItemCopyHeader),"ItemCopyHeader is visible")
					Assert.assertTrue(action.IsDisplayed(LastThreeJobsHeader),"LastThreeJobsHeader is visible")
				}
			}catch(Exception e){
				throw new Exception("Excecution is terminated")
			}
		}
		catch(Exception e){
			println("VerifyProfitLossReportPage failed due to :" + e)
		}
	}

}
