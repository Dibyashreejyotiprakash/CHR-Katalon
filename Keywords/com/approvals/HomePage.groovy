package com.approvals

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
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory


public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By searchjob = By.xpath("//*[text()='Search Jobs']")
	By myaccount = By.xpath("//*[text()='My Account']")
	By logout = By.xpath("//*[text()='Logout']")

	By statusddn = By.xpath("//*[@id='ctl00_cphBody_ddlStatus']")
	By accouttypeddn = By.xpath("//*[@id='ctl00_cphBody_ddlAccountType']")
	By campaignddn = By.xpath("//*[@id='ctl00_cphBody_ddlCampaign']")
	By salespersonddn = By.xpath("//*[@id='ctl00_cphBody_ddlSalesPerson']")

	By searchbtn = By.xpath("//*[@id='ctl00_cphBody_btnSearchDtId']")
	By resetbtn = By.xpath("//*[@id='ctl00_cphBody_btnResetSearch']")

	By dtsearchtextbox = By.xpath("//*[@id='ctl00_cphBody_txtDtSearch']")
	By accounttextbox = By.xpath("//*[@id='ctl00_cphBody_txtAccount']")
	By accountname = By.xpath("//*[@id='ctl00_cphBody_txtAccountName']")
	
	By searchjoblink = By.xpath("//*[@id='ctl00_tab1']")
	By reportslink = By.xpath("//*[@id='ctl00_tab2']")
	By myaccountlink = By.xpath("//*[@id='ctl00_cphLoginStatus_lvPassword_tab4']")
	By changepwd = By.xpath("//*[@id='ctl00_cphLoginStatus_lvPassword_tab5']")

	@Keyword
	public void VerifyApprovalsHomePage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("Default.aspx")) {
				println ("Page is verified")
			}
			else {
				throw new Exception("Verify Approval Home Page ")
			}
		}
		catch(Exception e) {
			println ("Home page verified failed due to "+ e)
			Assert.fail()
		}
	}
	
	

	@Keyword
	public void VerifySearchDTJob(String dtnumber) {
		try {
			action.Type(dtsearchtextbox,dtnumber)
			WebUI.delay(10)
		}
		catch(Exception e) {
			println ("Verify Search DT Job failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void ApprovalLogout()
	{
		try
		{
			action.Click(logout)
			action.WaitForPageToLoad()
			
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("login.aspx")) {
				println ("Login Page is verified")
			}
			else {
				throw new Exception("Verify Approval Logout Page failed")
			}
		}
		catch(Exception e)
		{
			println ("Approval logout failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void VerifyAllLinksInHomePage()
	{
		try {
			boolean statusofsearchjoblink = action.IsDisplayed(searchjob)
			Assert.assertTrue(searchjoblink)
			
			boolean statusofreportslink = action.IsElementDisplayed(reportslink)
			Assert.assertTrue(statusofreportslink)
			
			boolean statusofmyaccount = action.IsElementDisplayed(myaccountlink)
			Assert.assertTrue(statusofmyaccount)
			
			boolean stausoflogout = action.IsElementDisplayed(logout)
			Assert.assertTrue(stausoflogout)
			
		}
		catch(Exception e) {
			println ("Verify All Fields In Home Page failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void ClickOnChangePassword()
	{
		try
		{
			action.MouseHoverOnElement(myaccountlink)
			action.Click(changepwd)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("Click On Change Password failed due to "+ e)
			Assert.fail()
		}
	}
}
