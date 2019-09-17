package com.iiadmin1

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

import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

import internal.GlobalVariable

public class HomePage {
		
			WebDriver driver = DriverFactory.getWebDriver()
			Interaction action = new Interaction()
			
			By userName = By.xpath("//input[@id='ctl00_Body_LoginCentiv_UserName']")
			By password = By.xpath("//input[@id='ctl00_Body_LoginCentiv_Password']")
			By loginBtn = By.xpath("//input[@id='ctl00_Body_LoginCentiv_LoginButton']")
			By homeLink = By.xpath("//a[contains(text(),'Home')]")
			By SystemSetupMainTab = By.xpath("//a[@class='ctl00_cphMainMenu_Menu1_1 MainMenuCell ctl00_cphMainMenu_Menu1_3'][contains(text(),'System Setup and Maintenance')]")
			By operationsTab = By.xpath("//a[@class='ctl00_cphMainMenu_Menu1_1 MainMenuCell ctl00_cphMainMenu_Menu1_6'][contains(text(),'Operations')]")
			By shippingAgentTab = By.xpath("//a[contains(text(),'Shipping Agents')]")
			
			By selectAgentddn = By.xpath("//select[@id='ctl00_Body_ddlShippingAgents']")
			
			
		
			@Keyword
			public void LoginToIIAdmin(String un, String pwd) {
				
				action.Type(userName, un)
				action.Type(password, pwd)
				action.Click(loginBtn)
			}
			
			
}
