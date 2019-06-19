package com.iiusersites

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

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.utilities.Interactions

public class LoginPage1 {

	WebDriver driver = DriverFactory.getWebDriver();
	Interactions action = new Interactions();

	By username = By.id("UserName");
	By password= By.id("Password");
	By loginbtn = By.id("btnLogin");

	@Keyword
	def ii4Login() {
		action.Type(username, "diageoadmin@centiv.com");
		action.Type(password, "go2web");
		action.Click(loginbtn);
	}
}
