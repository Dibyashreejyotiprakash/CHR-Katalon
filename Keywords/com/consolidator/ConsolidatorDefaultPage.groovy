package com.consolidator

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


public class ConsolidatorDefaultPage {


	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	@Keyword
	public void ClickOnManagePrograms() {
		try {
			String env = GlobalVariable.environment
			if (env.equalsIgnoreCase("UAT")) {
				action.GoToURL("https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("STAGING")) {
				action.GoToURL("https://admintool.v5stage.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("DEV")) {
				action.GoToURL("https://admintool.v5dev.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("PROD")) {
				action.GoToURL("https://admintool.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx");
				action.WaitForPageToLoad();
			}
		}
		catch (Exception e) {
			println ("Click On Manage Address failed due to " + e);
			throw e;
		}
	}
	
	@Keyword
	public void ClickOnManageBaseElement()
	{
		try {
			String env = GlobalVariable.environment
			if (env.equalsIgnoreCase("UAT")) {
				action.GoToURL("https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/ConsolidatorManageBaseElement.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("STAGING")) {
				action.GoToURL("https://admintool.v5stage.brandmuscle.net/Admin/Consolidator/ConsolidatorManageBaseElement.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("DEV")) {
				action.GoToURL("https://admintool.v5dev.brandmuscle.net/Admin/Consolidator/ConsolidatorManageBaseElement.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("PROD")) {
				action.GoToURL("https://admintool.brandmuscle.net/Admin/Consolidator/ConsolidatorManageBaseElement.aspx");
				action.WaitForPageToLoad();
			}
		}
		catch (Exception e) {
			println ("Click On Manage Address failed due to " + e);
			throw e;
		}
	}
}
