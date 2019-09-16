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


public class WarehouseAdminItemProperty 
{
	 Interaction action = new Interaction();
	 WebDriver driver = DriverFactory.getWebDriver()
	 
	 By itempropertydropdown = By.xpath("//input[@id='ctl00_MainContent_ddlTypes_Input']")
	 By seasonaltype = By.xpath("//li[contains(text(),'SeasonalType')]")
	 By addnewpropertyplus = By.xpath("//input[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl00_AddNewRecordButton']")
	 By newpropertyname = By.xpath("//input[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_TB_SearchPropertyOptionValue']")
	 By insertbtn = By.xpath("//a[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_PerformInsertButton']")
	 By insertsuccessmssg = By.xpath("//span[@id='MainContent_msgPanel_lblSummary']")
	 By itempropertysearch = By.xpath("//input[@id='ctl00_MainContent_txtSearch']")
	 By searchbtn = By.xpath("//input[@id='ctl00_MainContent_btnSearch_input']")
	 By clearbtn = By.xpath("//input[@id='ctl00_MainContent_btnClear_input']")
	 By addedpropertyname = By.xpath("//tr[@id='ctl00_MainContent_rgAdminTypes_ctl00__0']/td[3]")
	 By editbtn = By.xpath("//a[contains(text(),'Edit')]")
}
