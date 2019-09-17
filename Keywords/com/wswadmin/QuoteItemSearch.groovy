package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

//import internal.GlobalVariable

public class QuoteItemSearch 
{
	
	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()
	
	
	By mypendingitem = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MyPendingButton_input']")
	By allitemIcreated = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MySubmittedButton_input']")
	By mypendingestimationitem = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MyEstimatorButton_input']")
	By allpendingitem = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_OpenEstimates_input']")
	By allitems = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_AllItemsButton_input']")
	By quoteid = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_QuoteIDSearchBox']")
	By dtjobid = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_DTJobIDSearchBox']")
	By checkallchkbox = By.xpath("//input[@id = '//input[@class = 'rlbCheckAllItemsCheckBox']")
	By performsearch = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_SearchButton_input']")
	By clearbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ClearSearchButton_input']")
	By quoterecord = By.xpath("//a[contains(text(),'230397')]")
	By dtrecord = By.xpath("(//td[contains(text(),'2402881')])[1]")
	
	
	@Keyword
	public void ValidateTimeout()
	{
		
		try
		{
			action.WaitVisible(mypendingitem)
			action.WaitVisible(allitems)
			action.WaitVisible(allpendingitem)
			
			action.Click(mypendingitem)
			WebUI.delay(300)
			
			action.Click(mypendingestimationitem)
			WebUI.delay(300)
			
			action.Click(allpendingitem)
			WebUI.delay(300)
			
			action.Click(clearbtn)
			WebUI.delay(300)
			
			action.Click(quoteid)
			action.Type(quoteid, "230397")
			action.Click(performsearch)
			WebUI.delay(300)
			action.IsElementDisplayed(quoterecord)
			
			action.Click(clearbtn)
			WebUI.delay(300)
			
			action.Click(dtjobid)
			action.Type(dtjobid, "2402881")
			action.Click(performsearch)
			WebUI.delay(300)
			action.IsElementDisplayed(dtrecord)
			
			action.Clear(clearbtn)
			WebUI.delay(300)
			
			action.Click(checkallchkbox)
			action.Click(performsearch)
			WebUI.delay(300)
			
			
			
			
		}
		catch(Exception e)
		{
			Assert.fail("ValidateTimeout Failed Due to "+e)
		}
	}
	
}