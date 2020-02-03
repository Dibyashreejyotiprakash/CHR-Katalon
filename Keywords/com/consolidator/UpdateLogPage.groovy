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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class UpdateLogPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By ModulesTab = By.xpath("//*[@class='rmLink rmRootLink']/span[contains(text(),'Modules')]")

	By ConsolidatorTab =  By.xpath("//*[@href='../Consolidator/Default.aspx']")

	By parentbusniessunit = By.xpath("//*[text()='Select Business Unit']")

	By logoutlink = By.xpath("//*[text()='Logout']")


	@Keyword
	public void ClickOnConsolidatorTab() {
		try {
			String env = GlobalVariable.environment
			if (env.equalsIgnoreCase("UAT")) {
				action.GoToURL("https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/Default.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("STAGING")) {
				action.GoToURL("https://admintool.v5stage.brandmuscle.net/Admin/Consolidator/Default.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("DEV")) {
				action.GoToURL("https://admintool.v5dev.brandmuscle.net/Admin/Consolidator/Default.aspx");
				action.WaitForPageToLoad();
			}
			else if (env.equalsIgnoreCase("PROD")) {
				action.GoToURL("https://admintool.brandmuscle.net/Admin/Consolidator/Default.aspx");
				action.WaitForPageToLoad();
			}
		}
		catch(Exception e) {
			println ("Click On Consolidator Tab failed due to " + e);
			throw e;
		}
	}

	@Keyword
	public void ClickOnParentBusinessUnit() {
		action.Click(parentbusniessunit)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnLogout() {
		try {
			action.Click(logoutlink)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Logout failed due to " + e);
			throw e;
		}
	}
}
