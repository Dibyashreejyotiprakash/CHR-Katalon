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

public class FulfillmentCorpDistributerQuantityPreOrderPage
{
	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()











	By corporationDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")
	By corporationName = By.xpath("//*[text()=' - Instant Impact 4.0 Demo Corp (Dist.)']")
	By qtyConstraint = By.xpath("//*[@id='ctl00_cphMain_rcbQuantityConstraint_Input']")
	By perOrderOption = By.xpath("(//*[text()='Per Order'])[1]")
	By perShippingLocation = By.xpath("(//*[text()='Per Shipping Location'])[1]")
	By preOrderDisplayDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbPreOrderDisplay_Input']")
	By separateOption = By.xpath("(//*[text()='Separate (instock on the side)'])[1]")
	By singleAmount = By.xpath("(//*[text()='Single amount (preorder and instock together)'])[1]")
	By firstEditBtn = By.xpath("//*[@id='ctl00_cphMain_rgDistributerList_ctl00_ctl04_lnkDistributerClick']")
	By distQtyConstraintsDDL = By.xpath("//*[@id='ctl00_cphMain_distQuantityConstraint_Input']")
	By DistperOrderOpt = By.xpath("//*[@id='ctl00_cphMain_distQuantityConstraint_DropDown']/div/ul/li[2]")
	By distPerShippingLocation = By.xpath("(//*[text()='Per Shipping Location'])[1]")
	By pre_OrderDisplayDDL = By.xpath("//*[@id='ctl00_cphMain_distPreOrderDisplay_Input']")
	By preOrderFisrtOpt = By.xpath("//*[@id='ctl00_cphMain_distPreOrderDisplay_DropDown']/div/ul/li[1]")
	By preOrderSecondOpt = By.xpath("//*[@id='ctl00_cphMain_distPreOrderDisplay_DropDown']/div/ul/li[2]")
	By updateBtn_2 = By.xpath("//*[@id='cphMain_btnUpdateDistributer']")
	By updateBtn_1 = By.xpath("//*[@id='cphMain_btnUpdateCorp']")






















































}
