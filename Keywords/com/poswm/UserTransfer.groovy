package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class UserTransfer {




	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By transferform = By.xpath("//*[@id='ctl00_MainContent_ddlApproverUser_Arrow']")
	By transferfromddnvalue = By.xpath("//*[@id='ctl00_MainContent_ddlApproverUser_DropDown']//li[1]")
	By transferto = By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_Arrow']")
	By transfertoddnvalue = By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_DropDown']//li[1]")
	By transferitemsbtn = By.xpath("//*[@id='MainContent_btnTransferItems']")	
	By transferFromDropDown = By.xpath("//*[@id='ctl00_MainContent_ddlApproverUser_Arrow']")
	By transferFromUsernameList = By.xpath("//*[@id='ctl00_MainContent_ddlApproverUser_DropDown']/div/ul/li[2]")
	By transferToDropDown = By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_Arrow']")
	By transferToUserNameList = By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_DropDown']/div/ul/li[1]")
	By transferToUtestBox = By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_Input']")
	By transferItemsBtn = By.xpath("//*[@id='MainContent_btnTransferItems']")
	By firstCheckBix = By.xpath("//*[@id='ctl00_MainContent_rgApprovalItems_ctl00']/tbody/tr[1]/td[1]/input")
	By firstItemName = By.xpath("//*[@id='ctl00_MainContent_rgApprovalItems_ctl00']/tbody/tr[1]/td[3]")
	
	
	
	
	
	@Keyword
	public void SelectTransferFromUser()
	{
		try
		{
			action.Click(transferFromDropDown)
			WebUI.delay(3)
			action.Click(transferFromUsernameList)
			WebUI.delay(30)
			
			
		}
		catch(Exception e)
		{
			Assert.fail("SelectTransferFromUser method failed due to :" + e)
		}
	}
	
	
	@Keyword
	public String SelectTransferToUser()
	{
		try
		{
			action.Click(transferToDropDown)
			WebUI.delay(3)
			action.Click(transferToUserNameList)
			WebUI.delay(8)
			String UserName = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlTransferUser_Input']")).getAttribute("value")
			//String UserName = action.GetselectedText(transferToUtestBox)
			//String UserName = action.GetText(transferToUtestBox)
			return UserName
			
			
		}
		catch(Exception e)
		{
			Assert.fail("SelectTransferFromUser method failed due to :" + e)
		}
	}
	
	@Keyword
	public void ClickOnTransferItemsBtn()
	{
		try
		{
			action.Click(transferItemsBtn)
			WebUI.delay(5)
			
			
			
		}
		catch(Exception e)
		{
			Assert.fail("SelectTransferFromUser method failed due to :" + e)
		}
	}
	
	
	@Keyword
	public String SelectFistItem()
	{
		try
		{
			action.Click(firstCheckBix)
			String itemName = action.GetText(firstItemName)
			return itemName
			
		}
		catch(Exception e)
		{
			Assert.fail("SelectFistItem method failed due to :" + e)
		
		}
		
	}
	
		
	@Keyword
	public void VerifyUserItemApprovalTransferPage() {
		try{
			action.VerifyCurrentPage("UserTransfer.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify User Item Approval Transfer Page failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyAllFields()
	{
		try{
			boolean statusoftransferfromddn  = action.IsElementDisplayed(transferform)
			Assert.assertTrue(statusoftransferfromddn)
			WebUI.delay(3)
			action.Click(transferform)
			WebUI.delay(3)
			action.Click(transferfromddnvalue)
			WebUI.delay(3)
			
			boolean statusoffromto = action.IsElementDisplayed(transferto)
			Assert.assertTrue(statusoffromto)
			WebUI.delay(3)
			action.Click(transferto)
			WebUI.delay(3)
			action.Click(transfertoddnvalue)
			WebUI.delay(3)
			
			boolean statusoftransferbtn = action.IsElementEnabled(transferitemsbtn)
			Assert.assertTrue(statusoftransferfromddn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify All Fields failed due to "+ e)
		}
	}
	
	@Keyword
	public void TransferItem()
	{
		try{
			boolean statusoftransferfromddn  = action.IsElementDisplayed(transferform)
			Assert.assertTrue(statusoftransferfromddn)
			WebUI.delay(3)
			action.Click(transferform)
			WebUI.delay(3)
			action.Click(transferfromddnvalue)
			WebUI.delay(3)
			
			boolean statusoffromto = action.IsElementDisplayed(transferto)
			Assert.assertTrue(statusoffromto)
			WebUI.delay(3)
			action.Click(transferto)
			WebUI.delay(3)
			action.Click(transfertoddnvalue)
			WebUI.delay(3)
			
			boolean statusoftransferbtn = action.IsElementEnabled(transferitemsbtn)
			Assert.assertTrue(statusoftransferfromddn)
			
			if(statusoftransferbtn == true)
			{
				action.Click(transferitemsbtn)
				WebUI.delay(5)
			}
		}
		catch(Exception e)
		{
			Assert.fail("Transfer Item failed due to "+ e)
		}
	}
}
