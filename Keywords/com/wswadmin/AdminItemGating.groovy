package com.wswadmin

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
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

public class AdminItemGating {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By corporationDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")
	By distributorDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbDistributor_Input']")
	By AddEditBtn = By.xpath("//*[text()='Add/Edit']")
	By AddEditUserGroupsDropDown = By.xpath("//*[@id='ctl00_cphMain_rWindowAddEditUsers_C_rcbUserGroups_Input']")
	By DemoDistributor_339 = By.xpath("//*[text()=' - Demo Distributor (QA)']")
	By DemoDistMarket_1 = By.xpath("(//*[text()='Demo Dist. Market #1 (QA)'])[1]")
	By administrativeHeader = By.xpath("(//*[text()='Brandmuscle - Administrative Item Gating User Groups'])[1]")
	By availableUsername = By.xpath("//*[text()='Admintest, Admin (demoQA@brandmuscle.com)']")
	//By adminApprovalCheckBox = By.xpath("//*[@id='ctl00_cphMain_rWindowAddEditUsers_C_chkboxAdminGroups_0']")
	By adminApprovalCheckBox = By.xpath("//*[@id='ctl00_cphMain_rWindowAddEditUsers_C_chkboxAdminGroups']/tbody/tr[1]/td/input")
	By approvalCheckBox = By.xpath("//*[@id='ctl00_cphMain_rWindowAddEditUsers_C_chkboxAdminGroups_1']")
	//By approvalCheckBox = By.xpath("(//*[text()='Approval'])[1]")
	By saveBtn = By.xpath("//*[@id='ctl00_cphMain_rWindowAddEditUsers_C_rbtnSave']")







	@Keyword
	public void SelectAdminAndAdminApprovalCheckBox() {
		try {
			
			if(action.IsElementSelected(adminApprovalCheckBox))
			{
				println "Admin Approval  Check box already selected"
			}
			else
			{
				action.Click(adminApprovalCheckBox)
				//WebUI.delay(3)
			}
			
			if(action.IsElementSelected(approvalCheckBox))
			{
				println " Approval CheckBox  already selected"
			}
			else
			{
				action.Click(approvalCheckBox)
				//WebUI.delay(3)
			}
			
			
			/*action.Click(adminApprovalCheckBox)
			WebUI.delay(2)
			action.Click(approvalCheckBox)
			WebUI.delay(2)*/
		}
		catch(Exception e) {
			Assert.fail("SelectAdminAndAdminApprovalCheckBox method failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnSaveBtn() {
		try {
			action.Click(saveBtn)
			WebUI.delay(2)
		}
		catch(Exception e) {
			Assert.fail("SelectCorporation method failed due to "+ e)
		}
	}


	//click on add edit button
	@Keyword
	public void ClickOnAddEditButton()
	{
		try
		{
			action.Click(AddEditBtn)
			WebUI.delay(3)
			action.Click(AddEditUserGroupsDropDown)
			WebUI.delay(3)
			//action.Click(availableUsername)
			//action.TypeClear(AddEditUserGroupsDropDown, "demoQA@brandmuscle.com")
			//WebUI.delay(3)
			action.Click(availableUsername)
			WebUI.delay(5)

		}
		catch(Exception e)
		{
			Assert.fail("SelectCorporation method failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAdministrativeItemGatingUserGroups()
	{
		try
		{

			String actualHeader = "Brandmuscle - Administrative Item Gating User Groups"
			String expectedHeader = action.GetText(administrativeHeader)
			WebUI.delay(3)
			if(expectedHeader.equals(actualHeader))
			{
				println("************" + expectedHeader + "page varified successfully"+ "***************")
			}


		}
		catch(Exception e)
		{
			Assert.fail("VerifyAdministrativeItemGatingUserGroups method failed due to "+ e)
		}
	}

	//Select corporation
	@Keyword
	public void SelectCorporation()
	{
		try
		{
			action.Click(corporationDropDown)
			WebUI.delay(3)
			action.TypeClear(corporationDropDown, "339")
			WebUI.delay(3)
			action.Click(DemoDistributor_339)
			WebUI.delay(5)

		}
		catch(Exception e)
		{
			Assert.fail("SelectCorporation method failed due to "+ e)
		}
	}
	//select distributor
	@Keyword
	public void SelectDistributor()
	{
		try
		{
			action.Click(distributorDropDown)
			WebUI.delay(3)
			action.TypeClear(distributorDropDown, "Demo Dist. Market #1 (QA)")
			WebUI.delay(3)
			action.Click(DemoDistMarket_1)
			WebUI.delay(5)

		}
		catch(Exception e)
		{
			Assert.fail("SelectCorporation method failed due to "+ e)
		}
	}




































}
