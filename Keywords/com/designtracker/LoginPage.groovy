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
import org.testng.Assert

import internal.GlobalVariable


import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory

public class LoginPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By username = By.id("ctl00_cphMain_LoginCentiv_UserName");
	By password = By.id("ctl00_cphMain_LoginCentiv_Password");
	By loginbtn = By.id("ctl00_cphMain_LoginCentiv_LoginButton");

	@Keyword
	public void LoginToDesignTarcker(String txtusername,String txtpassword) {

		try{
			action.Type(username, txtusername)
			action.Type(password, txtpassword)
			action.WaitVisible(loginbtn)
			action.Click(loginbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Login To Design Tarcker failed due to "+ e)
		}
	}
}
