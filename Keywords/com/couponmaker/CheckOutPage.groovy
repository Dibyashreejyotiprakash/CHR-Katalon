package com.couponmaker

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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CheckOutPage {
	
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();
	
	 By dtaccountddn = By.xpath("//*[@id='ctl00_Body_desTrackAccComboBox_Input']")
	 By dtaccountddnvalue= By.xpath("//*[text()='New Account']")
	 By accoutidtextfield = By.xpath("//*[@id='Body_newDesTrackAccTxtBox']")
	 By continuetoreviewbtn = By.xpath("//*[@id='ctl00_Body_bottomContToCheckOutBtn']")
	 
	 @Keyword
	 public void VerifyCheckOutPage()
	 {
		 try
		 {
			 action.VerifyCurrentPage("Checkout.aspx")
		 }
		 catch(Exception e)
		 {
			 println ("Verify Check Out Page Failed due to "+ e)
			 Assert.fail()
		 }
	 }
	 
	 @Keyword
	 public void AddDtAccountAndClickonContinueToReview()
	 {
		 try{
			 action.Click(dtaccountddn)
			 WebUI.delay(10)
			 action.Click(dtaccountddnvalue)
			 WebUI.delay(10)
			 action.Type(accoutidtextfield, "12345")
			 action.Click(continuetoreviewbtn)
		 }
		 catch(Exception e)
		 {
			 println ("Failed due to "+ e)
			 Assert.fail()
		 }
	 }
}
