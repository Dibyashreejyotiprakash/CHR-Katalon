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
import org.openqa.selenium.By
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory

public class NewOrderPage {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	By orderidbutton = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")
	By newitembtn = By.id("ctl00_MainContent_dockItemInformation_C_btnImgItemSearch")
	By firstaddlink = By.xpath("//*[@id='ctl00_MainContent_RadDock2_C_rgItemSearch_ctl00__0']/td[10]//a")
	
	By switchsalesdivision = By.xpath("//*[text()='Switch Sales Division']")
	By selectsalesdivisionddn = By.xpath("//*[text()='Select a sales division...']")
	By salesdivisionddnvalue = By.xpath("//*[text()='ADS - On Premise']")
	
	
	
	@Keyword
	public void ClickOnOrderIdBtn()
	{
		action.Click(orderidbutton)
		action.WaitForPageToLoad()
	}
	
	@Keyword
	public void ClickOnNewItem()
	{
		action.Click(newitembtn)
		action.WaitForPageToLoad()
	}
	
	public void ClickOnFirstAddBtn()
	{
		action.Click(firstaddlink)
	}
	
	
	public void SelectSalesDivision()
	{
		action.Click(switchsalesdivision)
		action.Click(selectsalesdivisionddn)
		action.Click(salesdivisionddnvalue)
		
	}
	
	
	
	
}
