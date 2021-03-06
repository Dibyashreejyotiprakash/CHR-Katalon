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
import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory


public class SiteUsersPage {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By siteusersheader = By.id("ctl00_ctl00_cphMain_cphMain_chAccountType_lblSectionHeader")
	By userddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlUsers']")
	By includecheck = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_chkActiveUsers']")
	By activecheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_acrdnPnlUserProfileManagement_content_chkActive']")
	By updateusersbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_acrdnPnlUserProfileManagement_content_UpdateBtn']")

	@Keyword
	public void VerifySiteUsersPage() {
		action.WaitVisible(siteusersheader)
		boolean statusofsiteuserheader = action.IsElementDisplayed(siteusersheader)
		Assert.assertTrue(statusofsiteuserheader)
	}

	@Keyword
	public void MakeUserActive() {
		boolean usercheckbox = action.IsElementSelected(includecheck)
		Assert.assertTrue(usercheckbox)
		action.Click(includecheck)
		action.SelectByText(userddn, "dibyashree.jyoti@brandmuscle.com")
		boolean activecheckboxstatus = action.IsElementSelected(activecheckbox)
		if(activecheckboxstatus == true) {
			action.ScrollToBottomOfPage()
		}
	}
}
