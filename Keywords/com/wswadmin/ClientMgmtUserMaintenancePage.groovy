package com.wswadmin

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

import org.testng.Assert

public class ClientMgmtUserMaintenancePage {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()

	By clientMgmtTab = By.xpath("//span[contains(text(),'Client Management')]")
	By UserMainTab = By.xpath("//span[@class='rmText'][contains(text(),'User Maintenance')]")
	By toggelUserBtn = By.xpath("//span[@id='ctl00_ctl00_cphMain_cphMain_RadDock1_C_btnUserType']")

	//Existing user locators
	By userNameTxtBox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_RadDock1_C_rsbUsers_Input']")
	By firstUserInList = By.xpath("//li[contains(text(),'testadmin1@brandmuscle.com')]")
	By updateUserBtn = By.xpath("//span[contains(text(),'Update User')]")
	By userAlreadyExistingMsg = By.xpath("//div[contains(text(),'exists on our records, status active')]")
	By successPwdChangeMsg = By.xpath("//div[contains(text(),'Successfully unlocked')]")


	//New user locators
	By newUsernameTxtBox = By.xpath("//input[@id='txtUserName']")
	By pwdTxtBox = By.xpath("//input[@id='txtPassword']")
	By applicationddn = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_RadDock1_C_rcmbApplications_Arrow']")
	By proofGalleryCheckBox = By.xpath("//label[contains(text(),'Proof Gallery')]")
	By businessUnitddn = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_RadDock1_C_rcmbBusinessUnits_Arrow']")
	By businessCheckBox = By.xpath("//label[contains(text(),'0 - Default Business Unit')]")
	By createUserBtn = By.xpath("//span[contains(text(),'Create User')]")
	By newUserAddedSuccessfullyMsg = By.xpath("//div[contains(text(),'Successfully added')]")


	@Keyword
	public void VerifyUserMaintenancePage() {

		action.MouseHoverOnElement(clientMgmtTab)
		action.Click(UserMainTab)
		action.VerifyCurrentPage("/ClientManagement/UserMaintenance.aspx")
	}

	@Keyword
	public void VerifyExistingUserDetails() {

		action.Type(userNameTxtBox, "testadmin1@")
		action.Click(firstUserInList)
		boolean statusofUpdateUserBtn = action.IsElementDisplayed(updateUserBtn)
		Assert.assertTrue(statusofUpdateUserBtn)
		boolean statusofUserAlreadyExistingMsg = action.IsElementEnabled(userAlreadyExistingMsg)
		Assert.assertTrue(statusofUserAlreadyExistingMsg)
	}

	@Keyword
	public void VerifyPwdChangeForExistingUser() {

		action.Type(userNameTxtBox, "testadmin1@")
		action.Click(firstUserInList)
		Assert.assertTrue(action.IsElementEnabled(userAlreadyExistingMsg))
		action.Type(pwdTxtBox,"password")
		action.Click(updateUserBtn)
		Assert.assertTrue(action.IsElementEnabled(successPwdChangeMsg))
	}

	@Keyword
	public String VerifyCreatingAndValidatingLoginWithNewUser() {

		action.Click(toggelUserBtn)
		String un = "Test"+action.GenerateRandomAplphabaNeumericString(5);
		action.WaitVisible(newUsernameTxtBox)
		action.Type(newUsernameTxtBox, un)
		action.Type(pwdTxtBox,"password")
		action.Click(applicationddn)
		action.WaitVisible(proofGalleryCheckBox)
		action.Click(proofGalleryCheckBox)
		WebUI.delay(10)
		action.Click(businessUnitddn)
		action.WaitVisible(businessCheckBox)
		action.Click(businessCheckBox)
		action.Click(createUserBtn)
		Assert.assertTrue(action.IsElementEnabled(newUserAddedSuccessfullyMsg))
		return un;
	}
}
