package com.wswadmin

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
//import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

public class FulfillmentSearch {


	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()



	By FulfillmentMenu = By.xpath("(//*[text()='Fulfillment'])[1]")
	By FulfillmentSearchSubMenu = By.xpath("(//*[text()='Fulfillment Search'])[1]")
	By FulfillmentSearchHeader = By.xpath("(//*[text()='Fulfillment - Fulfillment Search'])[1]")
	By CorporationDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By SkuTextField = By.xpath("//*[@id='ctl00_cphMain_txtSku']")
	By ProductName = By.xpath("//*[@id='ctl00_cphMain_txtProductName']")
	By ItemWithoutAProductCheckBox = By.xpath("//*[@id='cphMain_chkWithoutProductUnit']")
	By StatusDropDown = By.xpath("//*[@id='ctl00_cphMain_ddlStatus']")
	By ActiveOption = By.xpath("//*[text()='Active']")
	By InactiveOption = By.xpath("//*[text()='Inactive']")
	By StoreDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentStore']")
	By StoreDropDownValues = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentStore_DropDown']/div/ul/li")
	By FulfillmentTypeDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentType_Input']")
	By FulfillmentTypeOptions = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentType_DropDown']/div/ul/li")
	By SearchButton = By.xpath("//*[@id='cphMain_btnSearch']")
	By ClearSearch = By.xpath("//*[@id='cphMain_btnClearSearch']")
	

































































































}
