package com.couponmaker

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
import internal.GlobalVariable

public class ConfirmationPage {
	
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();
	
	By confirmationno = By.xpath("//*[@id='Body_lblInvoiceNumber']")
	
	
	
	@Keyword
	public void VerifyConfirmationPage()
	{
		try{
			action.VerifyCurrentPage("Confirmation.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Confirmation Page failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public String GetConfirmationNumber()
	{
		String confirmationnumber = null
		try{
			confirmationnumber = action.GetText(confirmationno)
			
			return confirmationnumber
		}
		catch(Exception e)
		{
			println ("Get Confirmation Number failed due to "+ e)
			Assert.fail()
		}
	}
	
	
}
