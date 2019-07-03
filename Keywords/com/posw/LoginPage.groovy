package com.posw

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
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class LoginPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()




	By txbUserName = By.xpath("//*[@id='MainContent_LoginCentiv_UserName']");
	By txbPassword = By.xpath("//*[@id='MainContent_LoginCentiv_Password']");

	By btnLogin = By.xpath("//*[@id='MainContent_LoginCentiv_btnLogin']");


	@Keyword
	public void EnterCredential(String userName , String password ) {
		action.WaitForPageToLoad();
		action.Type(txbUserName, userName)
		action.WaitTime(2)
		action.Type(txbPassword, password)
	}

	@Keyword
	public void ClickOnLoginButton() {
		action.WaitVisible(btnLogin)
		action.Click(btnLogin)
	}

	@Keyword
	public void LaunchURL() {
		try {
			driver.navigate().to("https://csg.v5qa.brandmuscle.net");
			action.WaitVisible(btnLogin)
		}
		catch(Exception e) {
			println ("LaunchURL failed due to " + e);
		}
	}
}
