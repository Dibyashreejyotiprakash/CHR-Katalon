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
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory


public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By searchjob = By.xpath("//*[text()='Search Jobs']")
	By myaccount = By.xpath("//*[text()='My Account']")
	By logout = By.xpath("//*[text()='Logout']")

	By statusddn = By.xpath("//*[@id='ctl00_cphBody_ddlStatus']")
	By createdstatus = By.xpath("//*[@id='ctl00_cphBody_ddlStatus_DropDown']//li[text()='Created']")
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

	By alldtjobid = By.xpath("//*[@id='ctl00_cphBody_gvDesignsBySalesPerson']//tr//td//a")

	By currentpassword = By.xpath("//*[@id='CurrentPassword']")
	By newpassword = By.xpath("//*[@id='NewPassword']")
	By confirmpassword = By.xpath("//*[@id='ConfirmNewPassword']")
	By newpasswordsubmitbtn = By.xpath("//*[@id='ctl00_cphBody_passChange_ChangePasswordContainerID_ChangePasswordPushButton']")

	
	@Keyword
	public void VerifyApprovalHomePage() {
		try {
			action.VerifyCurrentPage("brandmuscle")
		}
		catch(Exception e) {
			println ("Verify Approval Home Page failed due to "+e)
			Assert.fail()
		}
	}



	@Keyword
	public void VerifySearchByDTJob(String dtjobid) {
		try {
			action.Type(dtsearchtextbox,dtjobid)
			WebUI.delay(5)
			action.Click(searchbtn)
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Verify Search DT Job failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ApprovalLogout() {
		try {
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
		catch(Exception e) {
			println ("Approval logout failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllLinksInHomePage() {
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
	public void ClickOnChangePassword() {
		try {
			action.MouseHoverOnElement(myaccountlink)
			action.Click(changepwd)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Change Password failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySearchByStatus() {
		try {
			action.Click(statusddn)
			WebUI.delay(10)
			action.Click(createdstatus)
			WebUI.delay(10)
			action.Click(searchbtn)
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Verify Search By Status failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyDTJobsAfterSearchByCreatedStatus(String createdjobid) {
		try{
			List<WebElement> alldtjobs = action.GetElements(alldtjobid)
			for(int i=0;i< alldtjobs.size();i++) {
				if(alldtjobs.get(i).getText().contains(createdjobid)) {
					println ("Created Job id in DT found")
				}
				else {
					throw new Exception("Created Job Id not found")
				}
			}
		}
		catch(Exception e) {
			println ("Verify DT Jobs After Search By Created Status failed due to "+ e)
			Assert.fail()
		}
	}
	
	
	@Keyword
	public void VerifyDTJobsAfterSearchBySalesperson() {
		try{
			
			action.SelectByIndex(salespersonddn, 1)
			WebUI.delay(10)
			action.Click(searchbtn)
			WebUI.delay(5)
			List<WebElement> alldtjobs = action.GetElements(alldtjobid)
			for(int i=0;i< alldtjobs.size();i++) {
				alldtjobs.get(i).click()
				break
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("JobDetails.aspx")
			}
		}
		catch(Exception e) {
			println ("Verify DT Jobs After Search By Created Status failed due to "+ e)
			Assert.fail()
		}
	}
	

	@Keyword
	public void VerifyCreatedJobDetails() {
		try{

			List<WebElement> alldtjobs = action.GetElements(alldtjobid)
			for(int i=0;i< alldtjobs.size();i++) {
				alldtjobs.get(i).click()
				break
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("JobDetails.aspx")
			}
		}
		catch(Exception e) {
			println ("Verify Created Job Details failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnAccountLink() {
		try {
			action.Click(myaccountlink)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("ChangePassword.aspx")
		}
		catch(Exception e) {
			println ("Click On AccountLink failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFiledsInChangePasswordPage() {
		try{
			boolean statusofcurrentpwdfield = action.IsDisplayed(currentpassword)
			Assert.assertTrue(statusofcurrentpwdfield)

			boolean statusofnewpwdfield = action.IsElementDisplayed(newpassword)
			Assert.assertTrue(statusofnewpwdfield)

			boolean statusofconfirmpwd = action.IsElementDisplayed(confirmpassword)
			Assert.assertTrue(statusofconfirmpwd)

			boolean stausofsubmitbtn = action.IsElementDisplayed(newpasswordsubmitbtn)
			Assert.assertTrue(stausofsubmitbtn)
		}
		catch(Exception e) {
			println ("Verify All Fileds In Change Password Page failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ClickOnReportsButton() {
		try{
			action.Click(reportslink)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Reports.aspx")
		}
		catch(Exception e) {
			println ("Click On Reports Button failed due to "+ e)
			Assert.fail()
		}
	}
}
